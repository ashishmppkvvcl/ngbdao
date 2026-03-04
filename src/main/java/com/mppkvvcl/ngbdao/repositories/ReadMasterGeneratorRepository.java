package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ReadMasterGenerator;
import com.mppkvvcl.ngbdao.interfaces.ReadMasterGeneratorInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReadMasterGeneratorRepository extends JpaRepository<@NonNull ReadMasterGenerator, @NonNull Long> {

    ReadMasterGeneratorInterface findById(long id);

    List<ReadMasterGeneratorInterface> findByConsumerNoAndBillMonthAndReplacementFlag(String consumerNo, String billMonth, String replacementFlag, Sort sort);
}
