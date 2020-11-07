package com.CIS3368.DonationManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DonationService {
    @Autowired
    private DonationRepository repo;

    public List<Donation> listAll() {
        return repo.findAll();
    }

    public void save(Donation donation) {
        repo.save(donation);
    }

    public Donation get(UUID id) {
        return repo.findById(id).get();
    }

    public void delete(UUID id) {
        repo.deleteById(id);
    }
}
