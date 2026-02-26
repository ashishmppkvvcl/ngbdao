package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ReadMasterTOD;
import com.mppkvvcl.ngbdao.interfaces.ReadMasterTODInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadMasterTODRepository extends JpaRepository<@NonNull ReadMasterTOD, @NonNull Long> {

    ReadMasterTODInterface findByReadMasterId(long readMasterId);
}
