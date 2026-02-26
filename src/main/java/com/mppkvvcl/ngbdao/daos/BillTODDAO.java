package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.BillTODInterface;
import com.mppkvvcl.ngbdao.repositories.BillTODRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillTODDAO {

    @Autowired
    private BillTODRepository billTODRepository;

    public BillTODInterface getByBillId(long billId) {

        return billTODRepository.findByBillId(billId);
    }
}
