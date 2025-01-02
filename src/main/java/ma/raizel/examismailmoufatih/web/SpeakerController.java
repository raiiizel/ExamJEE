package ma.raizel.examismailmoufatih.web;

import ma.raizel.examismailmoufatih.dto.SpeakerDto;
import ma.raizel.examismailmoufatih.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SpeakerController {

    @Autowired
    private SpeakerService speakerService;

    @GetMapping("/speakers")
    public String getSpeakers(Model model) {
        List<SpeakerDto> speakers = speakerService.getAllSpeakers();
        model.addAttribute("speakers", speakers);
        return "speakers";
    }

    @GetMapping("/addSpeaker")
    public String addSpeakerForm(Model model) {
        model.addAttribute("speaker", new SpeakerDto());
        return "addSpeaker";
    }

    @PostMapping("/addSpeaker")
    public String addSpeaker(SpeakerDto speakerDto, Model model) {
        try {
            speakerService.addSpeaker(speakerDto);
            return "redirect:/speakers";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to add speaker. Please check the inputs.");
            return "addSpeaker";
        }
    }
    @GetMapping("/speakers/edit/{id}")
    public String editSpeakerForm(@PathVariable Integer id, Model model) {
        SpeakerDto speaker = speakerService.getSpeakerById(id);
        if (speaker != null) {
            model.addAttribute("speaker", speaker);
            return "editSpeaker";  // a new view for editing the speaker
        } else {
            model.addAttribute("errorMessage", "Speaker not found");
            return "redirect:/speakers";
        }
    }

    @PostMapping("/speakers/edit/{id}")
    public String updateSpeaker(@PathVariable Integer id, @ModelAttribute SpeakerDto speakerDto, Model model) {
        try {
            speakerDto.setId(id);  // Ensure the speaker ID is correctly set
            speakerService.updateSpeaker(speakerDto);
            return "redirect:/speakers";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to update speaker. Please check the inputs.");
            return "editSpeaker";
        }
    }

    @GetMapping("/speakers/delete/{id}")
    public String deleteSpeaker(@PathVariable Integer id) {
        try {
            speakerService.deleteSpeaker(id);
            return "redirect:/speakers";
        } catch (Exception e) {
            return "redirect:/speakers?error=Failed to delete speaker";
        }
    }
}
