import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.toUpperCase;

/**
 * Created by Vika on 19.12.16.
 */
public class UpperCase implements Runnable {

    List<Character> mlistForWritting;

    public UpperCase(){
        this.mlistForWritting = MyStream.write();
    }

    @Override
    public void run() {
        for (int i = 0; i < mlistForWritting.size(); i++) {
            if (mlistForWritting.get(i) == '\u0020'){
                Thread.yield();
            }
            else{
                System.out.print(toUpperCase(mlistForWritting.get(i)) + " ");
            }
        }
    }
}

