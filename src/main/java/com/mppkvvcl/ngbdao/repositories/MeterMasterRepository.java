package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.MeterMaster;
import com.mppkvvcl.ngbdao.interfaces.MeterMasterInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterMasterRepository extends JpaRepository<@NonNull MeterMaster, @NonNull Long> {

    MeterMasterInterface findById(long id);

    MeterMasterInterface findByIdentifier(String identifier);
}
