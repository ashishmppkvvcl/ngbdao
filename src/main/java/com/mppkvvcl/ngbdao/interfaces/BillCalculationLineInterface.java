package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDateTime;

public interface BillCalculationLineInterface extends Serializable {


    long getId();

    void setId(long id);

    long getBillId();

    void setBillId(long billId);

    String getHead();

    void setHead(String head);

    String getUnit();

    void setUnit(String unit);

    String getRate();

    void setRate(String rate);

    String getAmount();

    void setAmount(String amount);

    String getStartSlab();

    void setStartSlab(String startSlab);

    String getEndSlab();

    void setEndSlab(String endSlab);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);
}
