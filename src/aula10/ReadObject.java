package aula10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        Teste t;

        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\Public\\Documents\\object.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);

            t = (Teste) ois.readObject();
            ois.close();

            System.out.println(t);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
