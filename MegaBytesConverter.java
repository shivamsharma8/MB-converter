public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if ( kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            int mb = kiloBytes / 1024;
            int remainingkb = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " +
                    mb + " MB and " + remainingkb + " KB");
        }
    }
}
