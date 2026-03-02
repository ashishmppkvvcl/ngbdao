package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ConsumerMeterMappingInterface;
import com.mppkvvcl.ngbdao.repositories.ConsumerMeterMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerMeterMappingDAO {

    @Autowired
    private ConsumerMeterMappingRepository consumerMeterMappingRepository;

    public ConsumerMeterMappingInterface get(final ConsumerMeterMappingInterface consumerMeterMapping) {
        if (consumerMeterMapping == null) return null;

        return consumerMeterMappingRepository.findById(consumerMeterMapping.getId());
    }

    public ConsumerMeterMappingInterface getById(long id) {

        return consumerMeterMappingRepository.findById(id);
    }

    public List<ConsumerMeterMappingInterface> getByConsumerNoAndBillMonthOrderByInstallationDateDescIdDesc(String consumerNo, String billMonth) {
        if (consumerNo == null || billMonth == null) return null;

        return consumerMeterMappingRepository.findByConsumerNoAndBillMonthOrderByInstallationDateDescIdDesc(consumerNo, billMonth);
    }
}
