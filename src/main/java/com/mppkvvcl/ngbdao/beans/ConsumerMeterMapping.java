package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.ConsumerMeterMappingInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ConsumerMeterMapping")
@Table(name = "consumer_meter_mapping")
public class ConsumerMeterMapping implements ConsumerMeterMappingInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "meter_identifier")
    private String meterIdentifier;

    @Column(name = "meter_serial_no")
    private String meterSerialNo;

    @Column(name = "meter_make")
    private String meterMake;

    @Column(name = "start_read")
    private BigDecimal startRead;

    @Column(name = "final_read")
    private BigDecimal finalRead;

    @Column(name = "mapping_status")
    private String mappingStatus;

    @Column(name = "installation_date")
    private LocalDate installationDate;

    @Column(name = "installation_bill_month")
    private String installationBillMonth;

    @Column(name = "removal_date")
    private LocalDate removalDate;

    @Column(name = "removal_bill_month")
    private String removalBillMonth;

    @Column(name = "remark")
    private String remark;

    @Transient
    private String inactiveRemark;

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
    public String getMeterIdentifier() {
        return meterIdentifier;
    }

    @Override
    public void setMeterIdentifier(String meterIdentifier) {
        this.meterIdentifier = meterIdentifier;
    }

    @Override
    public String getMeterSerialNo() {
        return meterSerialNo;
    }

    @Override
    public void setMeterSerialNo(String meterSerialNo) {
        this.meterSerialNo = meterSerialNo;
    }

    @Override
    public String getMeterMake() {
        return meterMake;
    }

    @Override
    public void setMeterMake(String meterMake) {
        this.meterMake = meterMake;
    }

    @Override
    public BigDecimal getStartRead() {
        return startRead;
    }

    @Override
    public void setStartRead(BigDecimal startRead) {
        this.startRead = startRead;
    }

    @Override
    public BigDecimal getFinalRead() {
        return finalRead;
    }

    @Override
    public void setFinalRead(BigDecimal finalRead) {
        this.finalRead = finalRead;
    }

    @Override
    public String getMappingStatus() {
        return mappingStatus;
    }

    @Override
    public void setMappingStatus(String mappingStatus) {
        this.mappingStatus = mappingStatus;
    }

    @Override
    public LocalDate getInstallationDate() {
        return installationDate;
    }

    @Override
    public void setInstallationDate(LocalDate installationDate) {
        this.installationDate = installationDate;
    }

    @Override
    public String getInstallationBillMonth() {
        return installationBillMonth;
    }

    @Override
    public void setInstallationBillMonth(String installationBillMonth) {
        this.installationBillMonth = installationBillMonth;
    }

    @Override
    public LocalDate getRemovalDate() {
        return removalDate;
    }

    @Override
    public void setRemovalDate(LocalDate removalDate) {
        this.removalDate = removalDate;
    }

    @Override
    public String getRemovalBillMonth() {
        return removalBillMonth;
    }

    @Override
    public void setRemovalBillMonth(String removalBillMonth) {
        this.removalBillMonth = removalBillMonth;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getInactiveRemark() {
        return inactiveRemark;
    }

    @Override
    public void setInactiveRemark(String inactiveRemark) {
        this.inactiveRemark = inactiveRemark;
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
        return "ConsumerMeterMapping{" +
                "id=" + id +
                ", consumerNo='" + consumerNo + '\'' +
                ", meterIdentifier='" + meterIdentifier + '\'' +
                ", meterSerialNo='" + meterSerialNo + '\'' +
                ", meterMake='" + meterMake + '\'' +
                ", startRead=" + startRead +
                ", finalRead=" + finalRead +
                ", mappingStatus='" + mappingStatus + '\'' +
                ", installationDate=" + installationDate +
                ", installationBillMonth='" + installationBillMonth + '\'' +
                ", removalDate=" + removalDate +
                ", removalBillMonth='" + removalBillMonth + '\'' +
                ", remark='" + remark + '\'' +
                ", inactiveRemark='" + inactiveRemark + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
