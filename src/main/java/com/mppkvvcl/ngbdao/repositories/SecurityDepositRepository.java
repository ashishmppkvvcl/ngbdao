package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.SecurityDeposit;
import com.mppkvvcl.ngbdao.interfaces.SecurityDepositInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface SecurityDepositRepository extends JpaRepository<@NonNull SecurityDeposit, @NonNull Long> {

    SecurityDepositInterface findById(long id);

    List<SecurityDepositInterface> findByConsumerNoOrderByIdDesc(String consumerNo);

    @Query("from #{#entityName} sd where sd.consumerNo = :consumerNo and (:referenceDate >= sd.effectiveStartDate and :referenceDate <= sd.effectiveEndDate) order by id asc")
    SecurityDepositInterface findConsumerNoAndEffectiveStartDateAndEffectiveEndDateOrderByIdAsc(@Param("consumerNo") String consumerNo, @Param("referenceDate") LocalDate referenceDate);
}
