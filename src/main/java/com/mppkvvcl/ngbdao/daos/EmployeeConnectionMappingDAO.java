package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.EmployeeConnectionMappingInterface;
import com.mppkvvcl.ngbdao.repositories.EmployeeConnectionMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeConnectionMappingDAO {

    @Autowired
    private EmployeeConnectionMappingRepository employeeConnectionMappingRepository;

    public EmployeeConnectionMappingInterface get(final EmployeeConnectionMappingInterface employeeConnectionMapping) {
        if (employeeConnectionMapping == null) return null;

        return employeeConnectionMappingRepository.findById(employeeConnectionMapping.getId());
    }

    public EmployeeConnectionMappingInterface getById(long id) {

        return employeeConnectionMappingRepository.findById(id);
    }

    public EmployeeConnectionMappingInterface getActiveEmployeeByConsumerNo(String consumerNo) {
        if (consumerNo == null) return null;

        return employeeConnectionMappingRepository.findActiveEmployeeByConsumerNo(consumerNo);
    }
}
