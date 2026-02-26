package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.PaymentInterface;
import com.mppkvvcl.ngbdao.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentDAO {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentInterface get(final PaymentInterface payment) {
        if (payment == null) return null;

        return paymentRepository.findById(payment.getId());
    }

    public PaymentInterface getById(long id) {

        return paymentRepository.findById(id);
    }

    public List<PaymentInterface> getByConsumerNoAndDeletedAndPostingBillMonthLessThanEqualOrderByPayDateDESC(String consumerNo, boolean deleted, String postingBillMonth, Pageable pageable) {
        if (consumerNo == null || postingBillMonth == null || pageable == null) return null;

        return paymentRepository.findByConsumerNoAndDeletedAndPostingBillMonthLessThanEqualOrderByPayDateDESC(consumerNo, deleted, postingBillMonth, pageable);
    }

    public Long getAmountByConsumerNoAndPostingBillMonthAndPostedDeleted(String consumerNo, String postingBillMonth, boolean posted, boolean deleted) {
        if (consumerNo == null || postingBillMonth == null) return null;

        return paymentRepository.findAmountByConsumerNoAndPostingBillMonthAndPostedDeleted(consumerNo, postingBillMonth, posted, deleted);
    }
}
