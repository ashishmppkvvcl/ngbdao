package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.MeterReaderInformation;
import com.mppkvvcl.ngbdao.interfaces.MeterReaderInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterReaderInformationRepository extends JpaRepository<@NonNull MeterReaderInformation, @NonNull Long> {

    MeterReaderInformationInterface findById(long id);

    MeterReaderInformationInterface findByReadingDiaryNoId(long readingDiaryNoId);
}
