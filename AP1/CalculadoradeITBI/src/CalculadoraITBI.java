import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {
        // Recebendo os valores de transação, valor venal e porcentagem de ITBI
        String inputTransacao = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        double valorTransacao = Double.parseDouble(inputTransacao);

        String inputVenal = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        double valorVenal = Double.parseDouble(inputVenal);

        String inputPorcentagem = JOptionPane.showInputDialog("Digite a % do ITBI:");
        double percentualITBI = Double.parseDouble(inputPorcentagem);

        // Calculando o imposto ITBI com base no maior valor entre transação e venal
        double valorITBI = Math.max(valorTransacao, valorVenal) * (percentualITBI / 100);

        // Exibindo o valor do ITBI calculado
        JOptionPane.showMessageDialog(null, "O valor do ITBI é: " + valorITBI);
    }
}