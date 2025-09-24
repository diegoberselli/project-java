import java.time.LocalDate;

public class Projeto {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private StatusProjeto status;
    private Usuario gerenteResponsavel;
    
    public enum StatusProjeto {
        PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO
    }
    
    public Projeto(String nome, String descricao, LocalDate dataInicio, 
                   LocalDate dataTerminoPrevista, Usuario gerenteResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.status = StatusProjeto.PLANEJADO;
        this.gerenteResponsavel = gerenteResponsavel;
    }
    
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataTerminoPrevista() { return dataTerminoPrevista; }
    public StatusProjeto getStatus() { return status; }
    public Usuario getGerenteResponsavel() { return gerenteResponsavel; }
}