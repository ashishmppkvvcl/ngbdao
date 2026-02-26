package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.BillTODInterface;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity(name = "BillTOD")
@Table(name = "bill_tod")
public class BillTOD implements BillTODInterface {

    @Id
    @Column(name = "bill_id")
    private long billId;

    @Column(name = "tod1")
    private BigDecimal tod1;

    @Column(name = "tod2")
    private BigDecimal tod2;

    @Column(name = "tod3")
    private BigDecimal tod3;

    @Column(name = "tod4")
    private BigDecimal tod4;

    @Override
    public long getBillId() {
        return billId;
    }

    @Override
    public void setBillId(long billId) {
        this.billId = billId;
    }

    @Override
    public BigDecimal getTod1() {
        return tod1;
    }

    @Override
    public void setTod1(BigDecimal tod1) {
        this.tod1 = tod1;
    }

    @Override
    public BigDecimal getTod2() {
        return tod2;
    }

    @Override
    public void setTod2(BigDecimal tod2) {
        this.tod2 = tod2;
    }

    @Override
    public BigDecimal getTod3() {
        return tod3;
    }

    @Override
    public void setTod3(BigDecimal tod3) {
        this.tod3 = tod3;
    }

    @Override
    public BigDecimal getTod4() {
        return tod4;
    }

    @Override
    public void setTod4(BigDecimal tod4) {
        this.tod4 = tod4;
    }

    @Override
    public String toString() {
        return "BillTOD{" +
                "billId=" + billId +
                ", tod1=" + tod1 +
                ", tod2=" + tod2 +
                ", tod3=" + tod3 +
                ", tod4=" + tod4 +
                '}';
    }
}