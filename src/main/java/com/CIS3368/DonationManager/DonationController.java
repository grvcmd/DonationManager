package com.CIS3368.DonationManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DonationController {
    @Autowired
    private DonationService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        // Show list of current donations
        List<Donation> listDonations = service.listAll();
        model.addAttribute("listDonations", listDonations);

        return "index";
    }

    @RequestMapping("/new")
    public String showAddDonationForm(Model model) {
        Donation donation = new Donation();
        model.addAttribute("donation", donation);

        return "add_donation";
    }
}
