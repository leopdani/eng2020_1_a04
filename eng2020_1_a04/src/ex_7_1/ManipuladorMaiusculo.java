package ex_7_1;

public class ManipuladorMaiusculo extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string.toUpperCase();
	}
}
