package application;

import model.entities.ConvertToCSV;

import java.io.*;


public class Main {
    public static void main(String[] args) {


        ConvertToCSV file = new ConvertToCSV(
                "/home/akio/repos/javaLarning/criandoCSV/src/source"
        );

        file.parseToCSV(
                "/home/akio/repos/javaLarning/criandoCSV/out/summary.csv"
        );

    }
}
