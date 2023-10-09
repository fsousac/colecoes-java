package java.exercises.set.searches;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet.toString());
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()){
            for (Contato c : contatoSet){
                if (c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        }
        else {
            return null;
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()){
            for (Contato c : contatoSet){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.addContato("Camila",123456);
        agendaContatos.addContato("Camila",5678);
        agendaContatos.addContato("Camila Cavalcante",1111111111);
        agendaContatos.addContato("Camila DIO",4548721);
        agendaContatos.addContato("Maria da Silva",1111111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado" + agendaContatos.atualizarNumeroContato("Maria da Silva", 1234));

        agendaContatos.exibirContatos();

    }
}
