package ex_6_1;

import java.util.Calendar;
import java.util.Date;

public class Mensageiro {
	public void mensagem() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		MensagemDoDia mensagem = null;
		switch(dayOfWeek) {
		case 1:
			mensagem = new MensagemDoDomingo();
			break;
		case 2:
			mensagem = new MensagemDaSegunda();
			break;
		case 3:
			mensagem = new MensagemDaTerca();
			break;
		case 4:
			mensagem = new MensagemDaQuarta();
			break;
		case 5:
			mensagem = new MensagemDaQuinta();
			break;
		case 6:
			mensagem = new MensagemDaSexta();
			break;
		case 7:
			mensagem = new MensagemDoSabado();
			break;
		}
		System.out.println(mensagem.mensagem());
	}

}