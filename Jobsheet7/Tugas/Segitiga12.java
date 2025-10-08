package Jobsheet7.Tugas;

public class Segitiga12 {

    int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    double keliling(int sisiA, int sisiB) {
         return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

}
