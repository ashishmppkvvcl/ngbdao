package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.EEDivisionMapping;
import com.mppkvvcl.ngbdao.interfaces.EEDivisionMappingInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EEDivisionMappingRepository extends JpaRepository<@NonNull EEDivisionMapping, @NonNull Long> {

    EEDivisionMappingInterface findById(long id);

    EEDivisionMappingInterface findByDivisionId(long divisionId);
}
