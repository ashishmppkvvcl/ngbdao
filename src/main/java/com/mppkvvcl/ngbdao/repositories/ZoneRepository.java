package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.Zone;
import com.mppkvvcl.ngbdao.interfaces.ZoneInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<@NonNull Zone, @NonNull Long> {

    ZoneInterface findById(long id);

    ZoneInterface findByCode(String code);
}
