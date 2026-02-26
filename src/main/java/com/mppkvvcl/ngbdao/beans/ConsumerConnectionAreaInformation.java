package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.ConsumerConnectionAreaInformationInterface;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ConsumerConnectionAreaInformation")
@Table(name = "consumer_connection_area_information")
public class ConsumerConnectionAreaInformation implements ConsumerConnectionAreaInformationInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "dtr_name")
    private String dtrName;

    @Column(name = "pole_no")
    private String poleNo;

    @Column(name = "pole_latitude")
    private String poleLatitude;

    @Column(name = "pole_longitude")
    private String poleLongitude;

    @Column(name = "feeder_name")
    private String feederName;

    @Column(name = "pole_distance")
    private long poleDistance;

    @Column(name = "area_status")
    private String areaStatus;

    @Column(name = "group_no")
    private String groupNo;

    @Column(name = "reading_diary_no")
    private String readingDiaryNo;

    @Column(name = "neighbour_connection_no")
    private String neighbourConnectionNo;

    @Column(name = "survey_date")
    private LocalDate surveyDate;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getConsumerNo() {
        return consumerNo;
    }

    @Override
    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    @Override
    public String getDtrName() {
        return dtrName;
    }

    @Override
    public void setDtrName(String dtrName) {
        this.dtrName = dtrName;
    }

    @Override
    public String getPoleNo() {
        return poleNo;
    }

    @Override
    public void setPoleNo(String poleNo) {
        this.poleNo = poleNo;
    }

    @Override
    public String getPoleLatitude() {
        return poleLatitude;
    }

    @Override
    public void setPoleLatitude(String poleLatitude) {
        this.poleLatitude = poleLatitude;
    }

    @Override
    public String getPoleLongitude() {
        return poleLongitude;
    }

    @Override
    public void setPoleLongitude(String poleLongitude) {
        this.poleLongitude = poleLongitude;
    }

    @Override
    public String getFeederName() {
        return feederName;
    }

    @Override
    public void setFeederName(String feederName) {
        this.feederName = feederName;
    }

    @Override
    public long getPoleDistance() {
        return poleDistance;
    }

    @Override
    public void setPoleDistance(long poleDistance) {
        this.poleDistance = poleDistance;
    }

    @Override
    public String getAreaStatus() {
        return areaStatus;
    }

    @Override
    public void setAreaStatus(String areaStatus) {
        this.areaStatus = areaStatus;
    }

    @Override
    public String getGroupNo() {
        return groupNo;
    }

    @Override
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    @Override
    public String getReadingDiaryNo() {
        return readingDiaryNo;
    }

    @Override
    public void setReadingDiaryNo(String readingDiaryNo) {
        this.readingDiaryNo = readingDiaryNo;
    }

    @Override
    public String getNeighbourConnectionNo() {
        return neighbourConnectionNo;
    }

    @Override
    public void setNeighbourConnectionNo(String neighbourConnectionNo) {
        this.neighbourConnectionNo = neighbourConnectionNo;
    }

    @Override
    public LocalDate getSurveyDate() {
        return surveyDate;
    }

    @Override
    public void setSurveyDate(LocalDate surveyDate) {
        this.surveyDate = surveyDate;
    }

    @Override
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    @Override
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    @Override
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "ConsumerConnectionAreaInformation{" +
                "id=" + id +
                ", consumerNo='" + consumerNo + '\'' +
                ", dtrName='" + dtrName + '\'' +
                ", poleNo='" + poleNo + '\'' +
                ", poleLatitude='" + poleLatitude + '\'' +
                ", poleLongitude='" + poleLongitude + '\'' +
                ", feederName='" + feederName + '\'' +
                ", poleDistance=" + poleDistance +
                ", areaStatus='" + areaStatus + '\'' +
                ", groupNo='" + groupNo + '\'' +
                ", readingDiaryNo='" + readingDiaryNo + '\'' +
                ", neighbourConnectionNo='" + neighbourConnectionNo + '\'' +
                ", surveyDate=" + surveyDate +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", updatedOn=" + updatedOn +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
