package com.mppkvvcl.ngbdao.interfaces;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface EmployeeConnectionMappingInterface extends Serializable {

    long getId();

    void setId(long id);

    String getEmployeeNo();

    void setEmployeeNo(String employeeNo);

    String getConsumerNo();

    void setConsumerNo(String consumerNo);

    String getStatus();

    void setStatus(String status);

    LocalDate getStartDate();

    void setStartDate(LocalDate startDate);

    String getStartBillMonth();

    void setStartBillMonth(String startBillMonth);

    LocalDate getEndDate();

    void setEndDate(LocalDate endDate);

    String getEndBillMonth();

    void setEndBillMonth(String endBillMonth);

    LocalDateTime getCreatedOn();

    void setCreatedOn(LocalDateTime createdOn);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);
}
