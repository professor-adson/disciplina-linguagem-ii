package aula10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Teste t = new Teste();
        t.setX("A");

        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\Public\\Documents");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(t);

            oos.close();
            System.out.println("Done");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
