package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.BillInterface;
import com.mppkvvcl.ngbdao.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillDAO {

    @Autowired
    private BillRepository billRepository;

    public BillInterface get(final BillInterface bill) {
        if (bill == null) return null;

        return billRepository.findById(bill.getId());
    }

    public BillInterface getById(long id) {

        return billRepository.findById(id);
    }

    public String getMaxBillMonthByConsumerNoAndDeleted(final String consumerNo, final boolean deleted) {
        if (consumerNo == null) return null;

        return billRepository.findMaxBillMonthByConsumerNoAndDeleted(consumerNo, deleted);
    }

    public BillInterface getByConsumerNoAndBillMonthAndDeleted(String consumerNo, String billMonth, boolean deleted) {
        if (consumerNo == null || billMonth == null) return null;

        return billRepository.findByConsumerNoAndBillMonthAndDeleted(consumerNo, billMonth, deleted);
    }
}
