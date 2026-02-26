package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.CircleECGRFInformationInterface;
import jakarta.persistence.*;

@Entity(name = "CircleECGRFInformation")
@Table(name = "circle_ecgrf_information")
public class CircleECGRFInformation implements CircleECGRFInformationInterface {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "circle_id")
    private long circleId;

    @Column(name = "index")
    private long index;

    @Column(name = "member_type")
    private String memberType;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "case_handling")
    private String caseHandling;

    @Column(name = "remark")
    private String remark;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getCircleId() {
        return circleId;
    }

    @Override
    public void setCircleId(long circleId) {
        this.circleId = circleId;
    }

    @Override
    public long getIndex() {
        return index;
    }

    @Override
    public void setIndex(long index) {
        this.index = index;
    }

    @Override
    public String getMemberType() {
        return memberType;
    }

    @Override
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getContactNo() {
        return contactNo;
    }

    @Override
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String getCaseHandling() {
        return caseHandling;
    }

    @Override
    public void setCaseHandling(String caseHandling) {
        this.caseHandling = caseHandling;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CircleECGRFInformation{" +
                "id=" + id +
                ", circleId=" + circleId +
                ", index=" + index +
                ", memberType='" + memberType + '\'' +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", caseHandling='" + caseHandling + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
