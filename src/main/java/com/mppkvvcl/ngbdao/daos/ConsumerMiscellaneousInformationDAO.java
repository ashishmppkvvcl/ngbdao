package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ConsumerMiscellaneousInformationInterface;
import com.mppkvvcl.ngbdao.repositories.ConsumerMiscellaneousInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerMiscellaneousInformationDAO {

    @Autowired
    private ConsumerMiscellaneousInformationRepository consumerMiscellaneousInformationRepository;

    public ConsumerMiscellaneousInformationInterface get(final ConsumerMiscellaneousInformationInterface consumerMiscellaneousInformation) {
        if (consumerMiscellaneousInformation == null) return null;

        return consumerMiscellaneousInformationRepository.findById(consumerMiscellaneousInformation.getId());
    }

    public ConsumerMiscellaneousInformationInterface getById(long id) {

        return consumerMiscellaneousInformationRepository.findById(id);
    }

    public List<ConsumerMiscellaneousInformationInterface> getActivePropertyByConsumerNo(String consumerNo) {
        if (consumerNo == null) return null;

        return consumerMiscellaneousInformationRepository.findActivePropertyByConsumerNo(consumerNo);
    }

    public ConsumerMiscellaneousInformationInterface getActivePropertyByConsumerNoAndPropertyName(String consumerNo, String propertyName) {
        if (consumerNo == null || propertyName == null) return null;

        return consumerMiscellaneousInformationRepository.findActivePropertyByConsumerNoAndPropertyName(consumerNo, propertyName);
    }

    public String getActivePropertyValueByConsumerNoAndPropertyName(String consumerNo, String propertyName) {
        if (consumerNo == null || propertyName == null) return null;

        return consumerMiscellaneousInformationRepository.findActivePropertyValueByConsumerNoAndPropertyName(consumerNo, propertyName);
    }
}
