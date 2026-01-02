package application;

import model.entities.ConvertToCSV;

public class Main {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);

        ConvertToCSV file = new ConvertToCSV(
                "/home/akio/repos/javaLarning/criandoCSV/src/source"
        );

        file.parseToCSV(
                "/home/akio/repos/javaLarning/criandoCSV/out/summary.csv"
        );

    }
}
