package com.masters.ExpTracking.Controllers;

import com.masters.ExpTracking.models.Budgets;
import com.masters.ExpTracking.services.BudgetTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
