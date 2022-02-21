import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * Created: 17.01.2022
 *
 * @author Kilian Baier (20190608)
 */
public class CheckInt {


    public static void createFile(String filename, double... values) throws IOException {
        Files.deleteIfExists(Path.of(filename));
        Path newFilename = Files.createFile(Path.of(filename).toAbsolutePath());
        DataOutputStream writer = new DataOutputStream(new FileOutputStream(String.valueOf(newFilename)));
        writer.writeInt(values.length);
        for (double value : values) {
            writer.writeDouble(value);
        }
        writer.close();
    }

    public static boolean isValidFile(String filename) throws IOException {
        File newFilename = new File(String.valueOf(Path.of(filename).toAbsolutePath()));
        RandomAccessFile raf = new RandomAccessFile(String.valueOf(newFilename), "r");
        raf.seek(0);
        int intFromFile = raf.readInt();
        raf.close();
        return intFromFile * Double.BYTES == (Files.readAllBytes(Paths.get(String.valueOf(newFilename))).length - Integer.BYTES);
    }


    public static String getFileInfo(String filename) throws IOException {
        StringBuilder build = new StringBuilder();
        if (!isValidFile(filename)) {
            return "invalid File";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        File newFilename = new File(String.valueOf(Path.of(filename).toAbsolutePath()));
        RandomAccessFile raf = new RandomAccessFile(String.valueOf(newFilename), "r");
        build.append("Values: " + raf.readInt());
        build.append("\n");
        raf.seek(0);
        int int_count = raf.readInt();
        String tmp;
        Double tmp1;
        while (int_count > 0) {
            tmp1 = raf.readDouble();
            if (tmp1 == Double.POSITIVE_INFINITY || tmp1 == Double.NEGATIVE_INFINITY) {
                tmp = String.valueOf(tmp1);
            } else {
                tmp = decimalFormat.format(tmp1);
            }

            if (int_count != 1) {
                build.append(tmp + " ");
            } else {
                build.append(tmp);
            }
            int_count--;
        }
        raf.close();
        return String.valueOf(build);
    }


    //Frage für Unterricht (Warum kann ich den toAppend double nicht mit raf.writeDouble(); printen? Sondern nur mit dos??
    public static void append(String filename, double toAppend) throws IOException {
        if (!isValidFile(filename)) {
            throw new IllegalArgumentException(filename + " invalid");
        } else {
            RandomAccessFile raf = new RandomAccessFile(String.valueOf(filename), "rw");
          //  DataOutputStream dos = new DataOutputStream(new FileOutputStream(String.valueOf(filename), true));
            int test = (raf.readInt()+1);
            raf.seek(0);
            raf.writeInt(test);
            raf.seek(test*Integer.BYTES+1);
            raf.writeDouble(toAppend);
            raf.close();
           // dos.close();
        }
    }

    //DUMME VARIANTE
    public static void append2(String filename, double toAppend) throws IOException {
        if (!isValidFile(filename)) {
            throw new IllegalArgumentException(filename + " invalid");
        } else {
            RandomAccessFile raf = new RandomAccessFile(String.valueOf(filename), "rw");
            int length = (int) (raf.length() - 1) / 8;
            int idx = 0;
            double[] doubleArr = new double[length + 1];
            while (idx != length) {
                doubleArr[idx] = raf.readDouble();
                idx++;
            }
            doubleArr[length] = toAppend;
            raf.close();
            Files.deleteIfExists(Path.of(filename).toAbsolutePath());
            createFile(filename, doubleArr);
        }
    }
}





