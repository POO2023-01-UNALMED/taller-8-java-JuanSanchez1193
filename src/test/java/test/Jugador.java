package test;

public class Jugador extends Futbolista {
	  public short golesMarcados;
	  public byte dorsal;
	  
	  public Jugador(String nombre, int edad,  String posicion, short golesMarcados, byte dorsal) {
		  super(nombre,edad,posicion);
		  this.golesMarcados = golesMarcados;
		  this.dorsal = dorsal;
	  }
	  
	  public Jugador() {
		  super();
		  this.golesMarcados = 289;
		  this.dorsal = 7;
	  }
	  
	  public int compareTo(Futbolista f){
		    if(this.getEdad()==( f).getEdad()){
		      return 0;
		    }
		    else if(this.getEdad()<(f).getEdad()){
		      return (f).getEdad()-this.getEdad();
		    }
		    else{
		      return this.getEdad()-(f).getEdad();
		    }
		  }
	  @Override
	  public String toString(){
		    return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+ golesMarcados;
		  }
	  
	  public boolean jugarConLasManos(){
		  return false;
		}
}
