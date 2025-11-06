package com.cfs.Notification_Gateway.Services;

import com.cfs.Notification_Gateway.Enitity.PayementOrder;
import com.cfs.Notification_Gateway.Rep.PayementRepo;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PayementService {
    @Value("${razorpay.keyId}")
    private String KeyId;

    @Value("${razorpay.keySecret}")
    private String KeySecert;

    @Autowired
    private PayementRepo payementRepo;

    @Autowired
    private EmailService emailService;


    public String createOrder(PayementOrder orderDetails) throws RazorpayException {
        System.out.println("inside service..........");
        RazorpayClient client=new RazorpayClient(KeyId,KeySecert);
        System.out.println("Eroorrr");
//        json
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("amount",orderDetails.getAmount()*100);
        jsonObject.put("currency","INR");
        jsonObject.put("receipt","txn_"+ UUID.randomUUID());

        Order razopayorder=client.orders.create(jsonObject);
        System.out.println(razopayorder.toString());
        orderDetails.setOrderId(razopayorder.get("id"));
        orderDetails.setStatus("CREATED");
        orderDetails.setCreatedAt(LocalDateTime.now());

        payementRepo.save(orderDetails);
        return razopayorder.toString();
    }



    public void updateOrderStatus(String payementId, String orderId, String status) {

        PayementOrder order=payementRepo.findByOrderId(orderId);
        order.setPayementId(payementId);
        order.setStatus(status);
        payementRepo.save(order);
        if("SUCCESS".equalsIgnoreCase(order.getStatus()))
        {
            emailService.sendEmail(order.getEmail(),order.getName(),order.getCourseName(), order.getAmount());

        }
    }
}
