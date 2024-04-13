package app001;

import java.util.Date;
import java.util.Locale;

public class OlaMundo {

	public static void main(String[] args) {
		Date relogio = new Date();
		System.out.println("A hora do sistema é " + relogio.toString());
		
		Locale loc = Locale.getDefault();
		System.out.println("Seu sistema está em " + loc.getDisplayLanguage());
		
	}

}
