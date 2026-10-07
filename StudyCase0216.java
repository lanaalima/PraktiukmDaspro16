import java.util.Scanner;
public class StudyCase0216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa : ");
        String studentName = sc.nextLine();

        System.out.print("Masukkan jenis kegiatan BELMAWA, BAKORMA, Mandiri, PKM, or Lainnya (Others) : ");
        String activityType = sc.nextLine();
        System.out.print("Masukkan Jumlah Dokumen yang Diunggah (0-4): ");
        int docsUploaded = sc.nextInt();
        if (docsUploaded < 4) {
            int missingDocs = 4 - docsUploaded;
            System.out.println("Nama mahasiswa: " + studentName);
            System.out.println("Status: DITOLAK (Dana tidak diberikan)");
            System.out.println("Alasan: Dokumen tidak lengkap. Masih kurang " + missingDocs + " dokumen.");
        } else {
            if (activityType.equalsIgnoreCase("BELMAWA") || 
            activityType.equalsIgnoreCase("BAKORMA") || 
            activityType.equalsIgnoreCase("Mandiri")) {
            }
            System.out.print("Masukan Peringkat Juara 1 / 2 / 3 / 0 Jika Tidak Juara: ");
            int rank = sc.nextInt();
            if (rank >= 1 && rank <= 3) {
                    System.out.println("Nama mahasiswa: " + studentName);
                    System.out.println("Status: DITERIMA (Mendapatkan dana penghargaan)");
                    System.out.println("Alasan: Juara " + rank + " pada kegiatan " + activityType + " dan dokumen lengkap.");
                } else {
                    System.out.println("Nama mahasiswa: " + studentName);
                    System.out.println("Status: DITOLAK (Dana tidak diberikan)");
                    System.out.println("Alasan: Hanya Juara 1, 2, dan 3 yang berhak menerima dana.");
                }  if (activityType.equalsIgnoreCase("PKM")) {
                
                System.out.print("Masukkan Status Pendanaan PKM (1 = funded, 0 = not funded): ");
                int pkmStatus = sc.nextInt();

                if (pkmStatus == 1) {
                    System.out.println("Nama mahasiswa: " + studentName);
                    System.out.println("Status: DITERIMA (Mendapatkan dana penghargaan)");
                    System.out.println("Alasan: Tim lolos pendanaan PKM dan dokumen lengkap.");
                } else {
                    System.out.println("Nama mahasiswa: " + studentName);
                    System.out.println("Status: DITOLAK (Dana tidak diberikan)");
                    System.out.println("Alasan: Tim PKM tidak lolos pendanaan.");
                }

            } else {
                
                System.out.println("Nama mahasiswa: " + studentName);
                System.out.println("Status: DITOLAK (Dana tidak diberikan)");
                System.out.println("Alasan: Jenis kegiatan '" + activityType + "' tidak termasuk dalam skema penerima dana.");
            }
        }
            sc.close();
        }
            }
            
        

        
    

