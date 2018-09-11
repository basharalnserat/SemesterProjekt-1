package javaapplication15;

//import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Modul01 {

    public static void main(String[] args) {

//        SektionToEt();
//        SektionToTo();
//        SektionToSeks();
//        SektionToSyv();
//        SektionTreOgTyve();
//        OpgaveA1();
//        OpgaveA2();
//        OpgaveA3();
    }

    public static void SektionToEt() {
        Scanner toet = new Scanner(System.in);

        System.out.print("Enter miles: ");
        int i = toet.nextInt();

        System.out.println(i + " miles is " + i * 1.6 + " kilometers");
    }

    public static void SektionToTo() {
        Scanner toto = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Enter length of the sides"
            + " and height of the Equilateral: ");

        double i = toto.nextDouble();
        double area = ((Math.sqrt(3)) / 4.0 * Math.pow(i, 2));
        area = Double.valueOf(df.format(area));

        double volume = area * i;
        volume = Double.valueOf(df.format(volume));
        System.out.println("The area is " + area);

        System.out.println("The volume of the Triangular prism is: " + volume);
    }

    public static void SektionToSeks() {
        Scanner toseks = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int i = toseks.nextInt();

        int førsteTal = i / 100;
        int andetTal = (i - førsteTal * 100) / 10;
        int tredjeTal = (i - (førsteTal * 100 + andetTal * 10));

        System.out.println("The multiplication of all digits in " + i
            + " is " + (førsteTal * andetTal * tredjeTal));
    }

    public static void SektionToSyv() {
        Scanner tosyv = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        int i = tosyv.nextInt();

        double år = i / 60.0 / 24 / 365;
        int år2 = (int) år;
        double dage = (år - år2) * 365;
        int dage2 = (int) dage;
        System.out.println(i + " minutes is approximately "
            + år2 + " years and " + dage2 + " days ");
    }

    public static void SektionTreOgTyve() {
        Scanner treogtyve = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the driving distance (km): ");
        double distance = treogtyve.nextDouble();
        System.out.print("Enter km per liter: ");
        double kpl = treogtyve.nextDouble();
        System.out.print("Enter price per liter: ");
        double ppl = treogtyve.nextDouble();

        double price = (distance / kpl) * ppl;

        System.out.println("The cost of driving is "
            + String.format("%.2f", price) + "kr");
        
    }

    public static void OpgaveA1() {

        System.out.println("Arealet af en cirkel med radius 1 er: "
            + String.format("%.3f", Math.PI * Math.pow(1, 2)));

        System.out.println("Arealet af en cirkel med radius 2 er: "
            + String.format("%.3f", Math.PI * Math.pow(2, 2)));

        System.out.println("Arealet af en cirkel med radius 3 er: "
            + String.format("%.3f", Math.PI * Math.pow(3, 2)));

        System.out.println("Arealet af en cirkel med radius 4 er: "
            + String.format("%.3f", Math.PI * Math.pow(4, 2)));

        System.out.println("Arealet af en cirkel med radius 5 er: "
            + String.format("%.3f", Math.PI * Math.pow(5, 2)));

    }

    public static void OpgaveA2() {
        double omkredsc1 = 2 * Math.PI * 3;
        double omkredsc2 = 2 * Math.PI * 7;

        System.out.println(omkredsc1 + omkredsc2);
    }

    public static void OpgaveA3() {
        //DecimalFormat df = new DecimalFormat("#.#");
        //df.setRoundingMode(RoundingMode.CEILING);
        double diffTM = Math.abs(23.7 - 21.5);
        double diffOT = Math.abs(23.7-19.6);
        double diffTO = Math.abs(19.6-22.5);
        double diffFT = Math.abs(22.5-25.3);
        double diffLF = Math.abs(25.3-21.7);
        double diffSL = Math.abs(21.7-18.9);
        
        System.out.println(String.format("%.1f", diffTM));
        System.out.println(String.format("%.1f", diffOT));
        System.out.println(String.format("%.1f", diffTO));
        System.out.println(String.format("%.1f", diffFT));
        System.out.println(String.format("%.1f", diffLF));
        System.out.println(String.format("%.1f", diffSL));
    }
}
