package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.AdjustmentTypeInterface;
import jakarta.persistence.*;

@Entity(name = "AdjustmentType")
@Table(name = "adjustment_type")
public class AdjustmentType implements AdjustmentTypeInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "code")
    private int code;

    @Column(name = "detail")
    private String detail;

    @Column(name = "r15_mapping")
    private String r15Mapping;

    @Column(name = "effect_on_current_bill")
    private boolean effectOnCurrentBill;

    @Column(name = "view")
    private boolean view;

    @Column(name = "debit")
    private boolean debit;

    @Column(name = "credit")
    private boolean credit;

    @Column(name = "minimum")
    private long minimum;

    @Column(name = "maximum")
    private long maximum;

    @Column(name = "is_cash")
    private boolean isCash;

    @Column(name = "default_value")
    private long defaultValue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getR15Mapping() {
        return r15Mapping;
    }

    public void setR15Mapping(String r15Mapping) {
        this.r15Mapping = r15Mapping;
    }

    public boolean isEffectOnCurrentBill() {
        return effectOnCurrentBill;
    }

    public void setEffectOnCurrentBill(boolean effectOnCurrentBill) {
        this.effectOnCurrentBill = effectOnCurrentBill;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public long getMinimum() {
        return minimum;
    }

    public void setMinimum(long minimum) {
        this.minimum = minimum;
    }

    public long getMaximum() {
        return maximum;
    }

    public void setMaximum(long maximum) {
        this.maximum = maximum;
    }

    public boolean isCash() {
        return isCash;
    }

    public void setCash(boolean cash) {
        isCash = cash;
    }

    public long getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(long defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "AdjustmentType{" +
                "id=" + id +
                ", code=" + code +
                ", detail='" + detail + '\'' +
                ", r15Mapping='" + r15Mapping + '\'' +
                ", effectOnCurrentBill=" + effectOnCurrentBill +
                ", view=" + view +
                ", debit=" + debit +
                ", credit=" + credit +
                ", minimum=" + minimum +
                ", maximum=" + maximum +
                ", isCash=" + isCash +
                ", defaultValue=" + defaultValue +
                '}';
    }
}
