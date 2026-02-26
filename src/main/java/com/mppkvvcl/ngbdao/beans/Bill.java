package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.BillInterface;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Bill")
@Table(name = "bill")
public class Bill implements BillInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "group_no")
    private String groupNo;

    @Column(name = "reading_diary_no")
    private String readingDiaryNo;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "bill_month")
    private String billMonth;

    @Column(name = "bill_date")
    private LocalDate billDate;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "cheque_due_date")
    private LocalDate chequeDueDate;

    @Column(name = "current_read_date")
    private LocalDate currentReadDate;

    @Column(name = "current_read")
    private BigDecimal currentRead;

    @Column(name = "previous_read")
    private BigDecimal previousRead;

    @Column(name = "difference")
    private BigDecimal difference;

    @Column(name = "mf")
    private BigDecimal mf;

    @Column(name = "metered_unit")
    private BigDecimal meteredUnit;

    @Column(name = "assessment")
    private BigDecimal assessment;

    @Column(name = "total_unit")
    private BigDecimal totalUnit;

    @Column(name = "gmc_unit")
    private BigDecimal gmcUnit;

    @Column(name = "billed_unit")
    private BigDecimal billedUnit;

    @Column(name = "billed_md")
    private BigDecimal billedMD;

    @Column(name = "billed_pf")
    private BigDecimal billedPF;

    @Column(name = "load_factor")
    private BigDecimal loadFactor;

    @Column(name = "fixed_charge")
    private BigDecimal fixedCharge;

    @Column(name = "additional_fixed_charges1")
    private BigDecimal additionalFixedCharges1;

    @Column(name = "additional_fixed_charges2")
    private BigDecimal additionalFixedCharges2;

    @Column(name = "energy_charge")
    private BigDecimal energyCharge;

    @Column(name = "fca_charge")
    private BigDecimal fcaCharge;

    @Column(name = "electricity_duty")
    private BigDecimal electricityDuty;

    @Column(name = "meter_rent")
    private BigDecimal meterRent;

    @Column(name = "pf_charge")
    private BigDecimal pfCharge;

    @Column(name = "welding_transformer_surcharge")
    private BigDecimal weldingTransformerSurcharge;

    @Column(name = "load_factor_incentive")
    private BigDecimal loadFactorIncentive;

    @Column(name = "sd_interest")
    private BigDecimal sdInterest;

    @Column(name = "ccb_adjustment")
    private BigDecimal ccbAdjustment;

    @Column(name = "lock_credit")
    private BigDecimal lockCredit;

    @Column(name = "other_adjustment")
    private BigDecimal otherAdjustment;

    @Column(name = "employee_rebate")
    private BigDecimal employeeRebate;

    @Column(name = "online_payment_rebate")
    private BigDecimal onlinePaymentRebate;

    @Column(name = "prepaid_meter_rebate")
    private BigDecimal prepaidMeterRebate;

    @Column(name = "prompt_payment_incentive")
    private BigDecimal promptPaymentIncentive;

    @Column(name = "advance_payment_incentive")
    private BigDecimal advancePaymentIncentive;

    @Column(name = "demand_side_incentive")
    private BigDecimal demandSideIncentive;

    @Column(name = "subsidy")
    private BigDecimal subsidy;

    @Column(name = "pristine_current_bill")
    private BigDecimal pristineCurrentBill;

    @Column(name = "current_bill")
    private BigDecimal currentBill;

    @Column(name = "arrear")
    private BigDecimal arrear;

    @Column(name = "cumulative_surcharge")
    private BigDecimal cumulativeSurcharge;

    @Column(name = "surcharge_demanded")
    private BigDecimal surchargeDemanded;

    @Column(name = "net_bill")
    private BigDecimal netBill;

    @Column(name = "asd_billed")
    private BigDecimal asdBilled;

    @Column(name = "asd_arrear")
    private BigDecimal asdArrear;

    @Column(name = "asd_installment")
    private BigDecimal asdInstallment;

    @Column(name = "deleted")
    private boolean deleted;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Column(name = "pristine_electricity_duty")
    private BigDecimal pristineElectricityDuty;

    @Column(name = "pristine_net_bill")
    private BigDecimal pristineNetBill;

    @Column(name = "current_bill_surcharge")
    private BigDecimal currentBillSurcharge;

    @Column(name = "bill_type_code")
    private String billTypeCode;

    @Column(name = "xray_fixed_charge")
    private BigDecimal xrayFixedCharge;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getLocationCode() {
        return locationCode;
    }

    @Override
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    @Override
    public String getGroupNo() {
        return groupNo;
    }

    @Override
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    @Override
    public String getReadingDiaryNo() {
        return readingDiaryNo;
    }

    @Override
    public void setReadingDiaryNo(String readingDiaryNo) {
        this.readingDiaryNo = readingDiaryNo;
    }

    @Override
    public String getConsumerNo() {
        return consumerNo;
    }

    @Override
    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    @Override
    public String getBillMonth() {
        return billMonth;
    }

    @Override
    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    @Override
    public LocalDate getBillDate() {
        return billDate;
    }

    @Override
    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    @Override
    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public LocalDate getChequeDueDate() {
        return chequeDueDate;
    }

    @Override
    public void setChequeDueDate(LocalDate chequeDueDate) {
        this.chequeDueDate = chequeDueDate;
    }

    @Override
    public LocalDate getCurrentReadDate() {
        return currentReadDate;
    }

    @Override
    public void setCurrentReadDate(LocalDate currentReadDate) {
        this.currentReadDate = currentReadDate;
    }

    @Override
    public BigDecimal getCurrentRead() {
        return currentRead;
    }

    @Override
    public void setCurrentRead(BigDecimal currentRead) {
        this.currentRead = currentRead;
    }

    @Override
    public BigDecimal getPreviousRead() {
        return previousRead;
    }

    @Override
    public void setPreviousRead(BigDecimal previousRead) {
        this.previousRead = previousRead;
    }

    @Override
    public BigDecimal getDifference() {
        return difference;
    }

    @Override
    public void setDifference(BigDecimal difference) {
        this.difference = difference;
    }

    @Override
    public BigDecimal getMf() {
        return mf;
    }

    @Override
    public void setMf(BigDecimal mf) {
        this.mf = mf;
    }

    @Override
    public BigDecimal getMeteredUnit() {
        return meteredUnit;
    }

    @Override
    public void setMeteredUnit(BigDecimal meteredUnit) {
        this.meteredUnit = meteredUnit;
    }

    @Override
    public BigDecimal getAssessment() {
        return assessment;
    }

    @Override
    public void setAssessment(BigDecimal assessment) {
        this.assessment = assessment;
    }

    @Override
    public BigDecimal getTotalUnit() {
        return totalUnit;
    }

    @Override
    public void setTotalUnit(BigDecimal totalUnit) {
        this.totalUnit = totalUnit;
    }

    @Override
    public BigDecimal getGmcUnit() {
        return gmcUnit;
    }

    @Override
    public void setGmcUnit(BigDecimal gmcUnit) {
        this.gmcUnit = gmcUnit;
    }

    @Override
    public BigDecimal getBilledUnit() {
        return billedUnit;
    }

    @Override
    public void setBilledUnit(BigDecimal billedUnit) {
        this.billedUnit = billedUnit;
    }

    @Override
    public BigDecimal getBilledMD() {
        return billedMD;
    }

    @Override
    public void setBilledMD(BigDecimal billedMD) {
        this.billedMD = billedMD;
    }

    @Override
    public BigDecimal getBilledPF() {
        return billedPF;
    }

    @Override
    public void setBilledPF(BigDecimal billedPF) {
        this.billedPF = billedPF;
    }

    @Override
    public BigDecimal getLoadFactor() {
        return loadFactor;
    }

    @Override
    public void setLoadFactor(BigDecimal loadFactor) {
        this.loadFactor = loadFactor;
    }

    @Override
    public BigDecimal getFixedCharge() {
        return fixedCharge;
    }

    @Override
    public void setFixedCharge(BigDecimal fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    @Override
    public BigDecimal getAdditionalFixedCharges1() {
        return additionalFixedCharges1;
    }

    @Override
    public void setAdditionalFixedCharges1(BigDecimal additionalFixedCharges1) {
        this.additionalFixedCharges1 = additionalFixedCharges1;
    }

    @Override
    public BigDecimal getAdditionalFixedCharges2() {
        return additionalFixedCharges2;
    }

    @Override
    public void setAdditionalFixedCharges2(BigDecimal additionalFixedCharges2) {
        this.additionalFixedCharges2 = additionalFixedCharges2;
    }

    @Override
    public BigDecimal getEnergyCharge() {
        return energyCharge;
    }

    @Override
    public void setEnergyCharge(BigDecimal energyCharge) {
        this.energyCharge = energyCharge;
    }

    @Override
    public BigDecimal getFcaCharge() {
        return fcaCharge;
    }

    @Override
    public void setFcaCharge(BigDecimal fcaCharge) {
        this.fcaCharge = fcaCharge;
    }

    @Override
    public BigDecimal getElectricityDuty() {
        return electricityDuty;
    }

    @Override
    public void setElectricityDuty(BigDecimal electricityDuty) {
        this.electricityDuty = electricityDuty;
    }

    @Override
    public BigDecimal getMeterRent() {
        return meterRent;
    }

    @Override
    public void setMeterRent(BigDecimal meterRent) {
        this.meterRent = meterRent;
    }

    @Override
    public BigDecimal getPfCharge() {
        return pfCharge;
    }

    @Override
    public void setPfCharge(BigDecimal pfCharge) {
        this.pfCharge = pfCharge;
    }

    @Override
    public BigDecimal getWeldingTransformerSurcharge() {
        return weldingTransformerSurcharge;
    }

    @Override
    public void setWeldingTransformerSurcharge(BigDecimal weldingTransformerSurcharge) {
        this.weldingTransformerSurcharge = weldingTransformerSurcharge;
    }

    @Override
    public BigDecimal getLoadFactorIncentive() {
        return loadFactorIncentive;
    }

    @Override
    public void setLoadFactorIncentive(BigDecimal loadFactorIncentive) {
        this.loadFactorIncentive = loadFactorIncentive;
    }

    @Override
    public BigDecimal getSdInterest() {
        return sdInterest;
    }

    @Override
    public void setSdInterest(BigDecimal sdInterest) {
        this.sdInterest = sdInterest;
    }

    @Override
    public BigDecimal getCcbAdjustment() {
        return ccbAdjustment;
    }

    @Override
    public void setCcbAdjustment(BigDecimal ccbAdjustment) {
        this.ccbAdjustment = ccbAdjustment;
    }

    @Override
    public BigDecimal getLockCredit() {
        return lockCredit;
    }

    @Override
    public void setLockCredit(BigDecimal lockCredit) {
        this.lockCredit = lockCredit;
    }

    @Override
    public BigDecimal getOtherAdjustment() {
        return otherAdjustment;
    }

    @Override
    public void setOtherAdjustment(BigDecimal otherAdjustment) {
        this.otherAdjustment = otherAdjustment;
    }

    @Override
    public BigDecimal getEmployeeRebate() {
        return employeeRebate;
    }

    @Override
    public void setEmployeeRebate(BigDecimal employeeRebate) {
        this.employeeRebate = employeeRebate;
    }

    @Override
    public BigDecimal getOnlinePaymentRebate() {
        return onlinePaymentRebate;
    }

    @Override
    public void setOnlinePaymentRebate(BigDecimal onlinePaymentRebate) {
        this.onlinePaymentRebate = onlinePaymentRebate;
    }

    @Override
    public BigDecimal getPrepaidMeterRebate() {
        return prepaidMeterRebate;
    }

    @Override
    public void setPrepaidMeterRebate(BigDecimal prepaidMeterRebate) {
        this.prepaidMeterRebate = prepaidMeterRebate;
    }

    @Override
    public BigDecimal getPromptPaymentIncentive() {
        return promptPaymentIncentive;
    }

    @Override
    public void setPromptPaymentIncentive(BigDecimal promptPaymentIncentive) {
        this.promptPaymentIncentive = promptPaymentIncentive;
    }

    @Override
    public BigDecimal getAdvancePaymentIncentive() {
        return advancePaymentIncentive;
    }

    @Override
    public void setAdvancePaymentIncentive(BigDecimal advancePaymentIncentive) {
        this.advancePaymentIncentive = advancePaymentIncentive;
    }

    @Override
    public BigDecimal getDemandSideIncentive() {
        return demandSideIncentive;
    }

    @Override
    public void setDemandSideIncentive(BigDecimal demandSideIncentive) {
        this.demandSideIncentive = demandSideIncentive;
    }

    @Override
    public BigDecimal getSubsidy() {
        return subsidy;
    }

    @Override
    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    @Override
    public BigDecimal getPristineCurrentBill() {
        return pristineCurrentBill;
    }

    @Override
    public void setPristineCurrentBill(BigDecimal pristineCurrentBill) {
        this.pristineCurrentBill = pristineCurrentBill;
    }

    @Override
    public BigDecimal getCurrentBill() {
        return currentBill;
    }

    @Override
    public void setCurrentBill(BigDecimal currentBill) {
        this.currentBill = currentBill;
    }

    @Override
    public BigDecimal getArrear() {
        return arrear;
    }

    @Override
    public void setArrear(BigDecimal arrear) {
        this.arrear = arrear;
    }

    @Override
    public BigDecimal getCumulativeSurcharge() {
        return cumulativeSurcharge;
    }

    @Override
    public void setCumulativeSurcharge(BigDecimal cumulativeSurcharge) {
        this.cumulativeSurcharge = cumulativeSurcharge;
    }

    @Override
    public BigDecimal getSurchargeDemanded() {
        return surchargeDemanded;
    }

    @Override
    public void setSurchargeDemanded(BigDecimal surchargeDemanded) {
        this.surchargeDemanded = surchargeDemanded;
    }

    @Override
    public BigDecimal getNetBill() {
        return netBill;
    }

    @Override
    public void setNetBill(BigDecimal netBill) {
        this.netBill = netBill;
    }

    @Override
    public BigDecimal getAsdBilled() {
        return asdBilled;
    }

    @Override
    public void setAsdBilled(BigDecimal asdBilled) {
        this.asdBilled = asdBilled;
    }

    @Override
    public BigDecimal getAsdArrear() {
        return asdArrear;
    }

    @Override
    public void setAsdArrear(BigDecimal asdArrear) {
        this.asdArrear = asdArrear;
    }

    @Override
    public BigDecimal getAsdInstallment() {
        return asdInstallment;
    }

    @Override
    public void setAsdInstallment(BigDecimal asdInstallment) {
        this.asdInstallment = asdInstallment;
    }

    @Override
    public boolean getIsDeleted() {
        return deleted;
    }

    @Override
    public void setIsDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    @Override
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    @Override
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public BigDecimal getPristineElectricityDuty() {
        return pristineElectricityDuty;
    }

    @Override
    public void setPristineElectricityDuty(BigDecimal pristineElectricityDuty) {
        this.pristineElectricityDuty = pristineElectricityDuty;
    }

    @Override
    public BigDecimal getPristineNetBill() {
        return pristineNetBill;
    }

    @Override
    public void setPristineNetBill(BigDecimal pristineNetBill) {
        this.pristineNetBill = pristineNetBill;
    }

    @Override
    public BigDecimal getCurrentBillSurcharge() {
        return currentBillSurcharge;
    }

    @Override
    public void setCurrentBillSurcharge(BigDecimal currentBillSurcharge) {
        this.currentBillSurcharge = currentBillSurcharge;
    }

    @Override
    public String getBillTypeCode() {
        return billTypeCode;
    }

    @Override
    public void setBillTypeCode(String billTypeCode) {
        this.billTypeCode = billTypeCode;
    }

    @Override
    public BigDecimal getXrayFixedCharge() {
        return xrayFixedCharge;
    }

    @Override
    public void setXrayFixedCharge(BigDecimal xrayFixedCharge) {
        this.xrayFixedCharge = xrayFixedCharge;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", locationCode='" + locationCode + '\'' +
                ", groupNo='" + groupNo + '\'' +
                ", readingDiaryNo='" + readingDiaryNo + '\'' +
                ", consumerNo='" + consumerNo + '\'' +
                ", billMonth='" + billMonth + '\'' +
                ", billDate=" + billDate +
                ", dueDate=" + dueDate +
                ", chequeDueDate=" + chequeDueDate +
                ", currentReadDate=" + currentReadDate +
                ", currentRead=" + currentRead +
                ", previousRead=" + previousRead +
                ", difference=" + difference +
                ", mf=" + mf +
                ", meteredUnit=" + meteredUnit +
                ", assessment=" + assessment +
                ", totalUnit=" + totalUnit +
                ", gmcUnit=" + gmcUnit +
                ", billedUnit=" + billedUnit +
                ", billedMD=" + billedMD +
                ", billedPF=" + billedPF +
                ", loadFactor=" + loadFactor +
                ", fixedCharge=" + fixedCharge +
                ", additionalFixedCharges1=" + additionalFixedCharges1 +
                ", additionalFixedCharges2=" + additionalFixedCharges2 +
                ", energyCharge=" + energyCharge +
                ", fcaCharge=" + fcaCharge +
                ", electricityDuty=" + electricityDuty +
                ", meterRent=" + meterRent +
                ", pfCharge=" + pfCharge +
                ", weldingTransformerSurcharge=" + weldingTransformerSurcharge +
                ", loadFactorIncentive=" + loadFactorIncentive +
                ", sdInterest=" + sdInterest +
                ", ccbAdjustment=" + ccbAdjustment +
                ", lockCredit=" + lockCredit +
                ", otherAdjustment=" + otherAdjustment +
                ", employeeRebate=" + employeeRebate +
                ", onlinePaymentRebate=" + onlinePaymentRebate +
                ", prepaidMeterRebate=" + prepaidMeterRebate +
                ", promptPaymentIncentive=" + promptPaymentIncentive +
                ", advancePaymentIncentive=" + advancePaymentIncentive +
                ", demandSideIncentive=" + demandSideIncentive +
                ", subsidy=" + subsidy +
                ", pristineCurrentBill=" + pristineCurrentBill +
                ", currentBill=" + currentBill +
                ", arrear=" + arrear +
                ", cumulativeSurcharge=" + cumulativeSurcharge +
                ", surchargeDemanded=" + surchargeDemanded +
                ", netBill=" + netBill +
                ", asdBilled=" + asdBilled +
                ", asdArrear=" + asdArrear +
                ", asdInstallment=" + asdInstallment +
                ", deleted=" + deleted +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                ", pristineElectricityDuty=" + pristineElectricityDuty +
                ", pristineNetBill=" + pristineNetBill +
                ", currentBillSurcharge=" + currentBillSurcharge +
                ", billTypeCode='" + billTypeCode + '\'' +
                ", xrayFixedCharge=" + xrayFixedCharge +
                '}';
    }
}
