package Jobsheet3.Percobaan1Dan2;

public class MotorDemo12 {
      public static void main(String[] args) {
        Motor12 motor1 = new Motor12();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setIsMesinOn(true);
        motor1.setKecepatan(124);
        motor1.displayStatus();

        Motor12 motor2 = new Motor12();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(-8);
        motor2.displayStatus();

        Motor12 motor3 = new Motor12();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();

    }
}
