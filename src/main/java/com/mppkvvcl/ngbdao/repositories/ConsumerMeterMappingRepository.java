package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ConsumerMeterMapping;
import com.mppkvvcl.ngbdao.interfaces.ConsumerMeterMappingInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerMeterMappingRepository extends JpaRepository<@NonNull ConsumerMeterMapping, @NonNull Long> {

    ConsumerMeterMappingInterface findById(long id);

    @Query("from #{#entityName} where consumerNo= :consumerNo and (installationBillMonth= :billMonth or removalBillMonth= :billMonth) order by installationDate desc, id desc")
    List<ConsumerMeterMappingInterface> findByConsumerNoAndBillMonthOrderByInstallationDateDescIdDesc(@Param("consumerNo") String consumerNo, @Param("billMonth") String billMonth);
}
