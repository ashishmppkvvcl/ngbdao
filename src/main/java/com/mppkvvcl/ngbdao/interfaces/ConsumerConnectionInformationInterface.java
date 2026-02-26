package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public interface ConsumerConnectionInformationInterface extends Serializable {

    String PHASE_SINGLE = "SINGLE";
    String PHASE_THREE = "THREE";

    String METERING_STATUS_METERED = "METERED";
    String METERING_STATUS_UNMETERED = "UNMETERED";

    String CONNECTION_TYPE_TEMPORARY = "TEMPORARY";
    String CONNECTION_TYPE_PERMANENT = "PERMANENT";

    public static final String LOAD_UNIT_KW = "KW";
    public static final String LOAD_UNIT_HP = "HP";

    String TARIFF_CATEGORY_LV1 = "LV1";
    String TARIFF_CATEGORY_LV2 = "LV2";
    String TARIFF_CATEGORY_LV3 = "LV3";
    String TARIFF_CATEGORY_LV4 = "LV4";
    String TARIFF_CATEGORY_LV5 = "LV5";
    String TARIFF_CATEGORY_LV6 = "LV6";
    String TARIFF_CODE_FLAT_RATE = "LV5.4";
    public static final List<String> TARIFF_CATEGORIES_LV2_4 = Arrays.asList("LV2", "LV4");
    public static final List<String> TARIFF_CATEGORIES_LV1_2_3_4 = Arrays.asList("LV1", "LV2", "LV3", "LV4");

    String PREMISE_TYPE_RURAL = "RURAL";
    String PREMISE_TYPE_URBAN = "URBAN";

    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getTariffCategory();

    void setTariffCategory(String tariffCategory);

    String getConnectionType();

    void setConnectionType(String connectionType);

    String getMeteringStatus();

    void setMeteringStatus(String meteringStatus);

    String getPremiseType();

    void setPremiseType(String premiseType);

    BigDecimal getSanctionedLoad();

    void setSanctionedLoad(BigDecimal sanctionedLoad);

    String getSanctionedLoadUnit();

    void setSanctionedLoadUnit(String sanctionedLoadUnit);

    BigDecimal getContractDemand();

    void setContractDemand(BigDecimal contractDemand);

    String getContractDemandUnit();

    void setContractDemandUnit(String contractDemandUnit);

    boolean getIsSeasonal();

    void setIsSeasonal(boolean isSeasonal);

    Long getPurposeOfInstallationId();

    void setPurposeOfInstallationId(Long purposeOfInstallationId);

    String getPurposeOfInstallation();

    void setPurposeOfInstallation(String purposeOfInstallation);

    String getTariffCode();

    void setTariffCode(String tariffCode);

    long getSubCategoryCode();

    void setSubCategoryCode(long subCategoryCode);

    String getPhase();

    void setPhase(String phase);

    boolean getIsGovernment();

    void setIsGovernment(boolean isGovernment);

    BigDecimal getPlotSize();

    void setPlotSize(BigDecimal plotSize);

    String getPlotSizeUnit();

    void setPlotSizeUnit(String plotSizeUnit);

    String getLocationCode();

    void setLocationCode(String locationCode);

    boolean getIsXray();

    void setIsXray(boolean isXray);

    boolean getIsWeldingTransformerSurcharge();

    void setIsWeldingTransformerSurcharge(boolean isWeldingTransformerSurcharge);

    boolean getIsCapacitorSurcharge();

    void setIsCapacitorSurcharge(boolean isCapacitorSurcharge);

    boolean getIsDemandside();

    void setIsDemandside(boolean isDemandside);

    boolean getIsBeneficiary();

    void setIsBeneficiary(boolean isBeneficiary);

    LocalDate getConnectionDate();

    void setConnectionDate(LocalDate connectionDate);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);
}
