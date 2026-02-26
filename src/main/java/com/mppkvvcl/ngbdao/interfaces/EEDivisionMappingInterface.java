package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;

public interface EEDivisionMappingInterface extends Serializable {

    long getId();

    void setId(long id);

    String getUsername();

    void setUsername(String username);

    long getDivisionId();

    void setDivisionId(long divisionId);
}
