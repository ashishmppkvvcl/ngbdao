package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ReadMasterExportTODInterface;
import com.mppkvvcl.ngbdao.repositories.ReadMasterExportTODRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadMasterExportTODDAO {

    @Autowired
    private ReadMasterExportTODRepository readMasterExportTODRepository;

    public ReadMasterExportTODInterface getByReadMasterExportId(long readMasterExportId) {

        return readMasterExportTODRepository.findByReadMasterExportId(readMasterExportId);
    }
}
