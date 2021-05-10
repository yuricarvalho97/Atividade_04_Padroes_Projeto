import networks.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe cliente. Tudo funciona em conjunto aqui.
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Digite o seu usuário: ");
        String userName = reader.readLine();
        System.out.print("Digite a sua senha: ");
        String password = reader.readLine();

        // Inserir mensagem
        System.out.print("Digite a mensagem: ");
        String message = reader.readLine();

        System.out.println("\nEscolha uma rede social para postar a mensagem:\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Cria a rede social e envia a mensagem.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}