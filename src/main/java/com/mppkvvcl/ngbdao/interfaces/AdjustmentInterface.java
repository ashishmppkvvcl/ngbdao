package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface AdjustmentInterface extends Serializable {

    int WHEELING_CHARGES = 30;
    int ADJUSTMENT_CODE_SMART_METER_RC_DC_CHARGE = 121;
    int OTS_SCHEME_CUMULATIVE_SURCHARGE_WAIVER_ADJUSTMENT_CODE = 434;
    int OTS_SCHEME_ARREAR_INSTALLMENT_ADJUSTMENT_CODE = 436;
    int OTS_SCHEME_CUMULATIVE_SURCHARGE_WAIVER_REVERSAL_ADJUSTMENT_CODE = 443;

    long getId();

    void setId(long id);

    int getCode();

    void setCode(int code);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getLocationCode();

    void setLocationCode(String locationCode);

    BigDecimal getAmount();

    void setAmount(BigDecimal amount);

    boolean isPosted();

    void setPosted(boolean posted);

    String getPostingBillMonth();

    void setPostingBillMonth(String postingBillMonth);

    LocalDate getPostingDate();

    void setPostingDate(LocalDate postingDate);

    boolean isDeleted();

    void setDeleted(boolean deleted);

    String getApprovalStatus();

    void setApprovalStatus(String approvalStatus);

    long getRangeId();

    void setRangeId(long rangeId);

    String getCreator();

    void setCreator(String creator);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);

    String getRemark();

    void setRemark(String remark);
}
