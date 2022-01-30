
public class Curso extends Conteudo {
	
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }    


	public Curso(String titulo, String descricao) {
		super(titulo, descricao);
		// TODO Auto-generated constructor stub
	}

	public Curso() {
		// TODO Auto-generated constructor stub
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", getTitulo()=" + getTitulo() + ", getDescricao()="
				+ getDescricao() + "]";
	}
	
	


}
