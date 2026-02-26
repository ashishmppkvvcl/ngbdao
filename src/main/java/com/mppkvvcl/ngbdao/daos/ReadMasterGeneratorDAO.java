package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ReadMasterGeneratorInterface;
import com.mppkvvcl.ngbdao.repositories.ReadMasterGeneratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadMasterGeneratorDAO {

    @Autowired
    private ReadMasterGeneratorRepository readMasterGeneratorRepository;

    public ReadMasterGeneratorInterface get(final ReadMasterGeneratorInterface readMasterGenerator) {
        if (readMasterGenerator == null) return null;

        return readMasterGeneratorRepository.findById(readMasterGenerator.getId());
    }

    public ReadMasterGeneratorInterface getById(long id) {

        return readMasterGeneratorRepository.findById(id);
    }
}
