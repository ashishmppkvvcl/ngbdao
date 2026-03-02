package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.NetMeteringArrangementInterface;
import com.mppkvvcl.ngbdao.repositories.NetMeteringArrangementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetMeteringArrangementDAO {

    @Autowired
    private NetMeteringArrangementRepository netMeteringArrangementRepository;

    public List<NetMeteringArrangementInterface> getNonParentByParentConsumerNoAndBillMonthBetween(String consumerNo, String billMonth) {
        if (consumerNo == null || billMonth == null) return null;

        return netMeteringArrangementRepository.findNonParentByParentConsumerNoAndBillMonthBetween(consumerNo, billMonth);
    }
}
