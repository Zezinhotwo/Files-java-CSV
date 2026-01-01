package model.entities;

import model.exeptions.DomainException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {

    private String out;
    private List<String> itens;

    public FileWrite(List<String> itens, String out) {
        this.out = out;
        this.itens = itens;
    }

    public void writerFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(out, true))) {
            for (String line : itens) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new DomainException("Erro: Falha ao GRAVAR no arquivo!");
        }
    }
}
