package com.hope.marketcrudapi.repository;

import com.hope.marketcrudapi.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface marketRepository extends JpaRepository<Market, Long> {
}
