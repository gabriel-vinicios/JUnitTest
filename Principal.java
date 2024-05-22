import javax.swing.JOptionPane;
import calculadora.Calculadora;

public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        String opcao = "";

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1\n2 Soma\n3 Subtração\n4 Produto\n5 Divisão\n9 Sair");

            if (opcao != null) {
                try {
                    int opcaoInt = Integer.parseInt(opcao);

                    switch (opcaoInt) {
                        case 1:
                            calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                            calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getSubtracao());
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Divisão: " + calculadora.getDivisao());
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null, "Saindo da calculadora...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Formato de número inválido!");
                }
            }
        }
    }
}