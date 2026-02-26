package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public interface PanchnamaPaymentInformationInterface extends Serializable {

    long getId();

    void setId(long id);

    long getPaymentId();

    void setPaymentId(long paymentId);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getPanchnamaNo();

    void setPanchnamaNo(String panchnamaNo);

    LocalDate getPanchnamaDate();

    void setPanchnamaDate(LocalDate panchnamaDate);

    LocalDate getPayDate();

    void setPayDate(LocalDate payDate);

    BigDecimal getAmount();

    void setAmount(BigDecimal amount);

    BigDecimal getTotalPaymentAmount();

    void setTotalPaymentAmount(BigDecimal totalPaymentAmount);

    boolean isDeleted();

    void setDeleted(boolean deleted);
}
