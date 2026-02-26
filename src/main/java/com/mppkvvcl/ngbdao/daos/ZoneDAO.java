package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.ZoneInterface;
import com.mppkvvcl.ngbdao.repositories.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneDAO {

    @Autowired
    private ZoneRepository zoneRepository;

    public ZoneInterface get(final ZoneInterface zone) {
        if (zone == null) return null;

        return zoneRepository.findById(zone.getId());
    }

    public ZoneInterface getById(long id) {

        return zoneRepository.findById(id);
    }

    public ZoneInterface getByCode(final String code) {
        if (code == null) return null;

        return zoneRepository.findByCode(code);
    }
}
