package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDateTime;

public interface ConsumerInformationInterface extends Serializable {

    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getConsumerName();

    void setConsumerName(String consumerName);

    String getConsumerNameH();

    void setConsumerNameH(String consumerNameH);

    String getRelativeName();

    void setRelativeName(String relativeName);

    String getRelation();

    void setRelation(String relation);

    boolean getIsBPL();

    void setIsBPL(boolean isBPL);

    String getCategory();

    void setCategory(String category);

    boolean getIsEmployee();

    void setIsEmployee(boolean isEmployee);

    String getAddress1();

    void setAddress1(String address1);

    String getAddress2();

    void setAddress2(String address2);

    String getAddress3();

    void setAddress3(String address3);

    String getAddress1H();

    void setAddress1H(String address1H);

    String getAddress2H();

    void setAddress2H(String address2H);

    String getAddress3H();

    void setAddress3H(String address3H);

    String getPrimaryMobileNo();

    void setPrimaryMobileNo(String primaryMobileNo);

    String getAlternateMobileNo();

    void setAlternateMobileNo(String alternateMobileNo);

    String getAadhaarNo();

    void setAadhaarNo(String aadhaarNo);

    String getPan();

    void setPan(String pan);

    String getBankAccountNo();

    void setBankAccountNo(String bankAccountNo);

    String getBankAccountHolderName();

    void setBankAccountHolderName(String bankAccountHolderName);

    String getBankName();

    void setBankName(String bankName);

    String getIfsc();

    void setIfsc(String ifsc);

    String getEmailAddress();

    void setEmailAddress(String emailAddress);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
