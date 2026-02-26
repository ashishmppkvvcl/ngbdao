package com.mppkvvcl.ngbdao.daos;

import com.mppkvvcl.ngbdao.interfaces.UserDetailInterface;
import com.mppkvvcl.ngbdao.repositories.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailDAO {

    @Autowired
    private UserDetailRepository userDetailRepository;

    public UserDetailInterface get(final UserDetailInterface userDetail) {
        if (userDetail == null) return null;

        return userDetailRepository.findById(userDetail.getId());
    }

    public UserDetailInterface getById(long id) {

        return userDetailRepository.findById(id);
    }

    public UserDetailInterface getByUsername(String username) {
        if (username == null) return null;

        return userDetailRepository.findByUsername(username);
    }

    public List<UserDetailInterface> getByLocationCodeAndRoleAndStatus(final String locationCode, final String role, String status) {
        if (locationCode == null || role == null || status == null) return null;

        return userDetailRepository.findByLocationCodeAndRoleAndStatus(locationCode, role, status);
    }
}
