package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;

public interface AdjustmentTypeInterface extends Serializable {

    long getId();

    void setId(long id);

    int getCode();

    void setCode(int code);

    String getDetail();

    void setDetail(String detail);

    String getR15Mapping();

    void setR15Mapping(String r15Mapping);

    boolean isEffectOnCurrentBill();

    void setEffectOnCurrentBill(boolean effectOnCurrentBill);

    boolean isView();

    void setView(boolean view);

    boolean isDebit();

    void setDebit(boolean debit);

    boolean isCredit();

    void setCredit(boolean credit);

    long getMinimum();

    void setMinimum(long minimum);

    long getMaximum();

    void setMaximum(long maximum);

    boolean isCash();

    void setCash(boolean cash);

    long getDefaultValue();

    void setDefaultValue(long defaultValue);
}
