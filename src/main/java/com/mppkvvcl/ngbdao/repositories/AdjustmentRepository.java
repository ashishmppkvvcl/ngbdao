package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.Adjustment;
import com.mppkvvcl.ngbdao.interfaces.AdjustmentInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository("ngbAdjustmentRepository")
public interface AdjustmentRepository extends JpaRepository<@NonNull Adjustment, @NonNull Long> {

    AdjustmentInterface findById(long id);

    @Query("from #{#entityName} a where a.consumerNo= :consumerNo and a.code= :code and a.approvalStatus= :approvalStatus and a.deleted= :deleted order by to_date(a.postingBillMonth,'MON-YYYY') ASC")
    List<AdjustmentInterface> findByConsumerNoAndCodeAndApprovalStatusAndDeletedOrderByPostingBillMonthASC(@Param("consumerNo") String consumerNo, @Param("code") int code, @Param("approvalStatus") String approvalStatus, @Param("deleted") boolean deleted);

    @Query("from #{#entityName} a where a.consumerNo= :consumerNo and a.code= :code and a.approvalStatus= :approvalStatus and a.posted= :posted and a.deleted= :deleted order by to_date(a.postingBillMonth,'MON-YYYY') ASC")
    List<AdjustmentInterface> findByConsumerNoAndCodeAndApprovalStatusAndPostedAndDeletedOrderByPostingBillMonthASC(@Param("consumerNo") String consumerNo, @Param("code") int code, @Param("approvalStatus") String approvalStatus, @Param("posted") boolean posted, @Param("deleted") boolean deleted);

    //@Query("from #{#entityName} a where a.consumerNo= :consumerNo and a.postingBillMonth= :postingBillMonth and a.approvalStatus= :approvalStatus and a.posted= :posted and a.deleted= :deleted order by a.code ASC, a.amount DESC")
    List<AdjustmentInterface> findByConsumerNoAndPostingBillMonthAndApprovalStatusAndPostedAndDeletedOrderByCodeAscIdAsc(String consumerNo, String postingBillMonth, String approvalStatus, boolean posted, boolean deleted);

    @Query("select sum(amount) from #{#entityName} a where a.consumerNo= :consumerNo and a.code= :code and a.approvalStatus= :approvalStatus and a.posted= :posted and a.deleted= :deleted")
    BigDecimal findAmountByConsumerNoAndCodeAndApprovalStatusAndPostedAndDeleted(@Param("consumerNo") String consumerNo, @Param("code") int code, @Param("approvalStatus") String approvalStatus, @Param("posted") boolean posted, @Param("deleted") boolean deleted);

    @Query("select sum(amount) from #{#entityName} a where a.consumerNo= :consumerNo and a.code= :code and a.postingBillMonth= :postingBillMonth and a.approvalStatus= :approvalStatus and a.posted= :posted and a.deleted= :deleted")
    BigDecimal findAmountByConsumerNoAndCodeAndPostingBillMonthAndApprovalStatusAndPostedAndDeleted(@Param("consumerNo") String consumerNo, @Param("code") int code, @Param("postingBillMonth") String postingBillMonth, @Param("approvalStatus") String approvalStatus, @Param("posted") boolean posted, @Param("deleted") boolean deleted);
}
