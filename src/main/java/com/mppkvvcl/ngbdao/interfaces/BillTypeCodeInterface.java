package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;

public interface BillTypeCodeInterface extends Serializable {

    String CODE_LB = "LB";
    String CODE_PDC = "PDC";

    long getId();

    void setId(long id);

    String getCode();

    void setCode(String code);

    String getDescription();

    void setDescription(String description);
}
