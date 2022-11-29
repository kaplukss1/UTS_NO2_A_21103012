/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.projectemployess;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class Commission_3012 extends employee_3012 {

    public float Komisi_3012;
    public float TotalPenjualan_3012;
    public float Totalgaji_3012;

    public Commission_3012() {

    }

    public float TotalGaji() {
        Totalgaji_3012 = gaji_3012 + (Komisi_3012 * TotalPenjualan_3012);
        return Totalgaji_3012;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        tampilInfo();
        System.out.println("Total gaji : " + Totalgaji_3012);
    }
}
