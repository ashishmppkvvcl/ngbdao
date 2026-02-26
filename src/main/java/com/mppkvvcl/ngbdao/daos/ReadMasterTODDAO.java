package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ReadMasterTODInterface;
import com.mppkvvcl.ngbdao.repositories.ReadMasterTODRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadMasterTODDAO {

    @Autowired
    private ReadMasterTODRepository readMasterTODRepository;

    public ReadMasterTODInterface getByReadMasterId(long readMasterId) {

        return readMasterTODRepository.findByReadMasterId(readMasterId);
    }
}
