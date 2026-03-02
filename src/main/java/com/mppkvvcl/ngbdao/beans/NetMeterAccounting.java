package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.NetMeterAccountingInterface;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Table(name = "net_meter_accounting")
@Entity(name = "NetMeterAccounting")
public class NetMeterAccounting implements NetMeterAccountingInterface {

    @Id
    @Column(name = "bill_id")
    private long billId;

    @Column(name = "import_unit")
    private BigDecimal importUnit;

    @Column(name = "export_unit")
    private BigDecimal exportUnit;

    @Column(name = "residual_unit")
    private BigDecimal residualUnit;

    @Column(name = "used_export_unit")
    private BigDecimal usedExportUnit;

    @Override
    public long getBillId() {
        return billId;
    }

    @Override
    public void setBillId(long billId) {
        this.billId = billId;
    }

    @Override
    public BigDecimal getImportUnit() {
        return importUnit;
    }

    @Override
    public void setImportUnit(BigDecimal importUnit) {
        this.importUnit = importUnit;
    }

    @Override
    public BigDecimal getExportUnit() {
        return exportUnit;
    }

    @Override
    public void setExportUnit(BigDecimal exportUnit) {
        this.exportUnit = exportUnit;
    }

    @Override
    public BigDecimal getResidualUnit() {
        return residualUnit;
    }

    @Override
    public void setResidualUnit(BigDecimal residualUnit) {
        this.residualUnit = residualUnit;
    }

    @Override
    public BigDecimal getUsedExportUnit() {
        return usedExportUnit;
    }

    @Override
    public void setUsedExportUnit(BigDecimal usedExportUnit) {
        this.usedExportUnit = usedExportUnit;
    }

    @Override
    public String toString() {
        return "NetMeterAccounting{" +
                "billId=" + billId +
                ", importUnit=" + importUnit +
                ", exportUnit=" + exportUnit +
                ", residualUnit=" + residualUnit +
                ", usedExportUnit=" + usedExportUnit +
                '}';
    }
}
