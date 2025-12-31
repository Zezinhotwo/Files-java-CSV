package application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("/home/akio/repos/javaLarning/criandoCSV/src/source");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            List<String> itens = new ArrayList<>();
            List<String> itensCVS = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                itens.add(line);
                line = br.readLine();
            }
            for (String item : itens) {
                String[] temp = item.split(",");
                String name = temp[0];
                double price = Double.parseDouble(temp[1]);
                int quantity = Integer.parseInt(temp[2]);

                double total = price * quantity;

                String linhaCsv = name + "," + total;
                itensCVS.add(linhaCsv);

                System.out.println(linhaCsv);
            }
            try (BufferedWriter bw = new BufferedWriter(
                    new FileWriter("/home/akio/repos/javaLarning/criandoCSV/out/summary.csv", true))
            ) {
                for (String itemCSV : itensCVS) {
                    bw.write(itemCSV);
                    bw.newLine();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
