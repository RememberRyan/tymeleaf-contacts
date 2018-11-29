package ee.sdacademy.thymleaf.contacts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ee.sdacademy.thymleaf.contacts.services.ContactService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexPageController {

    @Autowired
    private ContactService contactService;

    // all contacts
    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "index";
    }

    // an individual contact
    @GetMapping("/view")
    public String viewContact(@RequestParam("id") Integer id, Model model){
        model.addAttribute("contact", contactService.get(id));
        return "view";
    }


//    // an individual contact - an alternative methodology of above
//    // MANUALLY put in the url: /view/1
//    @GetMapping("/view/{id}")
//    public String viewContactWithPath(@PathVariable("id") Integer id, Model model){
//        model.addAttribute("contact", contactService.get(id));
//        return "view";
//    }


}
