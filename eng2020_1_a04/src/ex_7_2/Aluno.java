package ex_7_2;

public class Aluno implements Comparable{
	private int ra;

	public Aluno(int ra) {
		this.ra = ra;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + "]";
	}

	@Override
	public int compareTo(Object obj) {
		if (this == obj)
			return 0;
		if (obj == null)
			return 1;
		if (getClass() != obj.getClass())
			return 1;
		Aluno other = (Aluno) obj;
		if (ra < other.getRa()) {
			return -1;
		} else if (ra == other.getRa()) {
			return 0;
		} else {
			return 1;
		}
	}

}