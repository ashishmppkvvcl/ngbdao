package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface NetMeteringArrangementInterface extends Serializable {

    String GROUP_TYPE_VNM = "VNM";
    String GROUP_TYPE_GNM = "GNM";

    boolean IS_PARENT_TRUE = true;
    boolean IS_PARENT_FALSE = false;

    long getId();

    void setId(long id);

    long getGroupId();

    void setGroupId(long groupId);

    String getGroupType();

    void setGroupType(String groupType);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    BigDecimal getRatio();

    void setRatio(BigDecimal ratio);

    boolean isParent();

    public void setParent(boolean parent);

    String getStartBillMonth();

    void setStartBillMonth(String startBillMonth);

    String getEndBillMonth();

    void setEndBillMonth(String endBillMonth);

    public String getCreatedBy();

    public void setCreatedBy(String createdBy);

    public LocalDateTime getCreatedOn();

    public void setCreatedOn(LocalDateTime createdOn);

    public String getUpdatedBy();

    public void setUpdatedBy(String updatedBy);

    public LocalDateTime getUpdatedOn();

    public void setUpdatedOn(LocalDateTime updatedOn);
}
