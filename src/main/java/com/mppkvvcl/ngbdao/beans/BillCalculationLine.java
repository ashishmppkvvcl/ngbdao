package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.BillCalculationLineInterface;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "BillCalculationLine")
@Table(name = "bill_calculation_line")
public class BillCalculationLine implements BillCalculationLineInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bill_id")
    private long billId;

    @Column(name = "head")
    private String head;

    @Column(name = "unit")
    private String unit;

    @Column(name = "rate")
    private String rate;

    @Column(name = "amount")
    private String amount;

    @Column(name = "start_slab")
    private String startSlab;

    @Column(name = "end_slab")
    private String endSlab;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getBillId() {
        return billId;
    }

    @Override
    public void setBillId(long billId) {
        this.billId = billId;
    }

    @Override
    public String getHead() {
        return head;
    }

    @Override
    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String getAmount() {
        return amount;
    }

    @Override
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String getStartSlab() {
        return startSlab;
    }

    @Override
    public void setStartSlab(String startSlab) {
        this.startSlab = startSlab;
    }

    @Override
    public String getEndSlab() {
        return endSlab;
    }

    @Override
    public void setEndSlab(String endSlab) {
        this.endSlab = endSlab;
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
    public String toString() {
        return "BillCalculationLine{" +
                "id=" + id +
                ", billId=" + billId +
                ", head='" + head + '\'' +
                ", unit='" + unit + '\'' +
                ", rate='" + rate + '\'' +
                ", amount='" + amount + '\'' +
                ", startSlab='" + startSlab + '\'' +
                ", endSlab='" + endSlab + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
