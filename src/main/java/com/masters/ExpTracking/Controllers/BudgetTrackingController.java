package com.masters.ExpTracking.Controllers;

import com.masters.ExpTracking.models.Budgets;
import com.masters.ExpTracking.services.BudgetTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/budget")
public class BudgetTrackingController {

    @Autowired
    private BudgetTrackingService budgetTrackingService;

    @GetMapping
    public List<Budgets> findAllExpenses() throws Exception{
       return this.budgetTrackingService.findAllData();
    }

    @PostMapping
    public Budgets createExpense(@RequestBody Budgets budgets){
        return this.budgetTrackingService.saveExpenses(budgets);
    }

    @PutMapping
    public Budgets updateExpenses(@RequestBody Budgets budgets, UUID id){
        return this.budgetTrackingService.saveExpenses(budgets);
    }
}
