package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;

public interface NetMeterAccountingInterface extends Serializable {

    long getBillId();

    void setBillId(long billId);

    BigDecimal getImportUnit();

    void setImportUnit(BigDecimal importUnit);

    BigDecimal getExportUnit();

    void setExportUnit(BigDecimal exportUnit);

    BigDecimal getResidualUnit();

    void setResidualUnit(BigDecimal residualUnit);

    BigDecimal getUsedExportUnit();

    void setUsedExportUnit(BigDecimal usedExportUnit);
}
