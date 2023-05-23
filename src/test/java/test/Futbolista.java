package test;

public abstract class Futbolista implements Comparable{
	
	  private String nombre;
	  private int edad;
	  private final String posicion;
	  
	  
	  protected Futbolista(String nombre,int edad,String posicion){
	    this.nombre=nombre;
	    this.edad=edad;
	    this.posicion=posicion;
	  }
	  
	  protected Futbolista() {
		  this("maradona", 30,"delantero");
	  }
	  
	  public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de" + posicion;
		  		
	  }
	  
	  public boolean equals(Futbolista f) {
		  if (f == this) {
			  return true;
		  }else {return false;}
	  }
	  
	public abstract boolean jugarConLasManos();
	
   //getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
	  
	  
	  
	
	  
	  
}
