package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.Payment;
import com.mppkvvcl.ngbdao.interfaces.PaymentInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<@NonNull Payment, @NonNull Long> {

    PaymentInterface findById(long id);

    @Query("from #{#entityName} p where p.consumerNo= :consumerNo and p.deleted= :deleted and to_date(p.postingBillMonth,'MON-YYYY') <= to_date(:postingBillMonth,'MON-YYYY') order by payDate DESC, id DESC")
    List<PaymentInterface> findByConsumerNoAndDeletedAndPostingBillMonthLessThanEqualOrderByPayDateDESC(@Param("consumerNo") String consumerNo, @Param("deleted") boolean deleted, @Param("postingBillMonth") String postingBillMonth, Pageable pageable);

    @Query("select sum(p.amount) from #{#entityName} p where p.consumerNo= :consumerNo and postingBillMonth= :postingBillMonth and p.posted= :posted and p.deleted= :deleted")
    Long findAmountByConsumerNoAndPostingBillMonthAndPostedDeleted(@Param("consumerNo") String consumerNo, @Param("postingBillMonth") String postingBillMonth, @Param("posted") boolean posted, @Param("deleted") boolean deleted);
}
