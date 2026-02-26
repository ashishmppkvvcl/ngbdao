package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.AdjustmentInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "adjustment")
@Entity(name = "Adjustment")
public class Adjustment implements AdjustmentInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "code")
    private int code;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "posted")
    private boolean posted;

    @Column(name = "posting_bill_month")
    private String postingBillMonth;

    @Column(name = "posting_date")
    private LocalDate postingDate;

    @Column(name = "deleted")
    private boolean deleted;

    @Column(name = "approval_status")
    private String approvalStatus;

    @Column(name = "range_id")
    private long rangeId;

    @Column(name = "remark")
    private String remark;

    @Column(name = "creator")
    private String creator;

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isPosted() {
        return posted;
    }

    public void setPosted(boolean posted) {
        this.posted = posted;
    }

    public String getPostingBillMonth() {
        return postingBillMonth;
    }

    public void setPostingBillMonth(String postingBillMonth) {
        this.postingBillMonth = postingBillMonth;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public long getRangeId() {
        return rangeId;
    }

    public void setRangeId(long rangeId) {
        this.rangeId = rangeId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Adjustment{" +
                "id=" + id +
                ", code=" + code +
                ", consumerNo='" + consumerNo + '\'' +
                ", locationCode='" + locationCode + '\'' +
                ", amount=" + amount +
                ", posted=" + posted +
                ", postingBillMonth='" + postingBillMonth + '\'' +
                ", postingDate=" + postingDate +
                ", deleted=" + deleted +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", rangeId=" + rangeId +
                ", remark='" + remark + '\'' +
                ", creator='" + creator + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
