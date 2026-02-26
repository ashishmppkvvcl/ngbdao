package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.CircleECGRFInformation;
import com.mppkvvcl.ngbdao.interfaces.CircleECGRFInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CircleECGRFInformationRepository extends JpaRepository<@NonNull CircleECGRFInformation, @NonNull Long> {

    CircleECGRFInformationInterface findById(long id);

    List<CircleECGRFInformationInterface> findByCircleIdOrderByIndexAsc(long circleId);
}
