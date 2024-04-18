package ex5;

public class Agenda {
    private Contato[] meusContatos;
    private final int MAX = 100;
    private int total = 0;
    //Construtor:
    public Agenda(){
        meusContatos = new Contato[MAX];
    }
    public boolean ehDuplicado(Contato c) {
        for (int i = 0; i < total; ++i) {
            if (c.equals(meusContatos[i])) { // Chama o nosso "equals()"
                return true;
            }
        }
        return false;
    }
    public void listarContatos(){
        for (int i = 0; i < total; ++i) {
            System.out.println(meusContatos[i].getNome());
        }
        System.out.println("Total de " + total + " contatos listados.");
    }
    public boolean adicionarContato(Contato c){
        if(total == MAX) //Agenda lotada?
            return false;
        for (int i = 0; i < total; ++i) {
            if (meusContatos[i].getNome().equals(c.getNome()) && meusContatos[i].getTel().equals(c.getTel())) {
                return false;
            }
        }
        meusContatos[total] = c;
        ++total;
        return true;
    }
    public boolean removerContato(Contato c){
        // checar se contato está na lista
        boolean contatoNaLista = false;
        for (int i = 0; i < total; i++) {
            if (c == meusContatos[i]) {
                contatoNaLista = true;
                break;
            }
        }
        if (!contatoNaLista) return false;
        Contato[] novaAgenda = new Contato[meusContatos.length - 1];
        for (int i = 0, k = 0; i < total; ++i) {
            if (c != meusContatos[i]) {
                novaAgenda[k] = meusContatos[i];
                k++;
            }
        }
        total--;
        meusContatos = novaAgenda;
        return true;
    }
}
