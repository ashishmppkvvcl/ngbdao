package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.CircleECGRFInformationInterface;
import com.mppkvvcl.ngbdao.repositories.CircleECGRFInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircleECGRFInformationDAO {

    @Autowired
    private CircleECGRFInformationRepository circleECGRFInformationRepository;

    public CircleECGRFInformationInterface get(final CircleECGRFInformationInterface circleECGRFInformation) {
        if (circleECGRFInformation == null) return null;

        return circleECGRFInformationRepository.findById(circleECGRFInformation.getId());
    }

    public CircleECGRFInformationInterface getById(long id) {

        return circleECGRFInformationRepository.findById(id);
    }

    public List<CircleECGRFInformationInterface> getByCircleIdAndMonthOrderByIndexAsc(long circleId, String billMonth) {
        if (billMonth == null) return null;

        return circleECGRFInformationRepository.findByCircleIdAndMonthOrderByIndexAsc(circleId, billMonth);
    }
}
