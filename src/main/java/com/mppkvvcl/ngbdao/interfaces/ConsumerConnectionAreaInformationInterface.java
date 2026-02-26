package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ConsumerConnectionAreaInformationInterface extends Serializable {
    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getDtrName();

    void setDtrName(String dtrName);

    String getPoleNo();

    void setPoleNo(String poleNo);

    String getPoleLatitude();

    void setPoleLatitude(String poleLatitude);

    String getPoleLongitude();

    void setPoleLongitude(String poleLongitude);

    String getFeederName();

    void setFeederName(String feederName);

    long getPoleDistance();

    void setPoleDistance(long poleDistance);

    String getAreaStatus();

    void setAreaStatus(String areaStatus);

    String getGroupNo();

    void setGroupNo(String groupNo);

    String getReadingDiaryNo();

    void setReadingDiaryNo(String readingDiaryNo);

    String getNeighbourConnectionNo();

    void setNeighbourConnectionNo(String neighbourConnectionNo);

    LocalDate getSurveyDate();

    void setSurveyDate(LocalDate surveyDate);

    void setCreatedOn(LocalDateTime createdOn);

    LocalDateTime getCreatedOn();

    void setCreatedBy(String createdBy);

    String getCreatedBy();

    void setUpdatedOn(LocalDateTime updatedOn);

    LocalDateTime getUpdatedOn();

    void setUpdatedBy(String updatedBy);

    String getUpdatedBy();
}
