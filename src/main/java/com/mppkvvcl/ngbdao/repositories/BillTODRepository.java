package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.BillTOD;
import com.mppkvvcl.ngbdao.interfaces.BillTODInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillTODRepository extends JpaRepository<@NonNull BillTOD, @NonNull Long> {

    BillTODInterface findByBillId(long billId);
}
