package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ReadMasterInterface extends Serializable {

    String REPLACEMENT_FLAG_NORMAL_READ = "NR";
    String REPLACEMENT_FLAG_FINAL_READ = "FR";
    String REPLACEMENT_FLAG_START_READ = "SR";
    String REPLACEMENT_FLAG_CTR_READ = "CT";
    String REPLACEMENT_FLAG_NEW_CONNECTION = "NC";

    String SOURCE_MANUAL = "MANUAL";
    String SOURCE_FEDCO_SB = "FEDCO_SB";
    String SOURCE_XML_FILE = "XML_FILE";
    String SOURCE_AMR_FILE = "AMR_FILE";
    String SOURCE_PMR_FILE = "PMR_FILE";
    String SOURCE_AMR_READ = "AMR_READ";
    String SOURCE_SMART_METER_READ = "SMART_METER_READ";

    String READING_TYPE_PFL = "PFL";
    String READING_TYPE_NORMAL = "NORMAL";
    String READING_TYPE_ASSESSMENT = "ASSESSMENT";
    String METER_STATUS_WORKING = "WORKING";
    String METER_STATUS_DEFECTIVE = "DEFECTIVE";

    boolean USED_ON_BILL = true;
    boolean NOT_USED_ON_BILL = false;
    String METER_STATUS_METER_RESTART = "METER_RESTART";
    String METER_STATUS_TOD_METER_RESET = "TOD_METER_RESET";

    long getId();

    void setId(long id);

    String getBillMonth();

    void setBillMonth(String billMonth);

    String getGroupNo();

    void setGroupNo(String groupNo);

    String getReadingDiaryNo();

    void setReadingDiaryNo(String readingDiaryNo);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

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

    boolean isUsedOnBill();

    void setUsedOnBill(boolean usedOnBill);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
