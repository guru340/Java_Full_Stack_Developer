package com.cfs.JPAP02.Repo;

import com.cfs.JPAP02.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
