package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.NetMeteringArrangementInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "net_meter_arrangement")
@Entity(name = "NetMeterArrangement")
public class NetMeteringArrangement implements NetMeteringArrangementInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "group_id")
    private long groupId;

    @Column(name = "group_type")
    private String groupType;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "ratio")
    private BigDecimal ratio;

    @Column(name = "is_parent")
    private boolean isParent;

    @Column(name = "start_bill_month")
    private String startBillMonth;

    @Column(name = "end_bill_month")
    private String endBillMonth;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getGroupId() {
        return groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String getGroupType() {
        return groupType;
    }

    @Override
    public void setGroupType(String groupType) {
        this.groupType = groupType;
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
    public BigDecimal getRatio() {
        return ratio;
    }

    @Override
    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    @Override
    public boolean isParent() {
        return isParent;
    }

    @Override
    public void setParent(boolean parent) {
        isParent = parent;
    }

    @Override
    public String getStartBillMonth() {
        return startBillMonth;
    }

    @Override
    public void setStartBillMonth(String startBillMonth) {
        this.startBillMonth = startBillMonth;
    }

    @Override
    public String getEndBillMonth() {
        return endBillMonth;
    }

    @Override
    public void setEndBillMonth(String endBillMonth) {
        this.endBillMonth = endBillMonth;
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
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    @Override
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
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
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    @Override
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "NetMeteringArrangement{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", groupType='" + groupType + '\'' +
                ", consumerNo='" + consumerNo + '\'' +
                ", ratio=" + ratio +
                ", isParent=" + isParent +
                ", startBillMonth='" + startBillMonth + '\'' +
                ", endBillMonth='" + endBillMonth + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
