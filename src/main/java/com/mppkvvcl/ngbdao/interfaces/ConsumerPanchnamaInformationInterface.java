package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ConsumerPanchnamaInformationInterface extends Serializable {

    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getPanchnamaNo();

    void setPanchnamaNo(String panchnamaNo);

    LocalDate getPanchnamaDate();

    void setPanchnamaDate(LocalDate panchnamaDate);

    BigDecimal getEnergyCharge();

    void setEnergyCharge(BigDecimal energyCharge);

    BigDecimal getSurchargeDemanded();

    void setSurchargeDemanded(BigDecimal surchargeDemanded);

    BigDecimal getTotalBill();

    void setTotalBill(BigDecimal totalBill);

    BigDecimal getOutstandingAmount();

    void setOutstandingAmount(BigDecimal outstandingAmount);

    boolean isPosted();

    void setPosted(boolean posted);

    boolean isDeleted();

    void setDeleted(boolean deleted);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
