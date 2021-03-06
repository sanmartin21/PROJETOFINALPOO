public class Professor extends Pessoa {

	private int codigoAcessoProfessor;
	private int codigoTurma;
	private int codigoDisciplina;
	private String especialidade;
	private double salario;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade.length() > 0)
			this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0)
			this.salario = salario;
	}

	public int getCodigoAcessoProfessor() {
		return codigoAcessoProfessor;
	}

	public void setCodigoAcessoProfessor(int codigoAcessoProfessor) {
		if (codigoAcessoProfessor > 0)
			this.codigoAcessoProfessor = codigoAcessoProfessor;
	}

	public int getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(int codigoTurma) {
		if (codigoTurma > 0)
			this.codigoTurma = codigoTurma;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		if (codigoDisciplina > 0)
			this.codigoDisciplina = codigoDisciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [codigoAcessoProfessor=");
		builder.append(codigoAcessoProfessor);
		builder.append(", codigoTurma=");
		builder.append(codigoTurma);
		builder.append(", codigoDisciplina=");
		builder.append(codigoDisciplina);
		builder.append(", especialidade=");
		builder.append(especialidade);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
