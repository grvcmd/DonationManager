package com.CIS3368.DonationManager;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "donation")
public class Donation {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "donorid")
    private UUID donorid;

    @Column(name = "date")
    private String date;

    @Column(name = "itemdescription")
    private String itemdescription;

    @Column(name = "itemvalue")
    private double itemvalue;


    public Donation() {
        super();
    }

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
