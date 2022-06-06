package study.homework.writing.filewriter2;

import java.io.*;

public class WritingToFile {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("test_data.txt");
             Writer writer = new FileWriter("result_data.txt" );
             BufferedReader br = new BufferedReader(fr)) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] parts = s.split("\\|");
                String FIO = parts[0];
                String sex = parts[1];
                int age = Integer.parseInt(parts[2]);
                String number = parts[3];
                if (sex.equals("М") && age >= 65) {
                    writer.write(FIO + " " + number + "\n");
                } else if (sex.equals("Ж") && age >= 60) {
                    writer.write(FIO + " " + number + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR!!!File not found.");
        }
    }
}
