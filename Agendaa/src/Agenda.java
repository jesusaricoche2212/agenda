
import java.util.Scanner;
	public class Agenda {	
		//Atributos
		static contactos[] lista;	
		
		//Metodos Constructores
		public Agenda(int tamanio_agenda){
			this.lista= new contactos[tamanio_agenda]; 
		}
			
		//Metodos
		
		//Metodo insertar contactos
		public void setContacto(contactos c){		
			int indice=buscar_indice_vacio();
			
			if(indice<0){
				System.out.println("");
				System.out.println("Importante: Agenda llena!");
			}else{
				this.lista[indice]=c;	
			}								
		}
		
		private int buscar_indice_vacio() {		
			int indice=0;		
			while(this.lista[indice]!=null){			
				indice++;
				if(indice > (this.lista).length-1){
					return -1;
				}				
			}		
			return indice;				
		}
		
		public void listarContactos(){
			System.out.println("");
			System.out.println("Lista de contactos");
			for(int i=0;i<(this.lista).length;i++){
				if(this.lista[i]==null){
					
				}else{
					System.out.println("");
					System.out.println("Contacto: "+(i+1));
					(this.lista[i]).DatosContacto();
				}
			}			
		}
		public void BorrarContactos(){
			Scanner reader=new Scanner(System.in);
			System.out.println("Qué contacto deseas borrar?");
			int contacto_borrar=reader.nextInt();
		
				lista[contacto_borrar-1]=null;
				System.out.println("Contacto borrado");
				
			}		

		
		
		
		
}
