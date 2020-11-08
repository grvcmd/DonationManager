package com.CIS3368.DonationManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DonorService {
    @Autowired
    private DonorRepository repo;

    public List<Donor> listAll() {
        return repo.findAll();
    }

    public void save(Donor donor) {
        repo.save(donor);
    }

    public Donor get(UUID id) {
        return repo.findById(id).get();
    }

    public void delete(UUID id) {
        repo.deleteById(id);
    }
}
