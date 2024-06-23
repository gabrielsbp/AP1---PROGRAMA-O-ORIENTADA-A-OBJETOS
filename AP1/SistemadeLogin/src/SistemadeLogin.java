import javax.swing.JOptionPane;

public class SistemadeLogin {

    public static void main(String[] args) {
        final String USUARIO_CORRETO = "adm";
        final String SENHA_CORRETA = "123";

        boolean loginSucesso = false;
        int tentativasRestantes = 3;

        while (!loginSucesso && tentativasRestantes > 0) {
            String usuario = JOptionPane.showInputDialog("Digite o usuário:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (usuario.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                loginSucesso = true;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
                } else {
                    JOptionPane.showMessageDialog(null, "Número de tentativas excedido. Acesso bloqueado.");
                }
            }
        }
    }
}