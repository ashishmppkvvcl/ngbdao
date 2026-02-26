package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.PaymentInterface;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Payment")
@Table(name = "payment")
public class Payment implements PaymentInterface {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "source")
    private String source;

    @Column(name = "is_online")
    private boolean isOnline;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "punching_date")
    private LocalDateTime punchingDate;

    @Column(name = "pay_date")
    private LocalDate payDate;

    @Column(name = "amount")
    private long amount;

    @Column(name = "pay_mode")
    private String payMode;

    @Column(name = "pay_window")
    private String payWindow;

    @Column(name = "cac_no")
    private String cacNo;

    @Column(name = "deleted")
    private boolean deleted;

    @Column(name = "posted")
    private boolean posted;

    @Column(name = "posting_bill_month")
    private String postingBillMonth;

    @Column(name = "posting_date")
    private LocalDate postingDate;

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
    public String getSource() {
        return source;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean isOnline() {
        return isOnline;
    }

    @Override
    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public String getLocationCode() {
        return locationCode;
    }

    @Override
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
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
    public LocalDateTime getPunchingDate() {
        return punchingDate;
    }

    @Override
    public void setPunchingDate(LocalDateTime punchingDate) {
        this.punchingDate = punchingDate;
    }

    @Override
    public LocalDate getPayDate() {
        return payDate;
    }

    @Override
    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

    @Override
    public long getAmount() {
        return amount;
    }

    @Override
    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String getPayMode() {
        return payMode;
    }

    @Override
    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    @Override
    public String getPayWindow() {
        return payWindow;
    }

    @Override
    public void setPayWindow(String payWindow) {
        this.payWindow = payWindow;
    }

    @Override
    public String getCacNo() {
        return cacNo;
    }

    @Override
    public void setCacNo(String cacNo) {
        this.cacNo = cacNo;
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
    public boolean isPosted() {
        return posted;
    }

    @Override
    public void setPosted(boolean posted) {
        this.posted = posted;
    }

    @Override
    public String getPostingBillMonth() {
        return postingBillMonth;
    }

    @Override
    public void setPostingBillMonth(String postingBillMonth) {
        this.postingBillMonth = postingBillMonth;
    }

    @Override
    public LocalDate getPostingDate() {
        return postingDate;
    }

    @Override
    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
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
        return "Payment{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", isOnline=" + isOnline +
                ", locationCode='" + locationCode + '\'' +
                ", consumerNo='" + consumerNo + '\'' +
                ", punchingDate=" + punchingDate +
                ", payDate=" + payDate +
                ", amount=" + amount +
                ", payMode='" + payMode + '\'' +
                ", payWindow='" + payWindow + '\'' +
                ", cacNo='" + cacNo + '\'' +
                ", deleted=" + deleted +
                ", posted=" + posted +
                ", postingBillMonth='" + postingBillMonth + '\'' +
                ", postingDate=" + postingDate +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
