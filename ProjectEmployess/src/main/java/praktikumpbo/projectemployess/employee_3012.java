/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.projectemployess;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class employee_3012 {
    
    protected String nama_3012;
    protected String Nip_3012;
    protected float gaji_3012;

    public employee_3012() {

    }

    public employee_3012(String nama, int gaji, String Nip) {
        this.nama_3012 = nama_3012;
        this.gaji_3012 = gaji_3012;
        this.Nip_3012 = Nip_3012;
    }

    public void tampilInfo() {
        System.out.println("nama : " + nama_3012);
        System.out.println("gaji : " + gaji_3012);
        System.out.println("Nip  : " + Nip_3012);
    }
}
