package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.SecurityDepositInterface;
import com.mppkvvcl.ngbdao.repositories.SecurityDepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SecurityDepositDAO {

    @Autowired
    private SecurityDepositRepository securityDepositRepository;

    public SecurityDepositInterface get(final SecurityDepositInterface securityDeposit) {
        if (securityDeposit == null) return null;

        return securityDepositRepository.findById(securityDeposit.getId());
    }

    public SecurityDepositInterface getById(long id) {

        return securityDepositRepository.findById(id);
    }

    public List<SecurityDepositInterface> getByConsumerNoOrderByIdDesc(String consumerNo) {
        if (consumerNo == null) return null;

        return securityDepositRepository.findByConsumerNoOrderByIdDesc(consumerNo);
    }

    public SecurityDepositInterface getConsumerNoAndEffectiveStartDateAndEffectiveEndDateOrderByIdAsc(String consumerNo, LocalDate referenceDate) {
        if (consumerNo == null || referenceDate == null) return null;

        return securityDepositRepository.findConsumerNoAndEffectiveStartDateAndEffectiveEndDateOrderByIdAsc(consumerNo, referenceDate);
    }
}
