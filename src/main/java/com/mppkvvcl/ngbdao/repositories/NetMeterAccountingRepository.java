package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.NetMeterAccounting;
import com.mppkvvcl.ngbdao.interfaces.NetMeterAccountingInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetMeterAccountingRepository extends JpaRepository<@NonNull NetMeterAccounting, @NonNull Long> {

    public NetMeterAccountingInterface findByBillId(long billId);
}
