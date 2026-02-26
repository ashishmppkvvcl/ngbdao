package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.ReadMasterExportTODInterface;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity(name = "ReadMasterExportTOD")
@Table(name = "read_master_export_tod")
public class ReadMasterExportTOD implements ReadMasterExportTODInterface {

    @Id
    @Column(name = "read_master_export_id")
    private long readMasterExportId;

    @Column(name = "tod1_reading")
    private BigDecimal tod1Reading;

    @Column(name = "tod1_difference")
    private BigDecimal tod1Difference;

    @Column(name = "tod1_consumption")
    private BigDecimal tod1Consumption;

    @Column(name = "tod1_assessment")
    private BigDecimal tod1Assessment;

    @Column(name = "tod1_propagated_assessment")
    private BigDecimal tod1PropagatedAssessment;

    @Column(name = "tod1_total_consumption")
    private BigDecimal tod1TotalConsumption;

    @Column(name = "tod2_reading")
    private BigDecimal tod2Reading;

    @Column(name = "tod2_difference")
    private BigDecimal tod2Difference;

    @Column(name = "tod2_consumption")
    private BigDecimal tod2Consumption;

    @Column(name = "tod2_assessment")
    private BigDecimal tod2Assessment;

    @Column(name = "tod2_propagated_assessment")
    private BigDecimal tod2PropagatedAssessment;

    @Column(name = "tod2_total_consumption")
    private BigDecimal tod2TotalConsumption;

    @Column(name = "tod3_reading")
    private BigDecimal tod3Reading;

    @Column(name = "tod3_difference")
    private BigDecimal tod3Difference;

    @Column(name = "tod3_consumption")
    private BigDecimal tod3Consumption;

    @Column(name = "tod3_assessment")
    private BigDecimal tod3Assessment;

    @Column(name = "tod3_propagated_assessment")
    private BigDecimal tod3PropagatedAssessment;

    @Column(name = "tod3_total_consumption")
    private BigDecimal tod3TotalConsumption;

    @Column(name = "tod4_reading")
    private BigDecimal tod4Reading;

    @Column(name = "tod4_difference")
    private BigDecimal tod4Difference;

    @Column(name = "tod4_consumption")
    private BigDecimal tod4Consumption;

    @Column(name = "tod4_assessment")
    private BigDecimal tod4Assessment;

    @Column(name = "tod4_propagated_assessment")
    private BigDecimal tod4PropagatedAssessment;

    @Column(name = "tod4_total_consumption")
    private BigDecimal tod4TotalConsumption;

    @Override
    public long getReadMasterExportId() {
        return readMasterExportId;
    }

    @Override
    public void setReadMasterExportId(long readMasterExportId) {
        this.readMasterExportId = readMasterExportId;
    }

    @Override
    public BigDecimal getTod1Reading() {
        return tod1Reading;
    }

    @Override
    public void setTod1Reading(BigDecimal tod1Reading) {
        this.tod1Reading = tod1Reading;
    }

    @Override
    public BigDecimal getTod1Difference() {
        return tod1Difference;
    }

    @Override
    public void setTod1Difference(BigDecimal tod1Difference) {
        this.tod1Difference = tod1Difference;
    }

    @Override
    public BigDecimal getTod1Consumption() {
        return tod1Consumption;
    }

    @Override
    public void setTod1Consumption(BigDecimal tod1Consumption) {
        this.tod1Consumption = tod1Consumption;
    }

    @Override
    public BigDecimal getTod1Assessment() {
        return tod1Assessment;
    }

    @Override
    public void setTod1Assessment(BigDecimal tod1Assessment) {
        this.tod1Assessment = tod1Assessment;
    }

    @Override
    public BigDecimal getTod1PropagatedAssessment() {
        return tod1PropagatedAssessment;
    }

    @Override
    public void setTod1PropagatedAssessment(BigDecimal tod1PropagatedAssessment) {
        this.tod1PropagatedAssessment = tod1PropagatedAssessment;
    }

    @Override
    public BigDecimal getTod1TotalConsumption() {
        return tod1TotalConsumption;
    }

    @Override
    public void setTod1TotalConsumption(BigDecimal tod1TotalConsumption) {
        this.tod1TotalConsumption = tod1TotalConsumption;
    }

    @Override
    public BigDecimal getTod2Reading() {
        return tod2Reading;
    }

    @Override
    public void setTod2Reading(BigDecimal tod2Reading) {
        this.tod2Reading = tod2Reading;
    }

    @Override
    public BigDecimal getTod2Difference() {
        return tod2Difference;
    }

    @Override
    public void setTod2Difference(BigDecimal tod2Difference) {
        this.tod2Difference = tod2Difference;
    }

    @Override
    public BigDecimal getTod2Consumption() {
        return tod2Consumption;
    }

    @Override
    public void setTod2Consumption(BigDecimal tod2Consumption) {
        this.tod2Consumption = tod2Consumption;
    }

    @Override
    public BigDecimal getTod2Assessment() {
        return tod2Assessment;
    }

    @Override
    public void setTod2Assessment(BigDecimal tod2Assessment) {
        this.tod2Assessment = tod2Assessment;
    }

    @Override
    public BigDecimal getTod2PropagatedAssessment() {
        return tod2PropagatedAssessment;
    }

    @Override
    public void setTod2PropagatedAssessment(BigDecimal tod2PropagatedAssessment) {
        this.tod2PropagatedAssessment = tod2PropagatedAssessment;
    }

    @Override
    public BigDecimal getTod2TotalConsumption() {
        return tod2TotalConsumption;
    }

    @Override
    public void setTod2TotalConsumption(BigDecimal tod2TotalConsumption) {
        this.tod2TotalConsumption = tod2TotalConsumption;
    }

    @Override
    public BigDecimal getTod3Reading() {
        return tod3Reading;
    }

    @Override
    public void setTod3Reading(BigDecimal tod3Reading) {
        this.tod3Reading = tod3Reading;
    }

    @Override
    public BigDecimal getTod3Difference() {
        return tod3Difference;
    }

    @Override
    public void setTod3Difference(BigDecimal tod3Difference) {
        this.tod3Difference = tod3Difference;
    }

    @Override
    public BigDecimal getTod3Consumption() {
        return tod3Consumption;
    }

    @Override
    public void setTod3Consumption(BigDecimal tod3Consumption) {
        this.tod3Consumption = tod3Consumption;
    }

    @Override
    public BigDecimal getTod3Assessment() {
        return tod3Assessment;
    }

    @Override
    public void setTod3Assessment(BigDecimal tod3Assessment) {
        this.tod3Assessment = tod3Assessment;
    }

    @Override
    public BigDecimal getTod3PropagatedAssessment() {
        return tod3PropagatedAssessment;
    }

    @Override
    public void setTod3PropagatedAssessment(BigDecimal tod3PropagatedAssessment) {
        this.tod3PropagatedAssessment = tod3PropagatedAssessment;
    }

    @Override
    public BigDecimal getTod3TotalConsumption() {
        return tod3TotalConsumption;
    }

    @Override
    public void setTod3TotalConsumption(BigDecimal tod3TotalConsumption) {
        this.tod3TotalConsumption = tod3TotalConsumption;
    }

    @Override
    public BigDecimal getTod4Reading() {
        return tod4Reading;
    }

    @Override
    public void setTod4Reading(BigDecimal tod4Reading) {
        this.tod4Reading = tod4Reading;
    }

    @Override
    public BigDecimal getTod4Difference() {
        return tod4Difference;
    }

    @Override
    public void setTod4Difference(BigDecimal tod4Difference) {
        this.tod4Difference = tod4Difference;
    }

    @Override
    public BigDecimal getTod4Consumption() {
        return tod4Consumption;
    }

    @Override
    public void setTod4Consumption(BigDecimal tod4Consumption) {
        this.tod4Consumption = tod4Consumption;
    }

    @Override
    public BigDecimal getTod4Assessment() {
        return tod4Assessment;
    }

    @Override
    public void setTod4Assessment(BigDecimal tod4Assessment) {
        this.tod4Assessment = tod4Assessment;
    }

    @Override
    public BigDecimal getTod4PropagatedAssessment() {
        return tod4PropagatedAssessment;
    }

    @Override
    public void setTod4PropagatedAssessment(BigDecimal tod4PropagatedAssessment) {
        this.tod4PropagatedAssessment = tod4PropagatedAssessment;
    }

    @Override
    public BigDecimal getTod4TotalConsumption() {
        return tod4TotalConsumption;
    }

    @Override
    public void setTod4TotalConsumption(BigDecimal tod4TotalConsumption) {
        this.tod4TotalConsumption = tod4TotalConsumption;
    }

    @Override
    public String toString() {
        return "ReadMasterExportTOD{" +
                "readMasterExportId=" + readMasterExportId +
                ", tod1Reading=" + tod1Reading +
                ", tod1Difference=" + tod1Difference +
                ", tod1Consumption=" + tod1Consumption +
                ", tod1Assessment=" + tod1Assessment +
                ", tod1PropagatedAssessment=" + tod1PropagatedAssessment +
                ", tod1TotalConsumption=" + tod1TotalConsumption +
                ", tod2Reading=" + tod2Reading +
                ", tod2Difference=" + tod2Difference +
                ", tod2Consumption=" + tod2Consumption +
                ", tod2Assessment=" + tod2Assessment +
                ", tod2PropagatedAssessment=" + tod2PropagatedAssessment +
                ", tod2TotalConsumption=" + tod2TotalConsumption +
                ", tod3Reading=" + tod3Reading +
                ", tod3Difference=" + tod3Difference +
                ", tod3Consumption=" + tod3Consumption +
                ", tod3Assessment=" + tod3Assessment +
                ", tod3PropagatedAssessment=" + tod3PropagatedAssessment +
                ", tod3TotalConsumption=" + tod3TotalConsumption +
                ", tod4Reading=" + tod4Reading +
                ", tod4Difference=" + tod4Difference +
                ", tod4Consumption=" + tod4Consumption +
                ", tod4Assessment=" + tod4Assessment +
                ", tod4PropagatedAssessment=" + tod4PropagatedAssessment +
                ", tod4TotalConsumption=" + tod4TotalConsumption +
                '}';
    }
}
