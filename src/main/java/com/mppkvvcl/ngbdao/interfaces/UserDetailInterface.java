package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDateTime;

public interface UserDetailInterface extends Serializable {

    String ROLE_EE = "ee";
    String ROLE_OIC = "oic";

    long getId();

    void setId(long id);

    String getUsername();

    void setUsername(String username);

    String getRole();

    void setRole(String role);

    String getName();

    void setName(String name);

    String getDesignation();

    void setDesignation(String designation);

    String getLocationCode();

    void setLocationCode(String locationCode);

    String getStatus();

    void setStatus(String status);

    String getMobileNo();

    void setMobileNo(String mobileNo);

    String getOtpMobileNo();

    void setOtpMobileNo(String otpMobileNo);

    String getIdentifier();

    void setIdentifier(String identifier);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
