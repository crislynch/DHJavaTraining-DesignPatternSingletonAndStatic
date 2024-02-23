//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
public class User {
    //parametri privati
    private String nome;
    private int eta;

    // Costruttore di default
    public User() {
        //valori di default
        this.nome = "Undefined";
        this.eta = 0;
    }

    // COstruttore che contiene i parametri

    public User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void stampaInformazioni() {
        System.out.println("nome = " + nome);
        System.out.println("eta = " + eta);
    }

    //getter e setters
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
