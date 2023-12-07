import java.util.HashMap;

public class ContadorPalavras {
    public static void main(String[] args) {
        String texto = "Em uma jaca tinha uma jaca, em outra jaca tinha uma outra jaca.";

        // Dividir o texto em palavras
        String[] palavras = texto.split("\\s+"); // Dividir usando espaços como separador

        // Criar um HashMap para armazenar as ocorrências de cada palavra
        HashMap<String, Integer> mapaOcorrencias = new HashMap<>();

        // Contar as ocorrências de cada palavra
        for (String palavra : palavras) {
            // Se a palavra já estiver no HashMap, incrementar o contador de ocorrências
            if (mapaOcorrencias.containsKey(palavra)) {
                int contador = mapaOcorrencias.get(palavra);
                mapaOcorrencias.put(palavra, contador + 1);
            } else {
                // Se a palavra ainda não estiver no HashMap, adicionar e iniciar o contador em 1
                mapaOcorrencias.put(palavra, 1);
            }
        }

        // Exibir as ocorrências de cada palavra
        for (String palavra : mapaOcorrencias.keySet()) {
            int ocorrencias = mapaOcorrencias.get(palavra);
            System.out.println("Palavra: " + palavra + " - Ocorrências: " + ocorrencias);
        }
    }
}

