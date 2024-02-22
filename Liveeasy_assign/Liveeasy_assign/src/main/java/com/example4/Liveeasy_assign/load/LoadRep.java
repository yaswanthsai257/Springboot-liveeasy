package com.example4.Liveeasy_assign.load;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRep extends JpaRepository<Load, Integer> {
}
