
public class StoneMonster implements Monster {

	private String nombre;
    private String ataque;
    
    public StoneMonster (String nombre, String ataque){
        
        this.nombre = nombre;
        this.ataque = ataque;
    }
    
	
	public String nombre() {
	
		return this.nombre();
	}

	
	public String ataque() {
		
		return this.ataque();
	} 

	public String toString(){
        
        return "StoneMonster[Nombre: " + this.nombre
        + " Ataque: " + this.ataque + "]";
    }
	

}

