package Model;

public class Main {
    public static void main(String[] args) {

        DAO.getConnection();

        if (new DAO().createTable()) {
            System.out.println("DEU TUDO CERTOOOOOO");
        } else {
            System.out.println("deu tudo errado......");
        }

        DAO.endConecction();
    }
}
