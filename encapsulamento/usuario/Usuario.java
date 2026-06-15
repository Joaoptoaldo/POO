//5 - Crie uma classe Usuario com nome e senha . 
// O método getSenha() deve retornar a senha mascarada (ex: "********") por segurança, 
// enquanto o setSenha deve exigir no mínimo 8 caracteres.
package usuario;

public class Usuario {
    private String nome;
    private String senha;


    public Usuario(String nome, String senha) {
        this.nome = nome;
        setSenha(senha); 
    }

    public String getSenha() {
        if (this.senha == null) return "Sem senha definida";
        
        // retorna uma string de asteriscos com o mesmo comprimento da senha real
        return "*".repeat(this.senha.length());
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String novaSenha) {
        if (novaSenha.length() >= 8) {
            this.senha = novaSenha;
            System.out.println("Senha atualizada com sucesso");
        } 
        else {
            System.err.println("[ERRO] A senha deve ter no mínimo 8 caracteres!");
        }
    }

    // public String getNome() {
    //     return nome;
    // }

    // public String getSenha() {
    //     return "********"; 
    // }

    // public void setSenha(String senha) {
    //     if (senha.length() >= 8) {
    //         this.senha = senha;
    //     } 
    //     else {
    //         System.out.println("[ERRO] A senha deve conter no mínimo 8 caracteres.");
    //     }
    // }
}
