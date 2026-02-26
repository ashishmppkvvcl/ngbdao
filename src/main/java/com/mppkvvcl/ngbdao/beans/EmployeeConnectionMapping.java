package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.EmployeeConnectionMappingInterface;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "EmployeeConnectionMapping")
@Table(name = "employee_connection_mapping")
public class EmployeeConnectionMapping implements EmployeeConnectionMappingInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "employee_no")
    private String employeeNo;

    @Column(name = "consumer_no")
    private String consumerNo;

    @Column(name = "status")
    private String status;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "start_bill_month")
    private String startBillMonth;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "end_bill_month")
    private String endBillMonth;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getStartBillMonth() {
        return startBillMonth;
    }

    public void setStartBillMonth(String startBillMonth) {
        this.startBillMonth = startBillMonth;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getEndBillMonth() {
        return endBillMonth;
    }

    public void setEndBillMonth(String endBillMonth) {
        this.endBillMonth = endBillMonth;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "EmployeeConnectionMapping{" +
                "id=" + id +
                ", employeeNo='" + employeeNo + '\'' +
                ", consumerNo='" + consumerNo + '\'' +
                ", status='" + status + '\'' +
                ", startDate=" + startDate +
                ", startBillMonth='" + startBillMonth + '\'' +
                ", endDate=" + endDate +
                ", endBillMonth='" + endBillMonth + '\'' +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", updatedOn=" + updatedOn +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
