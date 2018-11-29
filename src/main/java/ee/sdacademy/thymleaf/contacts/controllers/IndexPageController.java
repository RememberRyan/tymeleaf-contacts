package ee.sdacademy.thymleaf.contacts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ee.sdacademy.thymleaf.contacts.services.ContactService;

@Controller
public class IndexPageController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "index";
    }
}
