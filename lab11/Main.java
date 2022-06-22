package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

                //zadanie 1
    /*
    File plik = new File("nazwaPliku.txt");
    PrintWriter zapis = new PrintWriter(plik);
        while(true){
            String linia = scanner.nextLine();
            if(linia.equals("-"))
                break;
            zapis.write(linia);
            zapis.write(System.lineSeparator());
        } zapis.close();
    */

                //zadanie 2
    /*
       BufferedReader fileReader = null;
        int i=0;
        System.out.println("Ścieżka do pliku: ");
        String sciezka = scanner.nextLine();
        fileReader = new BufferedReader(new FileReader(sciezka));
        while (true) {
           String linia = fileReader.readLine();
            if (linia == null) {
                break;
            }
            i++;
            System.out.println(linia);
        }System.out.println("Ilość linijek: " +i);
        */

                //zadanie 3
        /*
        int dzien, miesiac, rok;
        String sciezka="nazwaPliku.txt";
        System.out.println("Podaj datę urodzenia (dzień, miesiąc, rok): ");
        dzien=scanner.nextInt();
        miesiac=scanner.nextInt();
        rok=scanner.nextInt();
        DataOutputStream outputStream=null;
        try{
            outputStream=new DataOutputStream(new FileOutputStream(sciezka));
            outputStream.writeInt(dzien);
            outputStream.writeInt(miesiac);
            outputStream.writeInt(rok);
        }finally {
            if(outputStream!=null){
                outputStream.close();
            }
        }
*/
                //zadanie 4
        String sciezka = "nazwaPliku.txt";
        int nr=0, nr2=0, nr3=0;
        DataInputStream inputStream = null;

        try {
            inputStream = new DataInputStream(new FileInputStream(sciezka));
            nr = inputStream.readInt();
            nr2 = inputStream.readInt();
            nr3 = inputStream.readInt();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }System.out.println(nr + " " + nr2+" "+nr3);
    }
}
