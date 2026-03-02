package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDateTime;

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

    public String getStartBillMonth();

    public void setStartBillMonth(String startBillMonth);

    public String getEndBillMonth();

    public void setEndBillMonth(String endBillMonth);

    public String getCreatedBy();

    public void setCreatedBy(String createdBy);

    public LocalDateTime getCreatedOn();

    public void setCreatedOn(LocalDateTime createdOn);

    public String getUpdatedBy();

    public void setUpdatedBy(String updatedBy);

    public LocalDateTime getUpdatedOn();

    public void setUpdatedOn(LocalDateTime updatedOn);
}
