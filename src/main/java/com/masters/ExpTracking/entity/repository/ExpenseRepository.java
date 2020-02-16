package com.masters.ExpTracking.entity.repository;

import com.masters.ExpTracking.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExpenseRepository extends JpaRepository<Expenses, UUID> {

}
