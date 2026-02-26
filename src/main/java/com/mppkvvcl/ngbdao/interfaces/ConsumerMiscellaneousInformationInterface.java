package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ConsumerMiscellaneousInformationInterface extends Serializable {

    String PROPERTY_NAME_IS_NET_METER = "is_net_meter";
    String PROPERTY_NAME_SOLAR_PLANT_CAPACITY = "solar_plant_capacity";
    String PROPERTY_NAME_IS_SAUBHAGYA = "is_saubhagya";
    String PROPERTY_NAME_IS_SARAL = "is_saral";
    String PROPERTY_NAME_IS_BILL_MAFI = "is_bill_mafi";
    String PROPERTY_NAME_IS_LABOUR = "is_labour";
    String PROPERTY_NAME_LABOUR_REGISTRATION_NO = "labour_registration_no";
    String PROPERTY_NAME_CURRENT_METER_READER = "current_meter_reader";
    String PROPERTY_NAME_REMAINING_RESIDUAL_UNIT = "remaining_residual_unit";
    String IS_COVID_DEFERMENT_APPLIED_PROPERTY_NAME = "is_covid_deferment_applied";
    String IS_SEP23_DEFERMENT_APPLIED_PROPERTY_NAME = "is_sep23_deferment_scheme_applied";
    String PROPERTY_NAME_MEMBER_OF_HT_GROUP_HOUSING_SOCIETY = "member_of_ht_group_housing_society";
    String PROPERTY_NAME_GROUP_TYPE_VNM = "VNM";
    String PROPERTY_NAME_GROUP_TYPE_GNM = "GNM";
    String PROPERTY_NAME_VNM_PARENT_CONSUMER = "is_vnm_parent_consumer";
    String PROPERTY_NAME_GNM_PARENT_CONSUMER = "is_gnm_parent_consumer";
    String PROPERTY_NAME_VNM_CHILD_CONSUMER = "is_vnm_child_consumer";
    String PROPERTY_NAME_GNM_CHILD_CONSUMER = "is_gnm_child_consumer";
    String PROPERTY_NAME_GROUP_TYPE_GNM_SOLAR_PLANT_CAPACITY = "gnm_solar_plant_capacity";
    String PROPERTY_NAME_GROUP_TYPE_VNM_SOLAR_PLANT_CAPACITY = "vnm_solar_plant_capacity";
    String PROPERTY_NAME_IS_PREPAID = "is_prepaid";
    String PROPERTY_NAME_OTS_SCHEME_OPT_TYPE = "ots_scheme_opt_type";
    String PROPERTY_NAME_CONSUMER_PREFERRED_LANGUAGE = "consumer_preferred_language";
    String PROPERTY_NAME_PDC_BILL_MONTH = "pdc_bill_month";

    long getId();

    void setId(long id);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getPropertyName();

    void setPropertyName(String propertyName);

    String getPropertyValue();

    void setPropertyValue(String propertyValue);

    LocalDate getEffectiveStartDate();

    void setEffectiveStartDate(LocalDate effectiveStartDate);

    LocalDate getEffectiveEndDate();

    void setEffectiveEndDate(LocalDate effectiveEndDate);

    boolean getIsActive();

    void setIsActive(boolean isActive);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
