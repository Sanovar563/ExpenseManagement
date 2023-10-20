package com.expenses.Serviceimpl;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenses.Exception.ResourceNotFoundException;
import com.expenses.Repository.ExpenseRepository;
import com.expenses.Service.ExpenseService;
import com.expenses.entity.Expense;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

   
    @Override
    @Transactional
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Expense not found with id: "+ "Id" + id, id));
    }
}
