package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ConsumerMiscellaneousInformation;
import com.mppkvvcl.ngbdao.interfaces.ConsumerMiscellaneousInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerMiscellaneousInformationRepository extends JpaRepository<@NonNull ConsumerMiscellaneousInformation, @NonNull Long> {

    ConsumerMiscellaneousInformationInterface findById(long id);

    @Query("from #{#entityName} m where m.consumerNo= :consumerNo and m.isActive= true")
    List<ConsumerMiscellaneousInformationInterface> findActivePropertyByConsumerNo(@Param("consumerNo") String consumerNo);

    @Query("from #{#entityName} m where m.consumerNo= :consumerNo and m.propertyName= :propertyName and m.isActive= true")
    ConsumerMiscellaneousInformationInterface findActivePropertyByConsumerNoAndPropertyName(@Param("consumerNo") String consumerNo, @Param("propertyName") String propertyName);

    @Query("select m.propertyValue from #{#entityName} m where m.consumerNo= :consumerNo and m.propertyName= :propertyName and m.isActive= true")
    String findActivePropertyValueByConsumerNoAndPropertyName(@Param("consumerNo") String consumerNo, @Param("propertyName") String propertyName);
}
