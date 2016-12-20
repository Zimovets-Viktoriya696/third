import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vika on 12.12.16.
 */
public class MyStream {

    public static List<Character> write (){
        List<Character> list = new ArrayList<Character>();
        try {
            FileInputStream inputStream = new FileInputStream("D:\\ex\\source.txt");
            // Создаем поток-записи-байт-в-файл
            FileOutputStream outputStream = new FileOutputStream("D:\\ex\\result.txt");
            while (inputStream.available() > 0){ //пока есть еще непрочитанные байты
                int data = inputStream.read(); // прочитать очередной байт в переменную data
                outputStream.write(data); // и записать его во второй поток
                list.add((char)data);
            }
            inputStream.close(); //закрываем оба потока. Они больше не нужны.
            outputStream.close();
        }
        catch (FileNotFoundException e) {

            e.printStackTrace();}
        catch (IOException e){
            e.printStackTrace();}

        return list;
    }

    public static void main(String[] args) {

        UpperCase myStream1 = new UpperCase();
        Thread thread1 = new Thread(myStream1);
        thread1.start();

        LowerCase myStream2 = new LowerCase();
        Thread thread2 = new Thread(myStream2);
        thread2.start();

    }

}

