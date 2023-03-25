package TD7;

import java.io.*;
import java.util.Scanner;

public class Exo1 {
    public static void WriteBufferWritter() throws IOException {
        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fr = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(fr);
        br.write("Je suis un fichier on peut stocker toutes sortes d'informations dedans \n");
        br.close();
    }

    public static void Nombre() throws IOException{
        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        System.out.println("Veuillez saisir un nombre :");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        for (int i = 0; i <= nb; i++) {
            br.write( i + " ");
        }
        br.close();
    }

    public static void lireFichier() throws IOException{
        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        WriteBufferWritter();
        Nombre();
        lireFichier();
    }

}
