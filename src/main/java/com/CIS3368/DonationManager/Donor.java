package com.CIS3368.DonationManager;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "donor")
public class Donor {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    // @OneToOne(cascade = CascadeType.ALL)
    // @PrimaryKeyJoinColumn
    // private Donation donor;

    public Donor() {
        super();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
