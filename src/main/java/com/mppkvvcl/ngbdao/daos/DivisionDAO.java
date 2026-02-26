package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.DivisionInterface;
import com.mppkvvcl.ngbdao.repositories.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionDAO {

    @Autowired
    private DivisionRepository divisionRepository;

    public DivisionInterface get(final DivisionInterface division) {
        if (division == null) return null;

        return divisionRepository.findById(division.getId());
    }

    public DivisionInterface getById(long id) {

        return divisionRepository.findById(id);
    }
}
