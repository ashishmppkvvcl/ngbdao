package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ReadMasterExportInterface;
import com.mppkvvcl.ngbdao.repositories.ReadMasterExportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadMasterExportDAO {

    @Autowired
    private ReadMasterExportRepository readMasterExportRepository;

    public ReadMasterExportInterface get(final ReadMasterExportInterface readMasterExport) {
        if (readMasterExport == null) return null;

        return readMasterExportRepository.findById(readMasterExport.getId());
    }

    public ReadMasterExportInterface getById(long id) {

        return readMasterExportRepository.findById(id);
    }

    public List<ReadMasterExportInterface> getByConsumerNoAndReplacementFlagAndUsedOnBill(String consumerNo, String replacementFlag, boolean usedOnBill, Sort sort) {
        if (consumerNo == null || replacementFlag == null || sort == null) return null;

        return readMasterExportRepository.findByConsumerNoAndReplacementFlagAndUsedOnBill(consumerNo, replacementFlag, usedOnBill, sort);
    }

    public List<ReadMasterExportInterface> getByConsumerNoAndBillMonthAndReplacementFlagAndUsedOnBill(String consumerNo, String billMonth, String replacementFlag, boolean usedOnBill, Sort sort) {
        if (consumerNo == null || billMonth == null || replacementFlag == null || sort == null) return null;

        return readMasterExportRepository.findByConsumerNoAndBillMonthAndReplacementFlagAndUsedOnBill(consumerNo, billMonth, replacementFlag, usedOnBill, sort);
    }

    public List<ReadMasterExportInterface> getByConsumerNoAndBillMonthAndMeterIdentifier(String consumerNo, String billMonth, String meterIdentifier, Sort sort) {
        if (consumerNo == null || billMonth == null || meterIdentifier == null || sort == null) return null;

        return readMasterExportRepository.findByConsumerNoAndBillMonthAndMeterIdentifier(consumerNo, billMonth, meterIdentifier, sort);
    }
}
