package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.ReadMasterGeneratorInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ReadMasterGenerator")
@Table(name = "read_master_generator")
public class ReadMasterGenerator implements ReadMasterGeneratorInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "bill_month")
    private String billMonth;

    @Column(name = "meter_identifier")
    private String meterIdentifier;

    @Column(name = "reading_date")
    private LocalDate readingDate;

    @Column(name = "reading_type")
    private String readingType;

    @Column(name = "meter_status")
    private String meterStatus;

    @Column(name = "replacement_flag")
    private String replacementFlag;

    @Column(name = "source")
    private String source;

    @Column(name = "reading")
    private BigDecimal reading;

    @Column(name = "difference")
    private BigDecimal difference;

    @Column(name = "mf")
    private BigDecimal mf;

    @Column(name = "consumption")
    private BigDecimal consumption;

    @Column(name = "assessment")
    private BigDecimal assessment;

    @Column(name = "propagated_assessment")
    private BigDecimal propagatedAssessment;

    @Column(name = "total_consumption")
    private BigDecimal totalConsumption;

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
    public String getBillMonth() {
        return billMonth;
    }

    @Override
    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
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
    public LocalDate getReadingDate() {
        return readingDate;
    }

    @Override
    public void setReadingDate(LocalDate readingDate) {
        this.readingDate = readingDate;
    }

    @Override
    public String getReadingType() {
        return readingType;
    }

    @Override
    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    @Override
    public String getMeterStatus() {
        return meterStatus;
    }

    @Override
    public void setMeterStatus(String meterStatus) {
        this.meterStatus = meterStatus;
    }

    @Override
    public String getReplacementFlag() {
        return replacementFlag;
    }

    @Override
    public void setReplacementFlag(String replacementFlag) {
        this.replacementFlag = replacementFlag;
    }

    @Override
    public String getSource() {
        return source;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public BigDecimal getReading() {
        return reading;
    }

    @Override
    public void setReading(BigDecimal reading) {
        this.reading = reading;
    }

    @Override
    public BigDecimal getDifference() {
        return difference;
    }

    @Override
    public void setDifference(BigDecimal difference) {
        this.difference = difference;
    }

    @Override
    public BigDecimal getMf() {
        return mf;
    }

    @Override
    public void setMf(BigDecimal mf) {
        this.mf = mf;
    }

    @Override
    public BigDecimal getConsumption() {
        return consumption;
    }

    @Override
    public void setConsumption(BigDecimal consumption) {
        this.consumption = consumption;
    }

    @Override
    public BigDecimal getAssessment() {
        return assessment;
    }

    @Override
    public void setAssessment(BigDecimal assessment) {
        this.assessment = assessment;
    }

    @Override
    public BigDecimal getPropagatedAssessment() {
        return propagatedAssessment;
    }

    @Override
    public void setPropagatedAssessment(BigDecimal propagatedAssessment) {
        this.propagatedAssessment = propagatedAssessment;
    }

    @Override
    public BigDecimal getTotalConsumption() {
        return totalConsumption;
    }

    @Override
    public void setTotalConsumption(BigDecimal totalConsumption) {
        this.totalConsumption = totalConsumption;
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
        return "ReadMasterGenerator{" +
                "id=" + id +
                ", consumerNo='" + consumerNo + '\'' +
                ", billMonth='" + billMonth + '\'' +
                ", meterIdentifier='" + meterIdentifier + '\'' +
                ", readingDate=" + readingDate +
                ", readingType='" + readingType + '\'' +
                ", meterStatus='" + meterStatus + '\'' +
                ", replacementFlag='" + replacementFlag + '\'' +
                ", source='" + source + '\'' +
                ", reading=" + reading +
                ", difference=" + difference +
                ", mf=" + mf +
                ", consumption=" + consumption +
                ", assessment=" + assessment +
                ", propagatedAssessment=" + propagatedAssessment +
                ", totalConsumption=" + totalConsumption +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
