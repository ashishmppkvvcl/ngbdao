package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.Bill;
import com.mppkvvcl.ngbdao.interfaces.BillInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<@NonNull Bill, @NonNull Long> {

    BillInterface findById(long id);

    @Query("select to_char(max(to_date(billMonth, 'MON-YYYY')), 'MON-YYYY') from #{#entityName} where consumerNo= :consumerNo and deleted= :deleted")
    String findMaxBillMonthByConsumerNoAndDeleted(@Param("consumerNo") String consumerNo, @Param("deleted") boolean deleted);

    BillInterface findByConsumerNoAndBillMonthAndDeleted(String consumerNo, String billMonth, boolean deleted);
}
