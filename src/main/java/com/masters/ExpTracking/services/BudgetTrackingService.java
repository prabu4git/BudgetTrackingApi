package com.masters.ExpTracking.services;

import com.masters.ExpTracking.models.Budgets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetTrackingService {

    @Autowired
    private SheetsQuickstart sheetsQuickstart=new SheetsQuickstart();

    public List<Budgets> findAllData() throws Exception{
        return this.sheetsQuickstart.googleBudgetTrackingData();
    }
}

