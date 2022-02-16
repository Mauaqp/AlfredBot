import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        return ("Buenos días estimada " + name);
    }
    
    public String dateAnnouncement() {
        Date fechaHoy = new Date();
        return ("La fecha es " + fechaHoy.toString());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if ( conversation.equals("¡Alexis! Toca algunos beats low-fi.") ) {
            return (conversation + "... es algo que un chelista de conservatorio jamás diría");
        }
        else if ( conversation.equals("No puedo encontrar mi yo-yo. Quizás Alfred sepa dónde está") ) {
            return ("Puedo ayudarte, pero sólo despues de regar mis magnolias.");
        }
        else {
            return ("Batman nunca se rendiría en una circunstancia similar.");
        }
    }
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
}