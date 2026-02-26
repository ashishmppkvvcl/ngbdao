package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.UserDetail;
import com.mppkvvcl.ngbdao.interfaces.UserDetailInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailRepository extends JpaRepository<@NonNull UserDetail, @NonNull Long> {

    UserDetailInterface findById(long id);

    UserDetailInterface findByUsername(String username);

    List<UserDetailInterface> findByLocationCodeAndRoleAndStatus(String locationCode, String role, String status);
}
