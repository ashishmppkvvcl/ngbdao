package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.BillTypeCode;
import com.mppkvvcl.ngbdao.interfaces.BillTypeCodeInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillTypeCodeRepository extends JpaRepository<@NonNull BillTypeCode, @NonNull Long> {

    BillTypeCodeInterface findById(long id);

    BillTypeCodeInterface findByCode(String code);
}
