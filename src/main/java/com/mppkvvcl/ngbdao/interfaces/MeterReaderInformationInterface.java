package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;

public interface MeterReaderInformationInterface extends Serializable {
    long getId();

    void setId(long id);

    long getZoneId();

    void setZoneId(long zoneId);

    long getReadingDiaryNoId();

    void setReadingDiaryNoId(long readingDiaryNoId);

    String getName();

    void setName(String name);

    String getMobileNo();

    void setMobileNo(String mobileNo);
}
