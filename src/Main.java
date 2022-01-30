import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso .net");
        curso2.setDescricao("Descrição curso .net");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp .NET");
        bootcamp.setDescricao("Descrição Bootcamp .NET");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
			
		String nome1 = JOptionPane.showInputDialog("Digite o nome do Aluno");
		String nome2 = JOptionPane.showInputDialog("Digite o nome do proximo aluno");
        
        Dev Aluno1 = new Dev();
        Aluno1.setNome(nome1);
        Aluno1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + nome1 + Aluno1.getConteudosInscritos());
        Aluno1.progredir();
        Aluno1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + nome1 + Aluno1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + nome1 + Aluno1.getConteudosConcluidos());
        System.out.println("XP:" + Aluno1.calcularTotalXp());

        System.out.println("-------");

        Dev Aluno2 = new Dev();
        Aluno2.setNome(nome2);
        Aluno2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:"+ nome2  + Aluno2.getConteudosInscritos());
        Aluno2.progredir();
        Aluno2.progredir();
        Aluno2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + nome2  + Aluno2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:"+ nome2 + Aluno2.getConteudosConcluidos());
        System.out.println("XP:" + Aluno2.calcularTotalXp());

		
	}

}
