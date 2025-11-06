package com.cfs.Notification_Gateway.Controller;

import com.cfs.Notification_Gateway.Enitity.PayementOrder;
import com.cfs.Notification_Gateway.Rep.PayementRepo;
import com.cfs.Notification_Gateway.Services.PayementService;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/payment")
public class PayementController {
    @Autowired
    private PayementService payementService;


    @PostMapping("/create-order")
    public ResponseEntity<String> createOrder(@RequestBody PayementOrder order){
        System.out.println("inside controller..........");
            try {
                String ser=payementService.createOrder(order);
                return ResponseEntity.ok(ser);
            } catch (Exception e) {
               return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                       body("Error while creating order");
            }
    }

    @PostMapping("/update-order")
    public ResponseEntity<String> updateOrderStatus(@RequestParam String paymentId,
                                                    @RequestParam String orderId,
                                                    @RequestParam String status)
    {
        payementService.updateOrderStatus(paymentId,orderId,status);
        System.out.println("order place successfully....");
        return ResponseEntity.ok("Order updated Successfully...");
    }
}
