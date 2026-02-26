package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.ConsumerInformationInterface;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "ConsumerInformation")
@Table(name = "consumer_information")
public class ConsumerInformation implements ConsumerInformationInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "consumer_name")
    private String consumerName;

    @Column(name = "consumer_name_h")
    private String consumerNameH;

    @Column(name = "relative_name")
    private String relativeName;

    @Column(name = "relation")
    private String relation;

    @Column(name = "is_bpl")
    private boolean isBPL;

    @Column(name = "category")
    private String category;

    @Column(name = "is_employee")
    private boolean isEmployee;

    @Column(name = "address_1")
    private String address1;

    @Column(name = "address_2")
    private String address2;

    @Column(name = "address_3")
    private String address3;

    @Column(name = "address_1_h")
    private String address1H;

    @Column(name = "address_2_h")
    private String address2H;

    @Column(name = "address_3_h")
    private String address3H;

    @Column(name = "primary_mobile_no")
    private String primaryMobileNo;

    @Column(name = "alternate_mobile_no")
    private String alternateMobileNo;

    @Column(name = "aadhaar_no")
    private String aadhaarNo;

    @Column(name = "pan")
    private String pan;

    @Column(name = "bank_account_no")
    private String bankAccountNo;

    @Column(name = "bank_account_holder_name")
    private String bankAccountHolderName;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "ifsc")
    private String ifsc;

    @Column(name = "email_address")
    private String emailAddress;

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

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerNameH() {
        return consumerNameH;
    }

    public void setConsumerNameH(String consumerNameH) {
        this.consumerNameH = consumerNameH;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public boolean getIsBPL() {
        return isBPL;
    }

    public void setIsBPL(boolean isBPL) {
        this.isBPL = isBPL;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress1H() {
        return address1H;
    }

    public void setAddress1H(String address1H) {
        this.address1H = address1H;
    }

    public String getAddress2H() {
        return address2H;
    }

    public void setAddress2H(String address2H) {
        this.address2H = address2H;
    }

    public String getAddress3H() {
        return address3H;
    }

    public void setAddress3H(String address3H) {
        this.address3H = address3H;
    }

    public String getPrimaryMobileNo() {
        return primaryMobileNo;
    }

    public void setPrimaryMobileNo(String primaryMobileNo) {
        this.primaryMobileNo = primaryMobileNo;
    }

    public String getAlternateMobileNo() {
        return alternateMobileNo;
    }

    public void setAlternateMobileNo(String alternateMobileNo) {
        this.alternateMobileNo = alternateMobileNo;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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

    @Override
    public String toString() {
        return "ConsumerInformation{" +
                "id=" + id +
                ", consumerNo='" + consumerNo + '\'' +
                ", consumerName='" + consumerName + '\'' +
                ", consumerNameH='" + consumerNameH + '\'' +
                ", relativeName='" + relativeName + '\'' +
                ", relation='" + relation + '\'' +
                ", isBPL='" + isBPL + '\'' +
                ", category='" + category + '\'' +
                ", isEmployee='" + isEmployee + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", address1H='" + address1H + '\'' +
                ", address2H='" + address2H + '\'' +
                ", address3H='" + address3H + '\'' +
                ", primaryMobileNo='" + primaryMobileNo + '\'' +
                ", alternateMobileNo='" + alternateMobileNo + '\'' +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ", pan='" + pan + '\'' +
                ", bankAccountNo='" + bankAccountNo + '\'' +
                ", bankAccountHolderName='" + bankAccountHolderName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
