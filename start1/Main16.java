package start;

public class Main16 {

    public static void main(String[] args) {
        int maas1 = 5000;
        String maas2 = String.valueOf(maas1);     // INT to STRING
        System.out.println(maas2);   // 5000

        String maas3 = "5000";
        int maas4 = Integer.parseInt(maas3);      // STRING to INT
        System.out.println(maas4);   // 5000

        String isValidString = "true";      // STRING to BOOLEAN
        boolean isValid = Boolean.parseBoolean(isValidString);
        if (isValid) {
            System.out.println("OHD");    // OHD
        }
    }
}
/*
5000
5000
OHD
 */
