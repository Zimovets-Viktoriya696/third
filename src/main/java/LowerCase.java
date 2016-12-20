import java.util.List;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

/**
 * Created by Vika on 20.12.16.
 */
public class LowerCase implements Runnable
{
    private   List<Character> listForWritting;

    public LowerCase(){
        this.listForWritting = MyStream.write();
    }

    @Override
    public void run() {
        for (int i = 0; i < listForWritting.size(); i++) {
            if (listForWritting.get(i) == '\u0020'){
                Thread.yield();
            }
            else {
                System.out.print(toLowerCase(listForWritting.get(i)) + " ");
            }
        }
    }
}

