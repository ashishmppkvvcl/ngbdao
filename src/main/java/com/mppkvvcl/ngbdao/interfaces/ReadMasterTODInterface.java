package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;

public interface ReadMasterTODInterface extends Serializable {

    String TOD1 = "TOD1";
    String TOD2 = "TOD2";
    String TOD3 = "TOD3";
    String TOD4 = "TOD4";

    public long getReadMasterId();

    public void setReadMasterId(long readMasterId);

    public BigDecimal getTod1Reading();

    public void setTod1Reading(BigDecimal tod1Reading);

    public BigDecimal getTod1Difference();

    public void setTod1Difference(BigDecimal tod1Difference);

    public BigDecimal getTod1Consumption();

    public void setTod1Consumption(BigDecimal tod1Consumption);

    public BigDecimal getTod1PropagatedAssessment();

    public void setTod1PropagatedAssessment(BigDecimal tod1PropagatedAssessment);

    public BigDecimal getTod1TotalConsumption();

    public void setTod1TotalConsumption(BigDecimal tod1TotalConsumption);

    public BigDecimal getTod2Reading();

    public void setTod2Reading(BigDecimal tod2Reading);

    public BigDecimal getTod2Difference();

    public void setTod2Difference(BigDecimal tod2Difference);

    public BigDecimal getTod2Consumption();

    public void setTod2Consumption(BigDecimal tod2Consumption);

    public BigDecimal getTod2PropagatedAssessment();

    public void setTod2PropagatedAssessment(BigDecimal tod2PropagatedAssessment);

    public BigDecimal getTod2TotalConsumption();

    public void setTod2TotalConsumption(BigDecimal tod2TotalConsumption);

    public BigDecimal getTod3Reading();

    public void setTod3Reading(BigDecimal tod3Reading);

    public BigDecimal getTod3Difference();

    public void setTod3Difference(BigDecimal tod3Difference);

    public BigDecimal getTod3Consumption();

    public void setTod3Consumption(BigDecimal tod3Consumption);

    public BigDecimal getTod3PropagatedAssessment();

    public void setTod3PropagatedAssessment(BigDecimal tod3PropagatedAssessment);

    public BigDecimal getTod3TotalConsumption();

    public void setTod3TotalConsumption(BigDecimal tod3TotalConsumption);

    public BigDecimal getTod4Reading();

    public void setTod4Reading(BigDecimal tod4Reading);

    public BigDecimal getTod4Difference();

    public void setTod4Difference(BigDecimal tod4Difference);

    public BigDecimal getTod4Consumption();

    public void setTod4Consumption(BigDecimal tod4Consumption);

    public BigDecimal getTod4PropagatedAssessment();

    public void setTod4PropagatedAssessment(BigDecimal tod4PropagatedAssessment);

    public BigDecimal getTod4TotalConsumption();

    public void setTod4TotalConsumption(BigDecimal tod4TotalConsumption);

    public BigDecimal getTod1Assessment();

    public void setTod1Assessment(BigDecimal tod1Assessment);

    public BigDecimal getTod2Assessment();

    public void setTod2Assessment(BigDecimal tod2Assessment);

    public BigDecimal getTod3Assessment();

    public void setTod3Assessment(BigDecimal tod3Assessment);

    public BigDecimal getTod4Assessment();

    public void setTod4Assessment(BigDecimal tod4Assessment);
}
