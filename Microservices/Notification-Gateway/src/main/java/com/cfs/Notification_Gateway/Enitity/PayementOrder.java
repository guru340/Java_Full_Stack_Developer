package com.cfs.Notification_Gateway.Enitity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment_order")
public class PayementOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String  Email;
    private String Phone;
    private String  CourseName;
    private Double Amount;
    private String orderId;
    private String  PayementId;
    private String Status;
    private LocalDateTime CreatedAt;

    public PayementOrder(Long id, String name, String email, String phone, String courseName, Double amount, String orderId, String payementId, String status, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        Email = email;
        Phone = phone;
        CourseName = courseName;
        Amount = amount;
        this.orderId = orderId;
        PayementId = payementId;
        Status = status;
        CreatedAt = createdAt;
    }

    public  PayementOrder(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayementId() {
        return PayementId;
    }

    public void setPayementId(String payementId) {
        PayementId = payementId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }
}
