package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.CircleECGRFInformation;
import com.mppkvvcl.ngbdao.interfaces.CircleECGRFInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CircleECGRFInformationRepository extends JpaRepository<@NonNull CircleECGRFInformation, @NonNull Long> {

    CircleECGRFInformationInterface findById(long id);

    @Query("from #{#entityName} c where c.circleId= :circleId and (to_date(:billMonth,'MON-YYYY') >= to_date(c.startBillMonth,'MON-YYYY')) and (to_date(:billMonth,'MON-YYYY') <= to_date(c.endBillMonth,'MON-YYYY'))")
    List<CircleECGRFInformationInterface> findByCircleIdAndMonthOrderByIndexAsc(@Param("circleId") long circleId, @Param("billMonth") String billMonth);
}
