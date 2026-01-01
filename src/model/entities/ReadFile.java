package model.entities;

import model.exeptions.DomainException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private String path;
    private List<String> itens = new ArrayList<>();

    public ReadFile(String path) {
        this.path = path;
    }

    public List<String> getItens() {
        return itens;
    }

    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                itens.add(line);
            }
        } catch (IOException e) {
            throw new DomainException("Erro: Falha na LEITURA do arquivo!");
        }
    }
}
