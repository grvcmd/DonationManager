package com.CIS3368.DonationManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "donor")
public class Donor {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;
}
