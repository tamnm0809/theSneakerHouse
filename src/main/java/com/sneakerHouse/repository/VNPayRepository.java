package com.sneakerHouse.repository;

import com.sneakerHouse.entity.VNPay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VNPayRepository extends JpaRepository<VNPay, Long> {
}
