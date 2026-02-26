package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface MeterMasterInterface extends Serializable {

    String METER_ATTRIBUTE_SMART = "SMART";

    long getId();

    void setId(long id);

    String getIdentifier();

    void setIdentifier(String identifier);

    String getSerialNo();

    void setSerialNo(String serialNo);

    String getMake();

    void setMake(String make);

    String getMeterOwner();

    void setMeterOwner(String meterOwner);

    String getCapacity();

    void setCapacity(String capacity);

    BigDecimal getMf();

    void setMf(BigDecimal mf);

    String getDescription();

    void setDescription(String description);

    String getPhase();

    void setPhase(String phase);

    String getCode();

    void setCode(String code);

    boolean getIsPrepaid();

    void setIsPrepaid(boolean isPrepaid);

    String getAttribute();

    void setAttribute(String attribute);

    String getHistoryNo();

    void setHistoryNo(String historyNo);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);
}
