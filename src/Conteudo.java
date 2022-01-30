
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    
    
    public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}
    
    public Conteudo() {
    	
    }
    
    public abstract double calcularXp();
	
    public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Conteudo [titulo=" + titulo + ", descricao=" + descricao + ", calcularXp()=" + calcularXp()
				+ ", getTitulo()=" + titulo + ", getDescricao()=" + descricao + "]";
	}
	
	
}
	


  
	 