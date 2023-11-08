import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String arquivo_entrada = "/Users/fatec/Desktop/ModalGR/aniversarios.txt";
        String arquivo_saida = "/Users/fatec/Desktop/ModalGR/aniversarios_mes.txt";

        List<Aniversariantes> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo_entrada));
             BufferedWriter wr = new BufferedWriter(new FileWriter(arquivo_saida))){
            String line = br.readLine();
            line = br.readLine();

            while (line != null) {

                LocalDate dataAtual = LocalDate.now();
                int mesCorrente = dataAtual.getMonthValue();

                String[] vet = line.split("\\|");
                String nome = vet[0];
                String email = vet[1];
                String dia = vet[2];

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataNascimento = LocalDate.parse(dia, formatter);

                if (dataNascimento.getMonthValue() == mesCorrente) {
                    Aniversariantes aniversarios = new Aniversariantes(nome.toUpperCase(), email.toUpperCase(), dia);
                    list.add(aniversarios);
                }
                line = br.readLine();
            }
            for (Aniversariantes p : list) {
                String linha = p.getNome() + "|" + p.getEmail() + "|"+ p.getDia();
                wr.write(linha);
                wr.newLine();

            }
            System.out.println("Lista dos aniversariantes gerada com sucesso!");
        }
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}