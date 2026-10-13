package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Authentity;

@Repository
public interface Authrepo extends JpaRepository<Authentity,Long> {
Authentity findByEmail(String email);
}