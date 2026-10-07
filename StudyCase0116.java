import java.util.Scanner;
public class StudyCase0116 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
    int hargaPerCup = 18000;
    System.out.print("Masukkan jumlah cup yang dibeli: ");
    int jumlahCup = sc.nextInt();
    System.out.print("Masukkan jumlah uang yang dibayarkan: ");
    int uangBayar = sc.nextInt();
    int totalHarga;
    int diskon = 0;
    int totalBayar;
    int kembalian;
    int kurang;

    totalHarga = hargaPerCup * jumlahCup;
    if (totalHarga >= 100000){
        diskon = totalHarga * 10 / 100;
    }
    totalBayar = totalHarga - diskon;
    System.out.println("Total harga: " + totalHarga);
    System.out.println("Diskon: " + diskon);
    System.out.println("Total bayar: " + totalBayar);
    
    if (uangBayar >= totalBayar){
        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian: " + kembalian);
    } else{
        kurang = totalBayar - uangBayar;
        System.out.println("Not enough money short by Rp" + kurang);


    }
    
    sc.close();
    }
    
}
