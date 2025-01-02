package ma.raizel.examismailmoufatih.web;

import ma.raizel.examismailmoufatih.dto.SessionDto;
import ma.raizel.examismailmoufatih.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/sessions")
    public String getSessions(Model model) {
        List<SessionDto> sessions = sessionService.getAllSessions();
        model.addAttribute("sessions", sessions);
        return "Sessions";
    }

    @GetMapping("/addSession")
    public String addSessionForm(Model model) {
        model.addAttribute("session", new SessionDto());
        return "addSession";
    }

    @PostMapping("/addSession")
    public String addSession(SessionDto sessionDto, Model model) {
        try {
            sessionService.addSession(sessionDto);
            return "redirect:/sessions";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to add session. Please check the inputs.");
            return "addSession";
        }
    }

    @GetMapping("/sessions/{id}")
    public String getSessionById(@PathVariable Integer id, Model model) {
        SessionDto session = sessionService.getSessionById(id);
        if (session != null) {
            model.addAttribute("session", session);
            return "sessionDetails";
        } else {
            model.addAttribute("errorMessage", "Session not found");
            return "redirect:/sessions";
        }
    }
    @GetMapping("/sessions/edit/{id}")
    public String editSessionForm(@PathVariable Integer id, Model model) {
        SessionDto session = sessionService.getSessionById(id);
        if (session != null) {
            model.addAttribute("session", session);
            return "editSession";  // a new view for editing the session
        } else {
            model.addAttribute("errorMessage", "Session not found");
            return "redirect:/sessions";
        }
    }

    @PostMapping("/sessions/edit/{id}")
    public String updateSession(@PathVariable Integer id, @ModelAttribute SessionDto sessionDto, Model model) {
        try {
            sessionDto.setId(id);  // Ensure the session ID is correctly set
            sessionService.updateSession(sessionDto);
            return "redirect:/sessions";
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to update session. Please check the inputs.");
            return "editSession";
        }
    }

    @GetMapping("/sessions/delete/{id}")
    public String deleteSession(@PathVariable Integer id) {
        try {
            sessionService.deleteSession(id);
            return "redirect:/sessions";
        } catch (Exception e) {
            return "redirect:/sessions?error=Failed to delete session";
        }
    }
}
