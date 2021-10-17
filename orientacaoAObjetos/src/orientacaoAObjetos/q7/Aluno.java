package orientacaoAObjetos.q7;

public class Aluno implements IComparavel{
	private String nome;
	private double nota;
	
	Aluno(String nome, double nota){
		this.nome = nome;
		this.nota = nota;
	}
	public String getNome() {
		return this.nome;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	@Override
	public int compararCom(IComparavel comparavel) {
		if((this.getNota())>(((Aluno) comparavel).getNota())) {
			return 1;
		}else if(this.getNota()==((Aluno) comparavel).getNota()) {
			return 0;
		}else return -1;
	}
	
	public String toString() {
		return String.format("O nome do aluno é %s, e sua nota é %.2f", this.getNome(),this.getNota());
	}
}
