package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.BillTypeCodeInterface;
import jakarta.persistence.*;

@Entity(name = "BillTypeCode")
@Table(name = "bill_type_code")
public class BillTypeCode implements BillTypeCodeInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BillTypeCode{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
