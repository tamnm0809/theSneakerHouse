package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Table(name = "VNPAY")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VNPay {
    @Id
    private Long id;

    @Column(name = "vnp_Amount", nullable = false, precision = 18, scale = 0)
    private BigDecimal vnp_Amount;

    @Column(name = "vnp_Bank_Code", nullable = false, length = 255)
    private String vnp_Bank_Code;

    @Column(name = "vnp_Bank_Tran_No", nullable = false, length = 50)
    private String vnp_Bank_Tran_No;

    @Column(name = "vnp_Card_Type", nullable = false, length = 255)
    private String vnp_Card_Type;

    @Column(name = "vnp_Order_Info", nullable = false, length = 255)
    private String vnp_Order_Info;

    @Column(name = "vnp_Pay_Day", nullable = false, length = 255)
    private String vnp_Pay_Day;

    @Column(name = "vnp_Response_Code", nullable = false, length = 255)
    private String vnp_Response_Code;

    @Column(name = "vnp_Tmn_Code", nullable = false, length = 255)
    private String vnp_TmnCode;

    @Column(name = "vnp_Transaction_No", nullable = false, length = 255)
    private String vnp_Transaction_No;

    @Column(name = "vnp_Transaction_Status", nullable = false, length = 255)
    private String vnp_Transaction_Status;

    @Column(name = "vnp_Txn_Ref", nullable = false, length = 255)
    private String vnp_TxnRef;

    @Column(name = "vnp_Secure_Hash", nullable = false, length = 255)
    private String vnp_Secure_Hash;

    @ManyToOne
    @JoinColumn(name = "id_ord", nullable = false)
    private Order order;
}
