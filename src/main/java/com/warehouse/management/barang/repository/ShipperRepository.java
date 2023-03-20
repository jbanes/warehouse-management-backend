package com.warehouse.management.barang.repository;

import com.warehouse.management.barang.domain.dao.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Long> {

}
