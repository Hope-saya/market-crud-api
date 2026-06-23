package com.hope.marketcrudapi.repository;

import com.hope.marketcrudapi.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;

/* PARepository has built-in CRUD methods that we could use
e.g save(), findById(), findAll(). <Nameof Table, Data type of the PK>
Interface will be used by the Service layer*/

public interface marketRepository extends JpaRepository<Market, Long> {
}
