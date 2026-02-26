package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.MeterReaderInformationInterface;
import jakarta.persistence.*;

@Entity(name = "MeterReaderInformation")
@Table(name = "meter_reader_information")
public class MeterReaderInformation implements MeterReaderInformationInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "zone_id")
    private long zoneId;

    @Column(name = "reading_diary_no_id")
    private long readingDiaryNoId;

    @Column(name = "name")
    private String name;

    @Column(name = "mobile_no")
    private String mobileNo;

    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getZoneId() {
        return zoneId;
    }

    @Override
    public void setZoneId(long zoneId) {
        this.zoneId = zoneId;
    }

    @Override
    public long getReadingDiaryNoId() {
        return readingDiaryNoId;
    }

    @Override
    public void setReadingDiaryNoId(long readingDiaryNoId) {
        this.readingDiaryNoId = readingDiaryNoId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMobileNo() {
        return mobileNo;
    }

    @Override
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "MeterReaderInformation{" +
                "id=" + id +
                ", zoneId=" + zoneId +
                ", readingDiaryNoId=" + readingDiaryNoId +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
