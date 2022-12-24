package trabalholp;

/* EQUIPE:
  - Mateus santos
  - Ian Marcio
  - Amanda Hellen
 */
import javax.swing.JOptionPane;

public class TrabalhoLp {
    public static void main(String[] args) {
        Cliente pessoa[] = new Cliente[499];

        //CRIANDO CLIENTES E CONTAS
        for (int i = 0; i < 499; i++) {
            pessoa[i] = new Cliente();
            //MENU
            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número referente ao comando: "
                    + "(1) Consultar saldo | (n2) Sacar | (n3) Depositar | (4) Transferir | (5) Criar nova conta | (6) Sair"));
            //COMANDOS
            do {
                switch (op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Seu saldo: " + pessoa[i].getConta().getSaldo());
                        break;
                    case 2:
                        pessoa[i].getConta().sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a ser sacado: ")));
                        break;
                    case 3:
                        pessoa[i].getConta().depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a ser depositado: ")));
                        break;
                    case 4:
                        if (i >= 1) {
                            int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição da conta início"));
                            int destino = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição da conta destino"));
                            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de transferência"));
                            pessoa[inicio].getConta().transferir(pessoa[inicio].getConta(), pessoa[destino].getConta(), valor);
                        } else {
                            JOptionPane.showMessageDialog(null, "NÃO É POSSÍVEL EFETUAR A TRANSFERÊNCIA, NECESSÁRIO A EXISTÊNCIA DE DUAS CONTAS NO MÍNIMO.");
                        }
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERRO! Não há comandos com esta numeração");
                }
                op = Integer.parseInt(JOptionPane.showInputDialog("Digite o número referente ao comando: "
                        + "(1) Consultar saldo | (n2) Sacar | (n3) Depositar | (4) Transferir | (5) Criar nova conta | (6) Sair"));
                if(op==6){
                    JOptionPane.showMessageDialog(null, "Clique novamente para sair.");
                break;
                }
            } while (op != 5);     
            if(op==6){
                break;
            }
        }
    }
}
