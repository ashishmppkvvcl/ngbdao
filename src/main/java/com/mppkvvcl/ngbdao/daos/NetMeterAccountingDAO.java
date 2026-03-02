package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.NetMeterAccountingInterface;
import com.mppkvvcl.ngbdao.repositories.NetMeterAccountingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetMeterAccountingDAO {

    @Autowired
    private NetMeterAccountingRepository netMeterAccountingRepository;

    public NetMeterAccountingInterface getByBillId(long billId) {

        return netMeterAccountingRepository.findByBillId(billId);
    }
}
