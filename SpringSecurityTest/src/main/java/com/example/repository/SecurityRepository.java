package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Security;

// Repository that handles DAO functions to and from security table.
@Repository
public interface SecurityRepository extends JpaRepository<Security, Long>{
	Security findByEmail(String email);
}
