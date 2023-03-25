package TD7;

import java.io.*;
import java.time.LocalDate;

import Personne.Personne;

public class Exo2 {
    public static void serialisation(Personne p) throws IOException{
        FileOutputStream fos = new FileOutputStream("personne.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.close();
        fos.close();
    }

    public static Personne deserialisation() throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("personne.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Personne p = (Personne) ois.readObject();
        ois.close();
        fis.close();
        return p;
    }

    public static void main(String[] args) {
        Personne p = new Personne("CANOT", "Thomas", LocalDate.of(2003, 11, 07));
        try {
            serialisation(p);
            Personne p2 = deserialisation();
            System.out.println(p2.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
