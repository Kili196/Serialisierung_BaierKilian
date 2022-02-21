import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Numbers {


    public static List<Number> getContents(String filename) throws IOException {
        File newFilename = new File(String.valueOf(Path.of(filename).toAbsolutePath()));
        RandomAccessFile raf = new RandomAccessFile(String.valueOf(newFilename), "r");
        raf.seek(0);
        int lenght = (int) (newFilename.length()/Double.BYTES);
        int count = 0;
        byte b1;
        List<Number> number = new ArrayList<>();
        while(count != lenght){
            count--;
            try{
                b1 = raf.readByte();
            }
            catch (IOException e){
                break;
            }
                if(b1 == 0){
                    try{
                        number.add(raf.readInt());
                    }
                    catch (IOException e){
                        throw new IllegalArgumentException();
                    }
                }
                else{
                    try{
                        number.add(raf.readDouble());
                    }
                    catch (IOException e){
                        throw new IllegalArgumentException();
                    }
                }
            }
        raf.close();
        return number;
        }


    public static void createFile(String testfileName, List<Number> objects) throws IOException {
        Path newFilename = Files.createFile(Path.of(testfileName).toAbsolutePath());
        DataOutputStream writer = new DataOutputStream(new FileOutputStream(String.valueOf(newFilename)));
        for(Number object : objects){
            if(object.getClass() == Integer.class){
                writer.writeByte(0);
                writer.writeInt(object.intValue());
            }
            if(object.getClass() == Double.class){
                writer.writeByte(1);
                writer.writeDouble(object.doubleValue());
            }
        }
        writer.close();
    }

    public static Map<String, Set<Number>> groupByType(List<? extends Number> numbers){
        Map<String, Set<Number>> retmap = new HashMap<>();
        Set<Number> retset = new TreeSet<>();
        for(Number num1: numbers){
            retset.clear();
            if(num1.getClass() == Integer.class){
                if(!retmap.containsKey("Integer")){
                    retset.add(num1.intValue());
                    retmap.put("Integer", new TreeSet<>(retset));
                }
                retset = retmap.get("Integer");
                retset.add(num1.intValue());
                retmap.put("Integer", new TreeSet<>(retset));
            }
            if(num1.getClass() == Byte.class){
                if(!retmap.containsKey("Byte")){
                    retset.add(num1.byteValue());
                    retmap.put("Byte", new TreeSet<>(retset));
                }
                    retset = retmap.get("Byte");
                    retset.add(num1.byteValue());
                    retmap.put("Byte", new TreeSet<>(retset));
            }
            if(num1.getClass() == Double.class){
                if(!retmap.containsKey("Double")){
                    retset.add(num1.doubleValue());
                    retmap.put("Double", new TreeSet<>(retset));
                }
                    retset = retmap.get("Double");
                    retset.add(num1.doubleValue());
                    retmap.put("Double", new TreeSet<>(retset));
            }
        }
        return retmap;
    }






}
