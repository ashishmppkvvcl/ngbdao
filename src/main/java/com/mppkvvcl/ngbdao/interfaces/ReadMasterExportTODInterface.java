package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.math.BigDecimal;

public interface ReadMasterExportTODInterface extends Serializable {

    long getReadMasterExportId();

    void setReadMasterExportId(long readMasterExportId);

    BigDecimal getTod1Reading();

    void setTod1Reading(BigDecimal tod1Reading);

    BigDecimal getTod1Difference();

    void setTod1Difference(BigDecimal tod1Difference);

    BigDecimal getTod1Consumption();

    void setTod1Consumption(BigDecimal tod1Consumption);

    BigDecimal getTod1PropagatedAssessment();

    void setTod1PropagatedAssessment(BigDecimal tod1PropagatedAssessment);

    BigDecimal getTod1TotalConsumption();

    void setTod1TotalConsumption(BigDecimal tod1TotalConsumption);

    BigDecimal getTod2Reading();

    void setTod2Reading(BigDecimal tod2Reading);

    BigDecimal getTod2Difference();

    void setTod2Difference(BigDecimal tod2Difference);

    BigDecimal getTod2Consumption();

    void setTod2Consumption(BigDecimal tod2Consumption);

    BigDecimal getTod2PropagatedAssessment();

    void setTod2PropagatedAssessment(BigDecimal tod2PropagatedAssessment);

    BigDecimal getTod2TotalConsumption();

    void setTod2TotalConsumption(BigDecimal tod2TotalConsumption);

    BigDecimal getTod3Reading();

    void setTod3Reading(BigDecimal tod3Reading);

    BigDecimal getTod3Difference();

    void setTod3Difference(BigDecimal tod3Difference);

    BigDecimal getTod3Consumption();

    void setTod3Consumption(BigDecimal tod3Consumption);

    BigDecimal getTod3PropagatedAssessment();

    void setTod3PropagatedAssessment(BigDecimal tod3PropagatedAssessment);

    BigDecimal getTod3TotalConsumption();

    void setTod3TotalConsumption(BigDecimal tod3TotalConsumption);

    BigDecimal getTod4Reading();

    void setTod4Reading(BigDecimal tod4Reading);

    BigDecimal getTod4Difference();

    void setTod4Difference(BigDecimal tod4Difference);

    BigDecimal getTod4Consumption();

    void setTod4Consumption(BigDecimal tod4Consumption);

    BigDecimal getTod4PropagatedAssessment();

    void setTod4PropagatedAssessment(BigDecimal tod4PropagatedAssessment);

    BigDecimal getTod4TotalConsumption();

    void setTod4TotalConsumption(BigDecimal tod4TotalConsumption);


    BigDecimal getTod1Assessment();

    void setTod1Assessment(BigDecimal tod1Assessment);

    BigDecimal getTod2Assessment();

    void setTod2Assessment(BigDecimal tod2Assessment);

    BigDecimal getTod3Assessment();

    void setTod3Assessment(BigDecimal tod3Assessment);

    BigDecimal getTod4Assessment();

    void setTod4Assessment(BigDecimal tod4Assessment);
}
