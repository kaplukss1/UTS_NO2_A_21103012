/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.projectemployess;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class PPlanner_3012 extends employee_3012 {
    public float Komisi_3012;
    public float TotalHslProyek_3012;
    public double Totalgaji_3012;
    
    public PPlanner_3012(){
        
    }
    
    public double TotalGaji_3012(){
        Totalgaji_3012 = gaji_3012 + (Komisi_3012 * TotalHslProyek_3012) - (gaji_3012 * 5/100);
        return Totalgaji_3012;
    }
    
    public void TampilData(){
        System.out.println("Project Planner");
        tampilInfo();
        System.out.println("Total gaji : " + Totalgaji_3012);
    }
}
