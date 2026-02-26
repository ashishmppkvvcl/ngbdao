package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.AdjustmentInterface;
import com.mppkvvcl.ngbdao.repositories.AdjustmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("ngbAdjustmentDAO")
public class AdjustmentDAO {

    @Autowired
    @Qualifier("ngbAdjustmentRepository")
    private AdjustmentRepository adjustmentRepository;

    public AdjustmentInterface get(final AdjustmentInterface adjustment) {
        if (adjustment == null) return null;

        return adjustmentRepository.findById(adjustment.getId());
    }

    public AdjustmentInterface getById(long id) {

        return adjustmentRepository.findById(id);
    }

    public List<AdjustmentInterface> getByConsumerNoAndCodeAndApprovalStatusAndDeletedOrderByPostingBillMonthASC(String consumerNo, int code, String approvalStatus, boolean deleted) {
        if (consumerNo == null || approvalStatus == null) return null;

        return adjustmentRepository.findByConsumerNoAndCodeAndApprovalStatusAndDeletedOrderByPostingBillMonthASC(consumerNo, code, approvalStatus, deleted);
    }

    public List<AdjustmentInterface> getByConsumerNoAndCodeAndApprovalStatusAndPostedAndDeletedOrderByPostingBillMonthASC(String consumerNo, int code, String approvalStatus, boolean posted, boolean deleted) {
        if (consumerNo == null || approvalStatus == null) return null;

        return adjustmentRepository.findByConsumerNoAndCodeAndApprovalStatusAndPostedAndDeletedOrderByPostingBillMonthASC(consumerNo, code, approvalStatus, posted, deleted);
    }

    public List<AdjustmentInterface> getByConsumerNoAndPostingBillMonthAndApprovalStatusAndPostedAndDeletedOrderByCodeAscIdAsc(String consumerNo, String postingBillMonth, String approvalStatus, boolean posted, boolean deleted) {
        if (consumerNo == null || postingBillMonth == null || approvalStatus == null) return null;

        return adjustmentRepository.findByConsumerNoAndPostingBillMonthAndApprovalStatusAndPostedAndDeletedOrderByCodeAscIdAsc(consumerNo, postingBillMonth, approvalStatus, posted, deleted);
    }

    public BigDecimal getAmountByConsumerNoAndCodeAndApprovalStatusAndPostedAndDeleted(String consumerNo, int code, String approvalStatus, boolean posted, boolean deleted) {
        if (consumerNo == null || approvalStatus == null) return null;

        return adjustmentRepository.findAmountByConsumerNoAndCodeAndApprovalStatusAndPostedAndDeleted(consumerNo, code, approvalStatus, posted, deleted);
    }

    public BigDecimal getAmountByConsumerNoAndCodeAndPostingBillMonthAndApprovalStatusAndPostedAndDeleted(String consumerNo, int code, String postingBillMonth, String approvalStatus, boolean posted, boolean deleted) {
        if (consumerNo == null || postingBillMonth == null || approvalStatus == null) return null;

        return adjustmentRepository.findAmountByConsumerNoAndCodeAndPostingBillMonthAndApprovalStatusAndPostedAndDeleted(consumerNo, code, postingBillMonth, approvalStatus, posted, deleted);
    }
}
