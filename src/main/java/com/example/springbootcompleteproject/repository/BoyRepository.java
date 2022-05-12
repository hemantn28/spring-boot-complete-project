package com.example.springbootcompleteproject.repository;

import com.example.springbootcompleteproject.model.Boy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoyRepository extends JpaRepository<Boy, Integer> {
}
