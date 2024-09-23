public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        voiture v1 = new voiture();
        voiture v3 = new voiture();
        Banque b = new Banque();

        b.compte = "bob";
        //b.solde =4550000 ;
        
        Agence a = new Agence();

        a.compte = "Richard";

        a.consulter();

        v1.demarrer();

        System.out.println("km = "+v3.kilometrage());
        System.out.println("km = "+v3.kilometrage());

        Vache va = new Vache();

        va.chanter();

        Nombre n = new Nombre();

        Bonjour bo = new Bonjour();

        n.start();
        bo.start();
    }
}
