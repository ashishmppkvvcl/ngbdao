package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;

public interface DivisionInterface extends Serializable {
    public long getId();

    public void setId(long id);

    public String getCode();

    public void setCode(String code);

    public String getName();

    public void setName(String name);

    public long getCircleId();

    public void setCircleId(long circleId);
}
