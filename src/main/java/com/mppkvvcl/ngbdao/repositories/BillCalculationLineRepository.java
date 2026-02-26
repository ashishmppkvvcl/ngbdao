package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.BillCalculationLine;
import com.mppkvvcl.ngbdao.interfaces.BillCalculationLineInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillCalculationLineRepository extends JpaRepository<@NonNull BillCalculationLine, @NonNull Long> {

    BillCalculationLineInterface findById(long id);

    List<BillCalculationLineInterface> findByBillId(long billId);
}
