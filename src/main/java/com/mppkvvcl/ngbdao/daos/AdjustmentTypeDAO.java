package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.AdjustmentTypeInterface;
import com.mppkvvcl.ngbdao.repositories.AdjustmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdjustmentTypeDAO {

    @Autowired
    private AdjustmentTypeRepository adjustmentTypeRepository;

    public AdjustmentTypeInterface get(final AdjustmentTypeInterface adjustmentType) {
        if (adjustmentType == null) return null;

        return adjustmentTypeRepository.findById(adjustmentType.getId());
    }

    public AdjustmentTypeInterface getById(long id) {

        return adjustmentTypeRepository.findById(id);
    }

    public AdjustmentTypeInterface getByCode(final int code) {

        return adjustmentTypeRepository.findByCode(code);
    }
}
