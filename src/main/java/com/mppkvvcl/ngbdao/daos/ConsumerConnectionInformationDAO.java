package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ConsumerConnectionInformationInterface;
import com.mppkvvcl.ngbdao.repositories.ConsumerConnectionInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerConnectionInformationDAO {

    @Autowired
    private ConsumerConnectionInformationRepository consumerConnectionInformationRepository;

    public ConsumerConnectionInformationInterface get(final ConsumerConnectionInformationInterface consumerConnectionInformation) {
        if (consumerConnectionInformation == null) return null;

        return consumerConnectionInformationRepository.findById(consumerConnectionInformation.getId());
    }

    public ConsumerConnectionInformationInterface getById(long id) {

        return consumerConnectionInformationRepository.findById(id);
    }

    public Object[] getForBillTemplateByConsumerNo(String consumerNo) {
        if (consumerNo == null) return null;

        final List<Object[]> output = consumerConnectionInformationRepository.findForBillTemplateByConsumerNo(consumerNo);
        return (output != null && output.size() == 1) ? output.getFirst() : null;
    }
}
