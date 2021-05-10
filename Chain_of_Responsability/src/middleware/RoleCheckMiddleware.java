package middleware;

/**
 * Handler concreto. Checa o tipo de acesso do usuário.
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@teste.com")) {
            System.out.println("Olá, Administrator");
            return true;
        }
        System.out.println("Olá, Usuário");
        return checkNext(email, password);
    }
}