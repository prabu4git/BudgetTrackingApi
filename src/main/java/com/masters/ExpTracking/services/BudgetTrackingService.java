package com.masters.ExpTracking.services;

import com.masters.ExpTracking.entity.Expenses;
import com.masters.ExpTracking.entity.repository.ExpenseRepository;
import com.masters.ExpTracking.models.Budgets;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BudgetTrackingService {

    @Autowired
    private SheetsQuickstart sheetsQuickstart=new SheetsQuickstart();

    @Autowired
    private ExpenseRepository expenseRepository;

    private ModelMapper modelMapper = new ModelMapper();

    public List<Budgets> findAllData() throws Exception{

        List<Expenses> expensesList =  this.expenseRepository.findAll();
        System.out.println("********************"+expensesList.size());
        List<Budgets> budgetsList = null;
        if(expensesList.size()==0){
            expensesList = this.sheetsQuickstart.googleBudgetTrackingData();
            this.expenseRepository.saveAll(expensesList);
            budgetsList = modelMapper.map(expensesList, new TypeToken<List<Budgets>>() {}.getType());
            //expensesList = this.modelMapper.map(budgetsList, new TypeToken<List<Expenses>>() {}.getType());
            //this.expenseRepository.saveAll(expensesList);
        }else{
            budgetsList = modelMapper.map(expensesList, new TypeToken<List<Budgets>>() {}.getType());
        }
        return budgetsList;
    }

    public Budgets saveExpenses(Budgets budgets){
        Expenses expenses = modelMapper.map(budgets,Expenses.class);
        this.expenseRepository.save(expenses);
        return budgets;
    }
}

