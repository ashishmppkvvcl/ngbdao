package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface SecurityDepositInterface extends Serializable {

    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    BigDecimal getAmount();

    void setAmount(BigDecimal amount);

    LocalDate getEffectiveStartDate();

    void setEffectiveStartDate(LocalDate effectiveStartDate);

    LocalDate getEffectiveEndDate();

    void setEffectiveEndDate(LocalDate effectiveEndDate);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
