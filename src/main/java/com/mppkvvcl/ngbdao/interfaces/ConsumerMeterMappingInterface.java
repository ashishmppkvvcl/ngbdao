package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ConsumerMeterMappingInterface extends Serializable {

    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getMeterIdentifier();

    void setMeterIdentifier(String meterIdentifier);

    String getMeterSerialNo();

    void setMeterSerialNo(String meterSerialNo);

    String getMeterMake();

    void setMeterMake(String meterMake);

    BigDecimal getStartRead();

    void setStartRead(BigDecimal startRead);

    BigDecimal getFinalRead();

    void setFinalRead(BigDecimal finalRead);

    String getMappingStatus();

    void setMappingStatus(String mappingStatus);

    LocalDate getInstallationDate();

    void setInstallationDate(LocalDate installationDate);

    String getInstallationBillMonth();

    void setInstallationBillMonth(String installationBillMonth);

    LocalDate getRemovalDate();

    void setRemovalDate(LocalDate removalDate);

    String getRemovalBillMonth();

    void setRemovalBillMonth(String removalBillMonth);

    String getRemark();

    void setRemark(String remark);

    String getInactiveRemark();

    void setInactiveRemark(String inactiveRemark);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
