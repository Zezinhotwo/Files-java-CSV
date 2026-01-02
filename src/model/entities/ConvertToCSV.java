package model.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToCSV {

    private String source;

    public ConvertToCSV(String source) {
        this.source = source;
    }

    public void parseToCSV(String out) {
        ReadFile rf = new ReadFile(source);
        rf.readFile();
        List<String> itens = rf.getItens();
        List<String> result = new ArrayList<>();
        for (String item : itens) {
            String[] parts = item.split(",");

// quantidade = último campo
            int quantity = Integer.parseInt(parts[parts.length - 1].trim());

// preço = penúltimo campo
            double price = Double.parseDouble(parts[parts.length - 2].trim());

// nome = tudo antes do preço
            String name = String.join(
                    ",",
                    Arrays.copyOfRange(parts, 0, parts.length - 2)
            ).trim();

            double total = price * quantity;

            result.add(
                    name + "," + String.format("%.2f", total));
        }

        FileWrite fw = new FileWrite(result, out);
        fw.writerFile();
    }
}
