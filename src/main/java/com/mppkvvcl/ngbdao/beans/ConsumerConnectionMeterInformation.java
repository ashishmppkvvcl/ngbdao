package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.ConsumerConnectionMeterInformationInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ConsumerConnectionMeterInformation")
@Table(name = "consumer_connection_meter_information")
public class ConsumerConnectionMeterInformation implements ConsumerConnectionMeterInformationInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "meter_identifier")
    private String meterIdentifier;

    @Column(name = "start_read")
    private BigDecimal startRead;

    @Column(name = "has_ctr")
    private boolean hasCTR;

    @Column(name = "meter_installation_date")
    private LocalDate meterInstallationDate;

    @Column(name = "meter_installer_name")
    private String meterInstallerName;

    @Column(name = "meter_installer_designation")
    private String meterInstallerDesignation;

    @Column(name = "has_modem")
    private boolean hasModem;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    public String getMeterIdentifier() {
        return meterIdentifier;
    }

    public void setMeterIdentifier(String meterIdentifier) {
        this.meterIdentifier = meterIdentifier;
    }

    public BigDecimal getStartRead() {
        return startRead;
    }

    public void setStartRead(BigDecimal startRead) {
        this.startRead = startRead;
    }

    public boolean getHasCTR() {
        return hasCTR;
    }

    public void setHasCTR(boolean hasCTR) {
        this.hasCTR = hasCTR;
    }

    public LocalDate getMeterInstallationDate() {
        return meterInstallationDate;
    }

    public void setMeterInstallationDate(LocalDate meterInstallationDate) {
        this.meterInstallationDate = meterInstallationDate;
    }

    public String getMeterInstallerName() {
        return meterInstallerName;
    }

    public void setMeterInstallerName(String meterInstallerName) {
        this.meterInstallerName = meterInstallerName;
    }

    public String getMeterInstallerDesignation() {
        return meterInstallerDesignation;
    }

    public void setMeterInstallerDesignation(String meterInstallerDesignation) {
        this.meterInstallerDesignation = meterInstallerDesignation;
    }

    public boolean getHasModem() {
        return hasModem;
    }

    public void setHasModem(boolean hasModem) {
        this.hasModem = hasModem;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "ConsumerConnectionMeterInformation{" +
                "id=" + id +
                ", consumerNo='" + consumerNo + '\'' +
                ", meterIdentifier='" + meterIdentifier + '\'' +
                ", startRead=" + startRead +
                ", hasCTR=" + hasCTR +
                ", meterInstallationDate=" + meterInstallationDate +
                ", meterInstallerName='" + meterInstallerName + '\'' +
                ", meterInstallerDesignation='" + meterInstallerDesignation + '\'' +
                ", hasModem=" + hasModem +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
