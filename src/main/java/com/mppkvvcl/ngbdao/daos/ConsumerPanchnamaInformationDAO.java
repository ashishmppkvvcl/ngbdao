package com.mppkvvcl.ngbdao.daos;


import com.mppkvvcl.ngbdao.interfaces.ConsumerPanchnamaInformationInterface;
import com.mppkvvcl.ngbdao.repositories.ConsumerPanchnamaInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerPanchnamaInformationDAO {

    @Autowired
    private ConsumerPanchnamaInformationRepository consumerPanchnamaInformationRepository;

    public ConsumerPanchnamaInformationInterface get(final ConsumerPanchnamaInformationInterface consumerPanchnamaInformation) {
        if (consumerPanchnamaInformation == null) return null;

        return consumerPanchnamaInformationRepository.findById(consumerPanchnamaInformation.getId());
    }

    public ConsumerPanchnamaInformationInterface getById(long id) {

        return consumerPanchnamaInformationRepository.findById(id);
    }

    public List<ConsumerPanchnamaInformationInterface> getByConsumerNoAndPostedAndDeleted(String consumerNo, boolean posted, boolean deleted) {
        if (consumerNo == null) return null;

        return consumerPanchnamaInformationRepository.findByConsumerNoAndPostedAndDeleted(consumerNo, posted, deleted);
    }
}
