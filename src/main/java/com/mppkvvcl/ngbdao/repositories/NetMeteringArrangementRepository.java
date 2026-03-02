package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.NetMeteringArrangement;
import com.mppkvvcl.ngbdao.interfaces.NetMeteringArrangementInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NetMeteringArrangementRepository extends JpaRepository<@NonNull NetMeteringArrangement, @NonNull Long> {

    @Query("select c from #{#entityName} c, #{#entityName} p WHERE c.isParent= false and p.groupId= c.groupId and p.consumerNo= :consumerNo and p.isParent= true " +
            "and to_date(:billMonth,'MON-YYYY') between to_date(c.startBillMonth,'MON-YYYY') and to_date(c.endBillMonth,'MON-YYYY') " +
            "and to_date(:billMonth,'MON-YYYY') between to_date(p.startBillMonth,'MON-YYYY') and to_date(p.endBillMonth,'MON-YYYY')")
    List<NetMeteringArrangementInterface> findNonParentByParentConsumerNoAndBillMonthBetween(@Param("consumerNo") String consumerNo, @Param("billMonth") String billMonth);
}
