package middleware;

import server.*;

/**
 * Handler Concreto. Verifica se existe um usuário com as credenciais fornecidas 
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("Email não cadastrado!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Senha incorreta!");
            return false;
        }
        return checkNext(email, password);
    }
}