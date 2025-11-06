package com.cfs.Notification_Gateway.Rep;

import com.cfs.Notification_Gateway.Enitity.PayementOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayementRepo extends JpaRepository<PayementOrder, Long> {

   PayementOrder  findByOrderId(String orderId);
}
