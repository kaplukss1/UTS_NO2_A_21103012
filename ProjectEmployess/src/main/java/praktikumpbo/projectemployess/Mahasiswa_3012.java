/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package praktikumpbo.projectemployess;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mahasiswa_3012 {

    public static void main(String[] args) {
        Salaried_3012 man = new Salaried_3012();
        Commission_3012 teller = new Commission_3012();
        PPlanner_3012 programer = new PPlanner_3012();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("==================================");
            System.out.println("Data Pegawai");
            System.out.println("==================================");
            System.out.print("Nama       : ");
            man.nama_3012 = br.readLine();
            System.out.print("NIP        : ");
            man.Nip_3012 = br.readLine();
            System.out.print("Gaji Pokok : ");
            man.gaji_3012 = Float.parseFloat(br.readLine());
            man.TampilData();

            System.out.println("==================================");
            System.out.print("Nama            : ");
            teller.nama_3012 = br.readLine();
            System.out.print("NIP             : ");
            teller.Nip_3012 = br.readLine();
            System.out.print("GajiPokok       : ");
            teller.gaji_3012 = Float.parseFloat(br.readLine());
            System.out.print("Komisi          : ");
            teller.Komisi_3012 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan : ");
            teller.TotalPenjualan_3012 = Float.parseFloat(br.readLine());
            teller.TotalGaji();
            teller.TampilData();

            System.out.println("==================================");
            System.out.print("Nama               : ");
            programer.nama_3012 = br.readLine();
            System.out.print("NIP                : ");
            programer.Nip_3012 = br.readLine();
            System.out.print("Gaji Pokok         : ");
            programer.gaji_3012 = Float.parseFloat(br.readLine());
            System.out.print("Komisi             : ");
            programer.Komisi_3012 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek : ");
            programer.TotalHslProyek_3012 = Float.parseFloat(br.readLine());
            programer.TotalGaji_3012();
            programer.TampilData();
            System.out.println("==================================");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
