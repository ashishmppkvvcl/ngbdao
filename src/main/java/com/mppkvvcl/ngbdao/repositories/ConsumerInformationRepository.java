package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ConsumerInformation;
import com.mppkvvcl.ngbdao.interfaces.ConsumerInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerInformationRepository extends JpaRepository<@NonNull ConsumerInformation, @NonNull Long> {

    ConsumerInformationInterface findById(long id);

    @Query("select i.consumerNo, i.consumerName, i.consumerNameH, (COALESCE(i.address1, '') || ' ' || COALESCE(i.address2, '') || ' ' || COALESCE(i.address3, '')) AS address, " +
            "(COALESCE(i.address1H, '') || ' ' || COALESCE(i.address2H, '') || ' ' || COALESCE(i.address3H, '')) AS addressH, i.primaryMobileNo, i.emailAddress, i.isEmployee, c.locationCode, c.groupNo, c.readingDiaryNo, c.status " +
            "from #{#entityName} i join ConsumerNoMaster c on (i.consumerNo= c.consumerNo) where i.consumerNo= :consumerNo")
    List<Object[]> findForBillTemplateByConsumerNo(@Param("consumerNo") String consumerNo);
}
