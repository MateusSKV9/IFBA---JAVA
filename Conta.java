package trabalholp;
/* EQUIPE:
  - Mateus santos
  - Ian Marcio
  - Amanda Hellen
*/
import javax.swing.JOptionPane;
public class Conta {
    //Atributos
    private String agencia;
    private String numero;
    private double saldo;
    private String data_criacao;

    //Métodos principais
    public Conta() {
        this.criaConta();
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    //Métodos especiais
    public void sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "✔ SAQUE FEITO COM SUCESSO!");
        } else {
            JOptionPane.showMessageDialog(null, "✖ NÃO FOI POSSÍVEL SACAR! Saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        JOptionPane.showMessageDialog(null, "✔ DEPOSITO FEITO COM SUCESSO!");
    }

    public boolean transferir(Conta inicio, Conta destino, double valor) {
        if (saldo >= valor) {
            inicio.setSaldo(inicio.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "✔ TRANSFERÊNCIA FEITA COM SUCESSO!");
        } else {
            JOptionPane.showMessageDialog(null, "✖ NÃO FOI POSSÍVEL TRANSFERIR. Saldo infusiciente!");
        }
        return true;
    }

    public void criaConta() {
        this.setAgencia(JOptionPane.showInputDialog("Informe sua agencia : "));
        this.setNumero(JOptionPane.showInputDialog("Informe seu número: "));
        this.saldo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu saldo: "));
        this.setData_criacao(JOptionPane.showInputDialog("Informe a data de criação (formato XX.XX.XX): "));
    }

    @Override
    public String toString() {
        return "▶ Conta{" + "agencia= " + this.getAgencia() + ", numero= " + this.getNumero()
                + ", saldo= " + this.getSaldo() + ", data_criacao= " + this.getData_criacao() + '}';
    }

}
