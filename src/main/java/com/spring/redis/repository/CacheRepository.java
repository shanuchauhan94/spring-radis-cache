package com.spring.redis.repository;

import com.spring.redis.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CacheRepository extends JpaRepository<Employee, Integer> {
}
