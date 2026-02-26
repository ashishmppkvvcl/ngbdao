package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.PanchnamaPaymentInformation;
import com.mppkvvcl.ngbdao.interfaces.PanchnamaPaymentInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;

@Repository
public interface PanchnamaPaymentInformationRepository extends JpaRepository<@NonNull PanchnamaPaymentInformation, @NonNull Long> {

    PanchnamaPaymentInformationInterface findById(long id);

    BigDecimal findByConsumerNoAndPanchnamaNoAndPanchnamaDateAndDeleted(String consumerNo, String panchnamaNo, LocalDate panchnamaDate, boolean deleted);
}
