package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;

public interface ZoneInterface extends Serializable {
    long getId();

    void setId(long id);

    String getCode();

    void setCode(String code);

    String getName();

    void setName(String name);

    String getShortCode();

    void setShortCode(String shortCode);

    String getAddress();

    void setAddress(String address);

    String getPhoneNo();

    void setPhoneNo(String phoneNo);

    long getDivisionId();

    void setDivisionId(long divisionId);
}
