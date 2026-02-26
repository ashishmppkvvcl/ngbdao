package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ConsumerConnectionInformation;
import com.mppkvvcl.ngbdao.interfaces.ConsumerConnectionInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerConnectionInformationRepository extends JpaRepository<@NonNull ConsumerConnectionInformation, @NonNull Long> {

    ConsumerConnectionInformationInterface findById(long id);

    @Query("select c.tariffCategory, c.tariffCode, c.connectionType, c.meteringStatus, c.premiseType, c.sanctionedLoad, c.sanctionedLoadUnit, c.contractDemand, c.contractDemandUnit, c.phase, c.connectionDate, c.purposeOfInstallation, " +
            "a.poleNo, a.dtrName, a.feederName from #{#entityName} c join ConsumerConnectionAreaInformation a on (c.consumerNo= a.consumerNo) where c.consumerNo= :consumerNo")
    List<Object[]> findForBillTemplateByConsumerNo(@Param("consumerNo") String consumerNo);
}
