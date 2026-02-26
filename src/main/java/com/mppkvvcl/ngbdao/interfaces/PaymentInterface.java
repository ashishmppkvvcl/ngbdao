package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface PaymentInterface extends Serializable {

    long getId();

    void setId(long id);

    String getSource();

    void setSource(String source);

    boolean isOnline();

    void setOnline(boolean online);

    String getLocationCode();

    void setLocationCode(String locationCode);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    LocalDateTime getPunchingDate();

    void setPunchingDate(LocalDateTime punchingDate);

    LocalDate getPayDate();

    void setPayDate(LocalDate payDate);

    long getAmount();

    void setAmount(long amount);

    String getPayMode();

    void setPayMode(String payMode);

    String getPayWindow();

    void setPayWindow(String payWindow);

    String getCacNo();

    void setCacNo(String cacNo);

    boolean isDeleted();

    void setDeleted(boolean deleted);

    boolean isPosted();

    void setPosted(boolean posted);

    String getPostingBillMonth();

    void setPostingBillMonth(String postingBillMonth);

    LocalDate getPostingDate();

    void setPostingDate(LocalDate postingDate);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);

}
