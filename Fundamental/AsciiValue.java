package Fundamental;
// w a java prg to find Asci Value of given Number.
import java.io.*;


public class AsciiValue {

        static void convertToASCII(int N)
        {
            while (N > 0) {
                int d = N % 10;
                System.out.println(d + " (" + (d + 48) + ")");

                N = N / 10;
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            int N = 54;
            convertToASCII(N);
        }
    }



