package com.mppkvvcl.ngbdao.repositories;

import com.mppkvvcl.ngbdao.beans.ConsumerPanchnamaInformation;
import com.mppkvvcl.ngbdao.interfaces.ConsumerPanchnamaInformationInterface;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerPanchnamaInformationRepository extends JpaRepository<@NonNull ConsumerPanchnamaInformation, @NonNull Long> {

    ConsumerPanchnamaInformationInterface findById(long id);

    List<ConsumerPanchnamaInformationInterface> findByConsumerNoAndPostedAndDeleted(String consumerNo, boolean posted, boolean deleted);
}
