package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.MeterMasterInterface;
import com.mppkvvcl.ngbdao.repositories.MeterMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterMasterDAO {

    @Autowired
    private MeterMasterRepository meterMasterRepository;

    public MeterMasterInterface get(final MeterMasterInterface meterMaster) {
        if (meterMaster == null) return null;

        return meterMasterRepository.findById(meterMaster.getId());
    }

    public MeterMasterInterface getById(long id) {

        return meterMasterRepository.findById(id);
    }

    public MeterMasterInterface getByIdentifier(final String identifier) {
        if (identifier == null) return null;

        return meterMasterRepository.findByIdentifier(identifier);
    }
}
