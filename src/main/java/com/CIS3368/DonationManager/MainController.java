package com.CIS3368.DonationManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Controller
public class MainController {
    @Autowired
    private DonationService service;

    @Autowired
    private DonorService donorService;

    // @Autowired
    // private DonorService donorservice;

    // DonationRepository donationRepository;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        // Show list of current donations and donors
        List<Donation> listDonations = service.listAll();
        List<Donor> listDonors = donorService.listAll();
        model.addAttribute("listDonors", listDonors);
        model.addAttribute("listDonations", listDonations);
        return "index";
    }

    @RequestMapping("/new")
    public String showAddDonationForm(Model model) {
        Donation donation = new Donation();
        model.addAttribute("donation", donation);
        return "add_donation";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addDonation(@ModelAttribute("donation") Donation donation) {
        donation.setId(UUID.randomUUID());
        donation.setDate(java.time.LocalDate.now().toString());
        donation.setDonorid(UUID.randomUUID());

        service.save(donation);

        return "redirect:/";
    }

    @RequestMapping("/newdonor")
    public String showAddDonorForm(Model model) {
        Donor donor = new Donor();
        model.addAttribute("donor", donor);
        return "add_donor";
    }

    @RequestMapping(value = "/savedonor", method = RequestMethod.POST)
    public String addDonor(@ModelAttribute("donor") Donor donor) {
        donor.setId(UUID.randomUUID());

        donorService.save(donor);

        return "redirect:/";
    }



    @RequestMapping("/delete/{id}")
    public String deleteDonation(@PathVariable(name = "id") UUID id) {
        service.delete(id);

        return "redirect:/";
    }
}
