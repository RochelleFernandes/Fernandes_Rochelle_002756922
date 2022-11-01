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
public class HospitalDirectory {
    private ArrayList<HospitalData> hospitaldirectory;
    
    public HospitalDirectory(){
        
        this.hospitaldirectory = new ArrayList<HospitalData>();
    
}

    public ArrayList<HospitalData> getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(ArrayList<HospitalData> hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }
    
    public HospitalData addNewInfo(){
      
        HospitalData newInfo = new HospitalData();
        hospitaldirectory.add(newInfo);
        return newInfo;
        
    }
}
