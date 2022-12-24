package trabalholp;
/* EQUIPE:
  - Mateus santos
  - Ian Marcio
  - Amanda Hellen
*/
import javax.swing.JOptionPane;
public class Cliente {
    //Atributos
    private String nome;
    private String cpf;
    private String email;
    private Conta conta;

    //Métodos principais
    public Cliente() {
        JOptionPane.showMessageDialog(null, "Bem-vindo(a)!  Prossiga para preencher seus dados.");
        this.criaCliente();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //Métodos especiais
    public void criaCliente() {
        this.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        this.setCpf(JOptionPane.showInputDialog("Informe seu cpf: "));
        this.setEmail(JOptionPane.showInputDialog("Informe seu email: "));
        this.setConta(new Conta());
    }

    @Override
    public String toString() {
        return " Cliente{" + "nome= " + this.getNome() + ", cpf= " + this.getCpf()
                + ", email= " + this.getEmail() + "\n  " + this.getConta().toString() + '}';
    }

}
