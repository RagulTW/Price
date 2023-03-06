package com.thoughtworks.pricing.repository;

import com.thoughtworks.pricing.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepository extends JpaRepository<Price,Integer> {
}
