package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ReadMasterExport;
import com.mppkvvcl.ngbdao.interfaces.ReadMasterExportInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReadMasterExportRepository extends JpaRepository<@NonNull ReadMasterExport, @NonNull Long> {

    ReadMasterExportInterface findById(long id);

    List<ReadMasterExportInterface> findByConsumerNoAndBillMonthAndReplacementFlagAndUsedOnBill(String consumerNo, String billMonth, String replacementFlag, boolean usedOnBill, Sort sort);
}
