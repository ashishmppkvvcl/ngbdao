package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;

public interface CircleECGRFInformationInterface extends Serializable {

    long getId();

    void setId(long id);

    long getCircleId();

    void setCircleId(long circleId);

    long getIndex();

    void setIndex(long index);

    String getMemberType();

    void setMemberType(String memberType);

    String getName();

    void setName(String name);

    String getContactNo();

    void setContactNo(String contactNo);

    String getCaseHandling();

    void setCaseHandling(String caseHandling);

    String getRemark();

    void setRemark(String remark);
}
