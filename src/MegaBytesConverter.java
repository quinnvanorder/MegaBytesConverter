public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long remainingKilobytes = kiloBytes % 1024;
            long megabytes = (kiloBytes - remainingKilobytes) / 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }
}
