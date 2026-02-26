package com.mppkvvcl.ngbdao.beans;

import com.mppkvvcl.ngbdao.interfaces.EEDivisionMappingInterface;
import jakarta.persistence.*;

@Entity(name = "EEDivisionMapping")
@Table(name = "ee_division_mapping")
public class EEDivisionMapping implements EEDivisionMappingInterface {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "division_id")
    private long divisionId;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public long getDivisionId() {
        return divisionId;
    }

    @Override
    public void setDivisionId(long divisionId) {
        this.divisionId = divisionId;
    }

    @Override
    public String toString() {
        return "EEDivisionMapping{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", divisionId=" + divisionId +
                '}';
    }
}
