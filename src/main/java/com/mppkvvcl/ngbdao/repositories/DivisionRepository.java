package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.Division;
import com.mppkvvcl.ngbdao.interfaces.DivisionInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<@NonNull Division, @NonNull Long> {

    DivisionInterface findById(long id);
}
