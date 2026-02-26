package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.EEDivisionMappingInterface;
import com.mppkvvcl.ngbdao.repositories.EEDivisionMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EEDivisionMappingDAO {

    @Autowired
    private EEDivisionMappingRepository eeDivisionMappingRepository;

    public EEDivisionMappingInterface get(final EEDivisionMappingInterface eeDivisionMapping) {
        if (eeDivisionMapping == null) return null;

        return eeDivisionMappingRepository.findById(eeDivisionMapping.getId());
    }

    public EEDivisionMappingInterface getById(long id) {

        return eeDivisionMappingRepository.findById(id);
    }

    public EEDivisionMappingInterface getByDivisionId(final long divisionId) {

        return eeDivisionMappingRepository.findByDivisionId(divisionId);
    }
}
