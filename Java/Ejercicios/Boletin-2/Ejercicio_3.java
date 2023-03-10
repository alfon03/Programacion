package boletin_2;

public class Password {
	
/*Diseña una función que, dada una cadena de entrada, comprueba si es una
contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o
más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo
de puntuación y al menos un dígito.*/	

	
	private final int LONGITUD_MINIMA_SEGURA = 8;
	private final String SIMBOLOS = ".,-;¡!?";
	private String value;

	public Password(String value) {
		super();
		this.value = value;
	}
	
	
	public boolean esFuerte() {
		
		boolean contieneMinuscula = false;
		boolean contieneMayuscula = false;
		boolean contieneDigito = false;
		boolean contieneSimbolo = false;
		
		if(this.value!=null && this.value.length()>= LONGITUD_MINIMA_SEGURA) {
			
			for (int i=0; i<this.value.length();i++) {
				
				if(Character.isLowerCase(this.value.charAt(i))) {
					contieneMinuscula = true;
				}else if(Character.isUpperCase(this.value.charAt(i))) {
					contieneMayuscula = true;
				}else if(Character.isDigit(this.value.charAt(i))) {
					contieneDigito = true;
				}else if(esSimbolo(this.value.charAt(i))) {
					contieneSimbolo = true;
				}
			}
		}
		
		
		return contieneMinuscula && contieneMayuscula 
				&& contieneDigito && contieneSimbolo;
	}
	
	
	private boolean esSimbolo(char c) {
		boolean contieneSimbolo = false;
		
		for (int j=0; j<SIMBOLOS.length();j++) {
			if(c==SIMBOLOS.charAt(j)) {
				contieneSimbolo=true;
			}
		}
		return contieneSimbolo;
	}

}
