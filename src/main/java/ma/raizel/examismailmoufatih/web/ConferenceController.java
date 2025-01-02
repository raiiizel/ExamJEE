package ma.raizel.examismailmoufatih.web;

import ma.raizel.examismailmoufatih.dto.ConferenceDto;
import ma.raizel.examismailmoufatih.dto.SpeakerDto;
import ma.raizel.examismailmoufatih.service.ConferenceService;
import ma.raizel.examismailmoufatih.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ConferenceController {

    @Autowired
    private ConferenceService conferenceService;

    @Autowired
    private SpeakerService speakerService;

    @GetMapping("/conferences")
    public String getConferences(Model model) {
        List<ConferenceDto> conferences = conferenceService.getAllConferences();
        model.addAttribute("conferences", conferences);
        return "conferences";
    }

    @GetMapping("/addConference")
    public String addConferenceForm(Model model) {
        model.addAttribute("speakers", speakerService.getAllSpeakers());
        model.addAttribute("conference", new ConferenceDto());
        return "addConference";
    }

    @PostMapping("/addConference")
    public String addConference(ConferenceDto conferenceDto,
                                @RequestParam("speaker-id") int speakerId,
                                Model model) {
        try {
            SpeakerDto speaker = speakerService.getSpeakerById(speakerId);
            conferenceDto.setSpeaker(speaker);
            conferenceService.addConference(conferenceDto);
            return "redirect:/conferences";
        } catch (Exception e) {
            model.addAttribute("speakers", speakerService.getAllSpeakers());
            model.addAttribute("errorMessage", "Failed to add conference. Please check the inputs.");
            return "addConference";
        }
    }
    @GetMapping("/conferences/edit/{id}")
    public String editConferenceForm(@PathVariable Integer id, Model model) {
        ConferenceDto conference = conferenceService.getConferenceById(id);
        if (conference != null) {
            model.addAttribute("speakers", speakerService.getAllSpeakers());
            model.addAttribute("conference", conference);
            return "editConference";
        } else {
            model.addAttribute("errorMessage", "Conference not found");
            return "redirect:/conferences";
        }
    }

    // Method to update a conference
    @PostMapping("/conferences/edit/{id}")
    public String updateConference(@PathVariable Integer id,
                                   @ModelAttribute ConferenceDto conferenceDto,
                                   @RequestParam("speaker-id") int speakerId,
                                   Model model) {
        try {
            // Set speaker to the updated conference
            SpeakerDto speaker = speakerService.getSpeakerById(speakerId);
            conferenceDto.setSpeaker(speaker);
            conferenceDto.setId(id);  // Make sure the ID is set for the update
            conferenceService.updateConference(conferenceDto);
            return "redirect:/conferences";
        } catch (Exception e) {
            model.addAttribute("speakers", speakerService.getAllSpeakers());
            model.addAttribute("errorMessage", "Failed to update conference. Please check the inputs.");
            return "editConference";
        }
    }

    // Method to delete a conference
    @GetMapping("/conferences/delete/{id}")
    public String deleteConference(@PathVariable Integer id) {
        try {
            conferenceService.deleteConference(id);
            return "redirect:/conferences";
        } catch (Exception e) {
            return "redirect:/conferences?error=Failed to delete conference";
        }
    }
}
