//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
public class Main {
    public static void main(String[] args) {
        //creazione utenti, user1 costruttore default, user2 contruttore custom
        User user1 = new User();
        User user2 = new User("Mario", 34);

        //stampo imformazioni user1
        System.out.println("informazioni di user1:");
        user1.stampaInformazioni();

        //cambiamo informazioni secondo utente
        user2.setNome("Luca");
        user2.setEta(25);

        //stampo imformazioni user1
        System.out.println("informazioni di user1:");
        user2.stampaInformazioni();

    }
}