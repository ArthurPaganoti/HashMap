import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    public static void main(String[] args) {
        // Criar um HashMap para armazenar os contatos (nome e número)
        Map<String, String> agenda = new HashMap<>();

        // Adicionar contatos à agenda
        agenda.put("Alice", "123456789");
        agenda.put("Bob", "987654321");
        agenda.put("Charlie", "456123789");

        // Procurar um número na agenda
        String nome = "Bob";
        if (agenda.containsKey(nome)) {
            String numero = agenda.get(nome);
            System.out.println("O número de " + nome + " é: " + numero);
        } else {
            System.out.println(nome + " não encontrado na agenda.");
        }

        // Exibir todos os contatos na agenda
        System.out.println("\nContatos na agenda:");
        for (Map.Entry<String, String> contato : agenda.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }
    }
}