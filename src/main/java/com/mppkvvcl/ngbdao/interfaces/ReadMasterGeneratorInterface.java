package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ReadMasterGeneratorInterface extends Serializable {

    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getBillMonth();

    void setBillMonth(String billMonth);

    String getMeterIdentifier();

    void setMeterIdentifier(String meterIdentifier);

    LocalDate getReadingDate();

    void setReadingDate(LocalDate readingDate);

    String getReadingType();

    void setReadingType(String readingType);

    String getMeterStatus();

    void setMeterStatus(String meterStatus);

    String getReplacementFlag();

    void setReplacementFlag(String replacementFlag);

    String getSource();

    void setSource(String source);

    BigDecimal getReading();

    void setReading(BigDecimal reading);

    BigDecimal getDifference();

    void setDifference(BigDecimal difference);

    BigDecimal getMf();

    void setMf(BigDecimal mf);

    BigDecimal getConsumption();

    void setConsumption(BigDecimal consumption);

    BigDecimal getAssessment();

    void setAssessment(BigDecimal assessment);

    BigDecimal getPropagatedAssessment();

    void setPropagatedAssessment(BigDecimal propagatedAssessment);

    BigDecimal getTotalConsumption();

    void setTotalConsumption(BigDecimal totalConsumption);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
