package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.MeterMasterInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "MeterMaster")
@Table(name = "meter_master")
public class MeterMaster implements MeterMasterInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "serial_no")
    private String serialNo;

    @Column(name = "make")
    private String make;

    @Column(name = "meter_owner")
    private String meterOwner;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "mf")
    private BigDecimal mf;

    @Column(name = "description")
    private String description;

    @Column(name = "phase")
    private String phase;

    @Column(name = "code")
    private String code;

    @Column(name = "is_prepaid")
    private boolean isPrepaid;

    @Column(name = "attribute")
    private String attribute;

    @Column(name = "history_no")
    private String historyNo;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMeterOwner() {
        return meterOwner;
    }

    public void setMeterOwner(String meterOwner) {
        this.meterOwner = meterOwner;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public BigDecimal getMf() {
        return mf;
    }

    public void setMf(BigDecimal mf) {
        this.mf = mf;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean getIsPrepaid() {
        return isPrepaid;
    }

    public void setIsPrepaid(boolean isPrepaid) {
        this.isPrepaid = isPrepaid;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getHistoryNo() {
        return historyNo;
    }

    public void setHistoryNo(String historyNo) {
        this.historyNo = historyNo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "MeterMaster{" +
                "id=" + id +
                ", identifier='" + identifier + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", make='" + make + '\'' +
                ", meterOwner='" + meterOwner + '\'' +
                ", capacity='" + capacity + '\'' +
                ", mf=" + mf +
                ", description='" + description + '\'' +
                ", phase='" + phase + '\'' +
                ", code='" + code + '\'' +
                ", isPrepaid=" + isPrepaid +
                ", attribute='" + attribute + '\'' +
                ", historyNo='" + historyNo + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
