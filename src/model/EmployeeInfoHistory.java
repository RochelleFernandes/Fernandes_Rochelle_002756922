/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author roche
 */
public class EmployeeInfoHistory {
    
    private ArrayList<EmployeeInfo> history;
    
    public EmployeeInfoHistory(){
        
        this.history = new ArrayList<EmployeeInfo>();
        
    }

    public ArrayList<EmployeeInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeInfo> history) {
        this.history = history;
    }
    
    public EmployeeInfo addNewInfo(){
      
        EmployeeInfo newInfo = new EmployeeInfo();
        history.add(newInfo);
        return newInfo;
        
    }
    
    public void deleteInfo(EmployeeInfo ei){
        history.remove(ei);
       
    }
    
    
    
}
