package com.mppkvvcl.ngbdao.repositories;


import com.mppkvvcl.ngbdao.beans.EmployeeConnectionMapping;
import com.mppkvvcl.ngbdao.interfaces.EmployeeConnectionMappingInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeConnectionMappingRepository extends JpaRepository<@NonNull EmployeeConnectionMapping, @NonNull Long> {

    EmployeeConnectionMappingInterface findById(long id);

    @Query("from #{#entityName} where consumerNo= :consumerNo and status= 'ACTIVE'")
    EmployeeConnectionMappingInterface findActiveEmployeeByConsumerNo(@Param("consumerNo") String consumerNo);
}
