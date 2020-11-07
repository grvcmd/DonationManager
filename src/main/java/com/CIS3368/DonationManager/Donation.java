package com.CIS3368.DonationManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Donation {
    private UUID id;
    private UUID donorid;
    private String date;
    private String itemdescription;
    private double itemvalue;

    public Donation() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getDonorid() {
        return donorid;
    }

    public void setDonorid(UUID donorid) {
        this.donorid = donorid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public double getItemvalue() {
        return itemvalue;
    }

    public void setItemvalue(double itemvalue) {
        this.itemvalue = itemvalue;
    }
}
