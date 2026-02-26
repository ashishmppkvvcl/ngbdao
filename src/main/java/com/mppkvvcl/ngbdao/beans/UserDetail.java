package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.UserDetailInterface;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "UserDetail")
@Table(name = "user_detail")
public class UserDetail implements UserDetailInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "role")
    private String role;

    @Column(name = "name")
    private String name;

    @Column(name = "designation")
    private String designation;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "status")
    private String status;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "otp_mobile_no")
    private String otpMobileNo;

    @Column(name = "identifier")
    private String identifier;

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
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDesignation() {
        return designation;
    }

    @Override
    public void setDesignation(String designation) {
        this.designation = designation;
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
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getMobileNo() {
        return mobileNo;
    }

    @Override
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String getOtpMobileNo() {
        return otpMobileNo;
    }

    @Override
    public void setOtpMobileNo(String otpMobileNo) {
        this.otpMobileNo = otpMobileNo;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
}
