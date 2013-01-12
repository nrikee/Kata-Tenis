public class Marcador{
    private Jugador player1, player2;
     
    final int GANA = -1;
    final int DEUCE = -2;
    final int VENTAJA = -3;
     
    public Marcador(){
        player1 = new Jugador("Player 1");
        player2 = new Jugador("Player 2");
    }
     
    public Marcador(String pl1, String pl2){
        player1 = new Jugador(pl1);
        player2 = new Jugador(pl2);
    }
     
    /** Actualiza el marcador */
    public void actualiza(boolean anota1){
        if(anota1) player1.anota(); else player2.anota();
         
        if(player1.getPuntuacion()==40 && player2.getPuntuacion()==40){
            player1.setDeuce();
            player2.setDeuce();
        }
    }
     
    /** Comprueba si estÃ¡n en Deuce */
    public boolean isDeuce(){
        return player1.isDeuce() && player2.isDeuce();
    }
     
    /** Comprueba si el partido ha terminado */
    public boolean isTerminado(){
        return player1.getPuntuacion()==GANA || player2.getPuntuacion()==GANA;
    }
     
    /** Devuelve quiÃ©n gana */
    public Jugador quienGana(){
        return (player1.getPuntuacion()==GANA? player1 : player2);
    }
     
    /** Sobreescritura de toString() */
    public String toString(){
        return player1 + " ( " + player1.getStringPuntuacion() + " - " + player2.getStringPuntuacion() + " ) " + player2;
    }
 
}
