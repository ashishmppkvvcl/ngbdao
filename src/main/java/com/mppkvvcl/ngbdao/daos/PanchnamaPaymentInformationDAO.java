package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.PanchnamaPaymentInformationInterface;
import com.mppkvvcl.ngbdao.repositories.PanchnamaPaymentInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class PanchnamaPaymentInformationDAO {

    @Autowired
    private PanchnamaPaymentInformationRepository panchnamaPaymentInformationRepository;

    public PanchnamaPaymentInformationInterface get(final PanchnamaPaymentInformationInterface panchnamaPaymentInformation) {
        if (panchnamaPaymentInformation == null) return null;

        return panchnamaPaymentInformationRepository.findById(panchnamaPaymentInformation.getId());
    }

    public PanchnamaPaymentInformationInterface getById(long id) {

        return panchnamaPaymentInformationRepository.findById(id);
    }

    public BigDecimal getByConsumerNoAndPanchnamaNoAndPanchnamaDateAndDeleted(String consumerNo, String panchnamaNo, LocalDate panchnamaDate, boolean deleted) {
        if (consumerNo == null || panchnamaNo == null || panchnamaDate == null) return null;

        return panchnamaPaymentInformationRepository.findByConsumerNoAndPanchnamaNoAndPanchnamaDateAndDeleted(consumerNo, panchnamaNo, panchnamaDate, deleted);
    }
}
