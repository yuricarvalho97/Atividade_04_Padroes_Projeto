import middleware.*;
import server.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe de demonstração. Tudo acontece em conjunto aqui.
 */
public class App {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@teste.com", "admin_123");
        server.register("usuario@teste.com", "usuario_123");

        /**
         * Todas as verificações estão vinculadas. O cliente pode construir
         * várias cadeias usando estes componentes
         */
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        /**
         * Serve obtém uma cadeia do código de cliente
         */
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Digite o seu email: ");
            String email = reader.readLine();
            System.out.print("Digite a sua senha: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}