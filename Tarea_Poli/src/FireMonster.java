
public class FireMonster implements Monster {

	private String nombre;
    private String ataque;
    
    public FireMonster (String nombre, String ataque){
        
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
        
        return "FireMonster[Nombre: " + this.nombre
        + " Ataque: " + this.ataque + "]";
    }
	

}
