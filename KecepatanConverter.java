/**
 * program untuk mengkonversi kecepatan dari meter per detik (m/s) ke kilometer per detik (km/s)
 */

public class KecepatanConverter {

    public static void main(String[] args) {
        /**
         * Metode utama menjalankan program konversi kecepatan dari m/sekon ke km/jam
         * @param mps meter per detik
         * @param mpstokmph faktor konversi m/s ke km/h
         */
        //kecepatan m/s
        double mps = 20.0;
        //konversi m/s ke km/h
        double mpstokmph = 3.6;
        //rumus menghitung kecepatan kilomtere/jam (km/h)
        double kmph = mps*mpstokmph;

        /**
         * hasil kilometer/jam
         *
         */
        System.out.println("Kecepatan m/s: " + mps);
        System.out.println("Kecepatan km/h: " + kmph);
    }



}


