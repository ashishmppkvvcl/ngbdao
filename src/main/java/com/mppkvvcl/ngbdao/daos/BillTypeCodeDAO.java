package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.BillTypeCodeInterface;
import com.mppkvvcl.ngbdao.repositories.BillTypeCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillTypeCodeDAO {

    @Autowired
    private BillTypeCodeRepository billTypeCodeRepository;

    public BillTypeCodeInterface get(final BillTypeCodeInterface billTypeCode) {
        if (billTypeCode == null) return null;

        return billTypeCodeRepository.findById(billTypeCode.getId());
    }

    public BillTypeCodeInterface getById(long id) {

        return billTypeCodeRepository.findById(id);
    }

    public BillTypeCodeInterface getByCode(final String code) {
        if (code == null) return null;

        return billTypeCodeRepository.findByCode(code);
    }
}
