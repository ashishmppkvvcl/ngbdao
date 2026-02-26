package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.MeterReaderInformationInterface;
import com.mppkvvcl.ngbdao.repositories.MeterReaderInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterReaderInformationDAO {

    @Autowired
    private MeterReaderInformationRepository meterReaderInformationRepository;

    public MeterReaderInformationInterface get(final MeterReaderInformationInterface meterReaderInformation) {
        if (meterReaderInformation == null) return null;

        return meterReaderInformationRepository.findById(meterReaderInformation.getId());
    }

    public MeterReaderInformationInterface getById(long id) {

        return meterReaderInformationRepository.findById(id);
    }

    public MeterReaderInformationInterface getByReadingDiaryNoId(long readingDiaryNoId) {

        return meterReaderInformationRepository.findByReadingDiaryNoId(readingDiaryNoId);
    }
}
