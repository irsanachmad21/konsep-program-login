import java.util.*;
public class login{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklar
        String user,pw;
        int kesempatan=1; //percobaan Memasukan Password hanya sampai 6X

        //proses
        System.out.println("=== KESEMPATAN ANDA HANYA 5 KALI ===");
        do {
            System.out.println("\n===PERCOBAAN KE "+kesempatan+"===");
            System.out.print("masukan username anda : ");
            user = input.next();
            System.out.print("masukan password anda : ");
            pw = input.next();
            
            if (user.equals("admin") && pw.equals("123")) {
                System.out.println("=== WELCOME BOSSQUUUUEEE ===");
            } else{
                System.out.println("!!! AKUN TIDAK DITEMUKAN !!!");
            }
            
            kesempatan++;

            if (kesempatan==6) {
                System.out.println("!!! KESEMPATAN SUDAH HABIS !!!");
            }
            
            
        } while ((!user.equals("admin") || !pw.equals("123")) && kesempatan<6);

        input.close();
    }
}