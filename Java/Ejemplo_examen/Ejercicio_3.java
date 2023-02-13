package Ejercicio_3;
import java.util.HashMap;
public class Ejercicio_3 {
	public static void main(String[] args) {
		 double frequency = Ejercicio_3.getFrequency("mi", false);
		 System.out.println("Frecuencia de Mi normal"+ ": " + frequency);

		 frequency = Ejercicio_3.getFrequency("mi", true);
		 System.out.println("Frecuencia de agudo Mi: " + frequency);
		 
		 frequency = Ejercicio_3.getFrequency("Do", false);
		 System.out.println("Frecuencia de DO normal"+ ": " + frequency);

		 frequency = Ejercicio_3.getFrequency("Do", true);
		 System.out.println("Frecuencia de agudo DO: " + frequency);
	}
	    private static final HashMap<String, Double> notes = new HashMap<>();
	    static {
	        notes.put("DO", 523.25);
	        notes.put("RE", 587.33);
	        notes.put("MI", 659.26);
	        notes.put("FA", 698.46);
	        notes.put("SOL", 783.99);
	        notes.put("LA", 880.0);
	        notes.put("SI", 987.77);
	    }

	    public static double getFrequency(String note, boolean isSharp) {
	        if (!notes.containsKey(note.toUpperCase())) {
	            return 0;
	        }

	        double frequency = notes.get(note.toUpperCase());
	        if (isSharp) {
	            frequency *= 1.03;
	        }
	        return frequency;
	    }
	  
}

