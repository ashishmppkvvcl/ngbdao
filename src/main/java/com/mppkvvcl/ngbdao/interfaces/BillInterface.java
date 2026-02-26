package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface BillInterface extends Serializable {

    long getId();

    void setId(long id);

    String getLocationCode();

    void setLocationCode(String locationCode);

    String getGroupNo();

    void setGroupNo(String groupNo);

    String getReadingDiaryNo();

    void setReadingDiaryNo(String readingDiaryNo);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getBillMonth();

    void setBillMonth(String billMonth);

    LocalDate getBillDate();

    void setBillDate(LocalDate billDate);

    LocalDate getDueDate();

    void setDueDate(LocalDate dueDate);

    LocalDate getChequeDueDate();

    void setChequeDueDate(LocalDate chequeDueDate);

    LocalDate getCurrentReadDate();

    void setCurrentReadDate(LocalDate currentReadDate);

    BigDecimal getCurrentRead();

    void setCurrentRead(BigDecimal currentRead);

    BigDecimal getPreviousRead();

    void setPreviousRead(BigDecimal previousRead);

    BigDecimal getDifference();

    void setDifference(BigDecimal difference);

    BigDecimal getMf();

    void setMf(BigDecimal mf);

    BigDecimal getMeteredUnit();

    void setMeteredUnit(BigDecimal meteredUnit);

    BigDecimal getAssessment();

    void setAssessment(BigDecimal assessment);

    BigDecimal getTotalUnit();

    void setTotalUnit(BigDecimal totalUnit);

    BigDecimal getGmcUnit();

    void setGmcUnit(BigDecimal gmcUnit);

    BigDecimal getBilledUnit();

    void setBilledUnit(BigDecimal billedUnit);

    BigDecimal getBilledMD();

    void setBilledMD(BigDecimal billedMD);

    BigDecimal getBilledPF();

    void setBilledPF(BigDecimal billedPF);

    BigDecimal getLoadFactor();

    void setLoadFactor(BigDecimal loadFactor);

    BigDecimal getFixedCharge();

    void setFixedCharge(BigDecimal fixedCharge);

    BigDecimal getAdditionalFixedCharges1();

    void setAdditionalFixedCharges1(BigDecimal additionalFixedCharges1);

    BigDecimal getAdditionalFixedCharges2();

    void setAdditionalFixedCharges2(BigDecimal additionalFixedCharges2);

    BigDecimal getEnergyCharge();

    void setEnergyCharge(BigDecimal energyCharge);

    BigDecimal getFcaCharge();

    void setFcaCharge(BigDecimal fcaCharge);

    BigDecimal getElectricityDuty();

    void setElectricityDuty(BigDecimal electricityDuty);

    BigDecimal getMeterRent();

    void setMeterRent(BigDecimal meterRent);

    BigDecimal getPfCharge();

    void setPfCharge(BigDecimal pfCharge);

    BigDecimal getWeldingTransformerSurcharge();

    void setWeldingTransformerSurcharge(BigDecimal weldingTransformerSurcharge);

    BigDecimal getLoadFactorIncentive();

    void setLoadFactorIncentive(BigDecimal loadFactorIncentive);

    BigDecimal getSdInterest();

    void setSdInterest(BigDecimal sdInterest);

    BigDecimal getCcbAdjustment();

    void setCcbAdjustment(BigDecimal ccbAdjustment);

    BigDecimal getLockCredit();

    void setLockCredit(BigDecimal lockCredit);

    BigDecimal getOtherAdjustment();

    void setOtherAdjustment(BigDecimal otherAdjustment);

    BigDecimal getSubsidy();

    void setSubsidy(BigDecimal subsidy);

    BigDecimal getPristineCurrentBill();

    void setPristineCurrentBill(BigDecimal pristineCurrentBill);

    BigDecimal getCurrentBill();

    void setCurrentBill(BigDecimal currentBill);

    BigDecimal getArrear();

    void setArrear(BigDecimal arrear);

    BigDecimal getCumulativeSurcharge();

    void setCumulativeSurcharge(BigDecimal cumulativeSurcharge);

    BigDecimal getSurchargeDemanded();

    void setSurchargeDemanded(BigDecimal surchargeDemanded);

    BigDecimal getNetBill();

    void setNetBill(BigDecimal netBill);

    BigDecimal getAsdBilled();

    void setAsdBilled(BigDecimal asdBilled);

    BigDecimal getAsdArrear();

    void setAsdArrear(BigDecimal asdArrear);

    BigDecimal getAsdInstallment();

    void setAsdInstallment(BigDecimal asdInstallment);

    BigDecimal getEmployeeRebate();

    void setEmployeeRebate(BigDecimal employeeRebate);

    BigDecimal getOnlinePaymentRebate();

    void setOnlinePaymentRebate(BigDecimal onlinePaymentRebate);

    BigDecimal getPrepaidMeterRebate();

    void setPrepaidMeterRebate(BigDecimal prepaidMeterRebate);

    BigDecimal getPromptPaymentIncentive();

    void setPromptPaymentIncentive(BigDecimal promptPaymentIncentive);

    BigDecimal getAdvancePaymentIncentive();

    void setAdvancePaymentIncentive(BigDecimal advancePaymentIncentive);

    BigDecimal getDemandSideIncentive();

    void setDemandSideIncentive(BigDecimal demandSideIncentive);

    boolean getIsDeleted();

    void setIsDeleted(boolean deleted);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);

    BigDecimal getPristineElectricityDuty();

    void setPristineElectricityDuty(BigDecimal pristineElectricityDuty);

    BigDecimal getPristineNetBill();

    void setPristineNetBill(BigDecimal pristineNetBill);

    BigDecimal getCurrentBillSurcharge();

    void setCurrentBillSurcharge(BigDecimal currentBillSurcharge);

    String getBillTypeCode();

    void setBillTypeCode(String billTypeCode);

    BigDecimal getXrayFixedCharge();

    void setXrayFixedCharge(BigDecimal xrayFixedCharge);
}
