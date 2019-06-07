
	import java.util.Scanner;
	public class Principal {
	public static void main(String[] arg){		
			
			Scanner reader=new Scanner(System.in);
			int opcion, tamanio;
			contactos mi_contacto;
			String nombre, telefono, email;
			boolean band=true;	
			
			System.out.print("Tamaño de la agenda: ");
			tamanio=reader.nextInt();
			Agenda mi_agenda=new Agenda(tamanio);		
					
			while(band==true){	
				menu();			
				System.out.print("> Elegir opcion: ");
				opcion=reader.nextInt();
				if (opcion!=5) {
					if (opcion!=4) {
						if (opcion!=3) {
							if (opcion!=2) {
								if (opcion!=1) {
									if (opcion!=0) {
									System.out.print("Valor ingresado incorrecto");
								}
							}
						}
					}
				}			
				}else {
					
				}
				switch(opcion){
					case 1: //insertar contacto
						System.out.print("Ingresar nombre contacto: ");
						nombre=reader.next();
						System.out.print("Ingresar telefono contacto: ");
						telefono=reader.next();
						System.out.print("Ingresar email contacto: ");
						email=reader.next();
						
						mi_contacto=new contactos(nombre,telefono,email);
						mi_agenda.setContacto(mi_contacto);
						
						break;
					case 2: // Edit contact
						System.out.println("Cuál contacto quieres editar?");
						int numero_de_contacto=reader.nextInt();					
						mi_contacto=Agenda.lista[numero_de_contacto-1];
						System.out.print("Ingresar nuevo nombre del contacto: ");
						String nuevonombre=reader.next();
						System.out.print("Ingresar nuevo número de teléfono del contacto: ");
						String nuevonumero=reader.next();
						System.out.print("Ingresar nuevo email del contacto: ");
						String nuevoemail=reader.next();
						mi_contacto.setNombre(nuevonombre);
						mi_contacto.setTelefono(nuevonumero);
						mi_contacto.setEmail(nuevoemail);
						break;
					case 3: // search contact
						System.out.println("Qué contacto deseas buscar?");
						int contacto_que_quiero_buscar=reader.nextInt();
						mi_contacto=Agenda.lista[contacto_que_quiero_buscar-1];
						System.out.println("-----------------------");
						System.out.println("-------Contacto :"+contacto_que_quiero_buscar+"-------");
						System.out.println("-------"+mi_contacto.getNombre()+"-----------");
						System.out.println("-------"+mi_contacto.getTelefono()+"-------");
						System.out.println("-------"+mi_contacto.getEmail()+"-------");
						System.out.println("-----------------------");
						break;
					case 4: // delete contact
						Scanner reader=new Scanner(System.in);
			                        System.out.println("Qué contacto deseas borrar?");
			                        int contacto_borrar=reader.nextInt();
		
				                lista[contacto_borrar-1]=null;
				                System.out.println("Contacto borrado");
					case 5:// list contact
						mi_agenda.listarContactos();
						break;
					case 0:// finish program
						band=false;
						System.out.println("---------------------------");
						System.out.println("----Programa Finalizado----");
						System.out.println("---------------------------");
						break;
						
						default:				
						break;
						
				}				
			}		
		}
		
		//Metodo de menu de opciones del proyecto
		public static void menu(){
			System.out.println("");
			System.out.println("========= Menu Agenda Telefonica =========");
			System.out.println("[1] Añadir Contacto");
			System.out.println("[2] Editar Contacto");
			System.out.println("[3] Buscar Contacto");
			System.out.println("[4] Eliminar Contacto"); // por nombre
			System.out.println("[5] Listar Contacto");
			System.out.println("[0] Finalizar Programa");
		}
		


	}

