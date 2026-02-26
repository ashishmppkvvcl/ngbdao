package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.ConsumerPanchnamaInformationInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ConsumerPanchnamaInformation")
@Table(name = "consumer_panchnama_information")
public class ConsumerPanchnamaInformation implements ConsumerPanchnamaInformationInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "panchnama_no")
    private String panchnamaNo;

    @Column(name = "panchnama_date")
    private LocalDate panchnamaDate;

    @Column(name = "energy_charge")
    private BigDecimal energyCharge;

    @Column(name = "surcharge_demanded")
    private BigDecimal surchargeDemanded;

    @Column(name = "total_bill")
    private BigDecimal totalBill;

    @Column(name = "outstanding_amount")
    private BigDecimal outstandingAmount;

    @Column(name = "posted")
    private boolean posted;

    @Column(name = "deleted")
    private boolean deleted;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getConsumerNo() {
        return consumerNo;
    }

    @Override
    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    @Override
    public String getPanchnamaNo() {
        return panchnamaNo;
    }

    @Override
    public void setPanchnamaNo(String panchnamaNo) {
        this.panchnamaNo = panchnamaNo;
    }

    @Override
    public LocalDate getPanchnamaDate() {
        return panchnamaDate;
    }

    @Override
    public void setPanchnamaDate(LocalDate panchnamaDate) {
        this.panchnamaDate = panchnamaDate;
    }

    @Override
    public BigDecimal getEnergyCharge() {
        return energyCharge;
    }

    @Override
    public void setEnergyCharge(BigDecimal energyCharge) {
        this.energyCharge = energyCharge;
    }

    @Override
    public BigDecimal getSurchargeDemanded() {
        return surchargeDemanded;
    }

    @Override
    public void setSurchargeDemanded(BigDecimal surchargeDemanded) {
        this.surchargeDemanded = surchargeDemanded;
    }

    @Override
    public BigDecimal getTotalBill() {
        return totalBill;
    }

    @Override
    public void setTotalBill(BigDecimal totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public BigDecimal getOutstandingAmount() {
        return outstandingAmount;
    }

    @Override
    public void setOutstandingAmount(BigDecimal outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    @Override
    public boolean isPosted() {
        return posted;
    }

    @Override
    public void setPosted(boolean posted) {
        this.posted = posted;
    }

    @Override
    public boolean isDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    @Override
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    @Override
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "ConsumerPanchnamaInformation{" +
                "id=" + id +
                ", consumerNo='" + consumerNo + '\'' +
                ", panchnamaNo='" + panchnamaNo + '\'' +
                ", panchnamaDate=" + panchnamaDate +
                ", energyCharge=" + energyCharge +
                ", surchargeDemanded=" + surchargeDemanded +
                ", totalBill=" + totalBill +
                ", outstandingAmount=" + outstandingAmount +
                ", posted=" + posted +
                ", deleted=" + deleted +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
