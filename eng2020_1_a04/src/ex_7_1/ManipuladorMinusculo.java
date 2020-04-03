package ex_7_1;

public class ManipuladorMinusculo extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
