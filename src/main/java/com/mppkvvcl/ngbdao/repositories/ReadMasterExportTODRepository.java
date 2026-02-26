package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ReadMasterExportTOD;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadMasterExportTODRepository extends JpaRepository<@NonNull ReadMasterExportTOD, @NonNull Long> {
}
