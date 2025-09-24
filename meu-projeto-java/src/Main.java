import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Usuario admin = new Usuario("Joao Silva", "123.456.789-00", "joao@email.com",
                "Administrador", "admin", "123456",
                Usuario.PerfilUsuario.ADMINISTRADOR);

        Usuario gerente = new Usuario("Maria Santos", "987.654.321-00", "maria@email.com",
                "Gerente de Projetos", "maria", "654321",
                Usuario.PerfilUsuario.GERENTE);

        Usuario colaborador = new Usuario("Pedro Costa", "456.789.123-00", "pedro@email.com",
                "Desenvolvedor", "pedro", "789123",
                Usuario.PerfilUsuario.COLABORADOR);

        Projeto projeto = new Projeto("Sistema de Vendas", "Sistema para controle de vendas",
                LocalDate.now(), LocalDate.now().plusMonths(6), gerente);

        Equipe equipe = new Equipe("Equipe Desenvolvimento", "Equipe responsavel pelo desenvolvimento");
        equipe.adicionarMembro(gerente);
        equipe.adicionarMembro(colaborador);
        equipe.adicionarProjeto(projeto);

        System.out.println("=== SISTEMA DE GESTAO ===\n");

        System.out.println("USUARIOS CADASTRADOS:");
        System.out.println("- " + admin.getNomeCompleto() + " (" + admin.getPerfil() + ")");
        System.out.println("- " + gerente.getNomeCompleto() + " (" + gerente.getPerfil() + ")");
        System.out.println("- " + colaborador.getNomeCompleto() + " (" + colaborador.getPerfil() + ")\n");

        System.out.println("PROJETOS CADASTRADOS:");
        System.out.println("- " + projeto.getNome() + " - Status: " + projeto.getStatus());
        System.out.println("  Gerente: " + projeto.getGerenteResponsavel().getNomeCompleto() + "\n");

        System.out.println("EQUIPES CADASTRADAS:");
        System.out.println("- " + equipe.getNome());
        System.out.println("  Membros: " + equipe.getMembros().size());
        System.out.println("  Projetos: " + equipe.getProjetos().size());
    }
}
