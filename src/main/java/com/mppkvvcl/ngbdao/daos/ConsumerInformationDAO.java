package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ConsumerInformationInterface;
import com.mppkvvcl.ngbdao.repositories.ConsumerInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerInformationDAO {

    @Autowired
    private ConsumerInformationRepository consumerInformationRepository;

    public ConsumerInformationInterface get(final ConsumerInformationInterface consumerInformation) {
        if (consumerInformation == null) return null;

        return consumerInformationRepository.findById(consumerInformation.getId());
    }

    public ConsumerInformationInterface getById(long id) {

        return consumerInformationRepository.findById(id);
    }

    public Object[] getForBillTemplateByConsumerNo(String consumerNo) {
        if (consumerNo == null) return null;

        final List<Object[]> output = consumerInformationRepository.findForBillTemplateByConsumerNo(consumerNo);
        return (output != null && output.size() == 1) ? output.getFirst() : null;
    }
}
