package com.expenses.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expenses.entity.Expense;

public interface ExpenseRepository  extends JpaRepository<Expense, Long>{

}
