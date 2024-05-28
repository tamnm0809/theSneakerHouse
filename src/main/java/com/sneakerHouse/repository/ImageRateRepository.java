package com.sneakerHouse.repository;

import com.sneakerHouse.entity.ImageRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRateRepository extends JpaRepository<ImageRate, Long> {
}
