package com.didenko.technics.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "devices")
@DiscriminatorColumn(name = "device", discriminatorType = DiscriminatorType.STRING)
public abstract class AbstractDevice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "manufact_country")
    private String manufactCountry;

    @Column(name = "company")
    private String company;

    @Column(name = "order_online")
    private boolean orderOnline;

    @Column(name = "payment_installments")
    private boolean paymentInstallments;

    public AbstractDevice() {
    }

    public AbstractDevice(String name, String manufactCountry, String company, boolean orderOnline,
        boolean paymentInstallments) {
        this.name = name;
        this.manufactCountry = manufactCountry;
        this.company = company;
        this.orderOnline = orderOnline;
        this.paymentInstallments = paymentInstallments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactCountry() {
        return manufactCountry;
    }

    public void setManufactCountry(String manufactCountry) {
        this.manufactCountry = manufactCountry;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isOrderOnline() {
        return orderOnline;
    }

    public void setOrderOnline(boolean orderOnline) {
        this.orderOnline = orderOnline;
    }

    public boolean isPaymentInstallments() {
        return paymentInstallments;
    }

    public void setPaymentInstallments(boolean paymentInstallments) {
        this.paymentInstallments = paymentInstallments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractDevice device = (AbstractDevice) o;
        return Objects.equals(name, device.name) && Objects.equals(manufactCountry,
            device.manufactCountry) && Objects.equals(company, device.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufactCountry, company);
    }

}
