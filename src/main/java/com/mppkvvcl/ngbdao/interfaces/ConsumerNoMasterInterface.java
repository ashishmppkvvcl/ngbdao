package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDateTime;

public interface ConsumerNoMasterInterface extends Serializable {

    long getId();

    void setId(long id);

    String getLocationCode();

    void setLocationCode(String locationCode);

    String getGroupNo();

    void setGroupNo(String groupNo);

    String getReadingDiaryNo();

    void setReadingDiaryNo(String readingDiaryNo);

    String getOldReadingDiaryNo();

    void setOldReadingDiaryNo(String oldReadingDiaryNo);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getStatus();

    void setStatus(String status);

    String getOldLocationCode();

    void setOldLocationCode(String oldLocationCode);

    String getOldGroupNo();

    void setOldGroupNo(String oldGroupNo);

    String getOldServiceNoOne();

    void setOldServiceNoOne(String oldServiceNoOne);

    String getOldServiceNoTwo();

    void setOldServiceNoTwo(String oldServiceNoTwo);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
