package com.example.demo.controller;
import com.example.demo.model.ContactMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactController {

    // Display the contact form page
    @GetMapping("/contact")
    public String showContactForm(Model model) {
        if (!model.containsAttribute("contactMessage")) {
            model.addAttribute("contactMessage", new ContactMessage());
        }

        model.addAttribute("pageTitle", "Contact Me");
        return "portfolio/contact"; // ✅ points to templates/portfolio/contact.html
    }

    // Handle form submission
    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute("contactMessage") ContactMessage contactMessage,
                                    RedirectAttributes redirectAttributes) {

        // Log to console for debugging
        System.out.println("📩 New message from: " + contactMessage.getName());
        System.out.println("Email: " + contactMessage.getEmail());
        System.out.println("Message: " + contactMessage.getMessage());

        redirectAttributes.addFlashAttribute("successMessage",
                "Thank you, " + contactMessage.getName() + "! Your message has been sent successfully.");
        redirectAttributes.addFlashAttribute("contactMessage", new ContactMessage());

        return "redirect:/contact";
    }
}
