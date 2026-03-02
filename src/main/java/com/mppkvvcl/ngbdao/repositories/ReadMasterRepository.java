package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ReadMaster;
import com.mppkvvcl.ngbdao.interfaces.ReadMasterInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReadMasterRepository extends JpaRepository<@NonNull ReadMaster, @NonNull Long> {

    ReadMasterInterface findById(long id);

    List<ReadMasterInterface> findByConsumerNoAndBillMonthAndReplacementFlagAndUsedOnBill(String consumerNo, String billMonth, String replacementFlag, Boolean usedOnBill, Sort sort);

    @Query("from #{#entityName} rm where rm.consumerNo= :consumerNo and rm.replacementFlag= :replacementFlag and rm.usedOnBill= :usedOnBill and to_date(rm.billMonth,'MON-YYYY') < to_date(:billMonth,'MON-YYYY') order by to_date(rm.billMonth,'MON-YYYY') DESC, id DESC")
    public List<ReadMasterInterface> findByConsumerNoAndReplacementFlagAndUsedOnBillAndBillMonthLessThanOrderByBillMonthDESC(@Param("consumerNo") String consumerNo, @Param("replacementFlag") String replacementFlag, @Param("usedOnBill") boolean usedOnBill, @Param("billMonth") String billMonth, Pageable pageable);
}
