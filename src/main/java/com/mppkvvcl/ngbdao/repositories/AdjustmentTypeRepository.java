package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.AdjustmentType;
import com.mppkvvcl.ngbdao.interfaces.AdjustmentTypeInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdjustmentTypeRepository extends JpaRepository<@NonNull AdjustmentType, @NonNull Long> {

    AdjustmentTypeInterface findById(long id);

    AdjustmentTypeInterface findByCode(int code);
}
