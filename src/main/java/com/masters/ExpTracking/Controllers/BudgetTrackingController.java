package com.masters.ExpTracking.Controllers;

import com.masters.ExpTracking.models.Budgets;
import com.masters.ExpTracking.services.BudgetTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value="{id}")
    public Budgets findById(@PathVariable String id) throws Exception{
        return this.budgetTrackingService.findById(UUID.fromString(id));
    }

    @PostMapping
    public void createExpense(@RequestBody Budgets budgets){
         this.budgetTrackingService.saveExpenses(budgets);
         new ResponseEntity<String>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateExpenses(@RequestBody Budgets budgets){
         this.budgetTrackingService.saveExpenses(budgets);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @DeleteMapping(value="{id}")
    public ResponseEntity deleteExpense(@PathVariable String id){

        this.budgetTrackingService.deleteExpense(UUID.fromString(id));
       return new ResponseEntity<String>(HttpStatus.OK);
    }
}
