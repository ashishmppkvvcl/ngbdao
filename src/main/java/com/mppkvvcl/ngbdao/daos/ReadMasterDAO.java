package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ReadMasterInterface;
import com.mppkvvcl.ngbdao.repositories.ReadMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadMasterDAO {

    @Autowired
    private ReadMasterRepository readMasterRepository;

    public ReadMasterInterface get(final ReadMasterInterface readMaster) {
        if (readMaster == null) return null;

        return readMasterRepository.findById(readMaster.getId());
    }

    public ReadMasterInterface getById(long id) {

        return readMasterRepository.findById(id);
    }

    public List<ReadMasterInterface> getByConsumerNoAndBillMonthOrderByIdAsc(String consumerNo, String billMonth) {
        if (consumerNo == null || billMonth == null) return null;

        return readMasterRepository.findByConsumerNoAndBillMonthOrderByIdAsc(consumerNo, billMonth);
    }

    public List<ReadMasterInterface> getByConsumerNoAndBillMonthAndReplacementFlagAndUsedOnBillOrderByIdDesc(String consumerNo, String billMonth, String replacementFlag, Boolean usedOnBill) {
        if (consumerNo == null || billMonth == null || replacementFlag == null) return null;

        return readMasterRepository.findByConsumerNoAndBillMonthAndReplacementFlagAndUsedOnBillOrderByIdDesc(consumerNo, billMonth, replacementFlag, usedOnBill);
    }

    public List<ReadMasterInterface> getByConsumerNoAndReplacementFlagAndUsedOnBillAndBillMonthLessThanOrderByBillMonthDESC(String consumerNo, String replacementFlag, Boolean usedOnBill, String billMonth, Pageable pageable) {
        if (consumerNo == null || billMonth == null || replacementFlag == null || pageable == null) return null;

        return readMasterRepository.findByConsumerNoAndReplacementFlagAndUsedOnBillAndBillMonthLessThanOrderByBillMonthDESC(consumerNo, replacementFlag, usedOnBill, billMonth, pageable);
    }
}
