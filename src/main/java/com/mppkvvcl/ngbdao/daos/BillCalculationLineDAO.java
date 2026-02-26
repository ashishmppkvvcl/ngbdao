package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.BillCalculationLineInterface;
import com.mppkvvcl.ngbdao.repositories.BillCalculationLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillCalculationLineDAO {

    @Autowired
    private BillCalculationLineRepository billCalculationLineRepository;

    public BillCalculationLineInterface get(final BillCalculationLineInterface billCalculationLine) {
        if (billCalculationLine == null) return null;

        return billCalculationLineRepository.findById(billCalculationLine.getId());
    }

    public BillCalculationLineInterface getById(long id) {

        return billCalculationLineRepository.findById(id);
    }

    public List<BillCalculationLineInterface> getByBillId(long billId) {

        return billCalculationLineRepository.findByBillId(billId);
    }
}
