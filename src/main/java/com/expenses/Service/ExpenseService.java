package com.expenses.Service;

import com.expenses.entity.Expense;

public interface ExpenseService {
	
	   Expense createExpense(Expense expense);
	    Expense getExpenseById(Long id);
}

	
