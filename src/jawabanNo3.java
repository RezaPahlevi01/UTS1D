import java.util.Scanner;

public class jawabanNo3 {
    public class check {

        static int jumlahplat = 10;
        static int Kudus = 0;
        static int Jakarta = 0;
        static int Jogja = 0;
        static int Karawang = 0;
        static int Solo = 0;
        static int sisakuota = 0;
        static boolean sukses = false;

        String[] InfoPlat = new String[]{"K-Kudus", "B-Jakarta", "AB-Jogja", "T-Karawang", "AD-Solo"};

        public static void main(String[] args) {
            String[] InfoPlat = new String[]{"K-Kudus", "B-Jakarta", "AB-Jogja", "T-Karawang", "AD-Solo"};
            for (int i = 0; i < 8; i++) {
            }
        }

        public static void cekPlatNomor(String kodePlat) {
            if (kodePlat.contains("K")) {
                sukses = true;
                Kudus++;
            } else if (kodePlat.contains("B")) {
                sukses = true;
                Jakarta++;
            } else if (kodePlat.contains("AB")) {
                sukses = true;
                Jogja++;
            } else if (kodePlat.contains("T")) {
                sukses = true;
                Karawang++;
            } else if (kodePlat.contains("AD")) {
                sukses = true;
                Solo++;
            } else {
                sukses = false;
                System.out.println("input yang anda masukkan tidak valid");
            }
        }

        static void plat() {
            Scanner inputData = new Scanner(System.in);
            System.out.println("masukkan nomer plat");
            String plat = inputData.nextLine();

            cekPlatNomor(plat);

            if (sukses) {
                printPlat();
            }
        }

        public static void printPlat() {
            sisakuota = jumlahplat - Kudus - Jakarta - Jogja - Karawang - Solo;
            System.out.println("Jumlah Plat Kudus " + Kudus + "|" + "Jumlah Plat Jakarta" + Jakarta + "|" + "Jumlah Plat Jogja" + Jogja + "|" +
                    "Jumlah Plat Karawang" + Karawang + "|" + "Jumlah Plat Solo" + Solo + "|");
            System.out.println("JUmlah Plat : " + jumlahplat);
        }
    }

    public static void main(String[] args) {
        while (true) {
            check.plat();
        }
    }
}