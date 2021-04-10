package ui;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

	private Scanner sc;
	public Customer customer;
	private int date;
	private List<Customer> customerList;
	private int counter;
	
	public Main(){
		customerList=new ArrayList<>();
		sc=new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		Main ppal= new Main();

		    int option=0;

		        do{
		            option= ppal.showMenu();
		            ppal.executeOperation(option);

		        }while (option!=0);


		    }
		
		public int showMenu() {
		        int option;

		        System.out.println(
		                "Seleccione una opcion para proceder\n" +
		                "(1) Registrar nuevo cliente \n" +
		                "(2) Consultar numero de clientes ingresados\n" +
		                "(0) Salir \n"
		                );
		        option= sc.nextInt();
		        sc.nextLine();
		        return option;
		    }
		
		public void executeOperation(int operation) {
		        switch(operation) {
		        case 0:
		            System.out.println("Hasta luego!");
		            break;
		        case 1:
		        	customerRegister();
		            break;
		        case 2:
		        	System.out.println("han intentado ingresar "+counter+" personas");
		            break;
		        default:
		            System.out.println("opcion incorrecta");
		        }
		    }
		
		
		public void customerRegister() {
		String msg="El Cliente no puede ingresar";
		int option=0;
		String id="";
		counter++;
		DocumentType type=null;
		System.out.println(
				"seleccione el tipo de documento \n"+
				"(1) Para Tarjeta de Identidad \n"+
				"(2) Para Cedula de Ciudadania \n"+
				"(3) Para Pasaporte \n"+
				"(4) Cedula de Extranjeria \n"
		);
		option= sc.nextInt();
		sc.nextLine();
		switch(option) {
        case 1:
        	type=(DocumentType.TI);
            break;
        case 2:
        	type=(DocumentType.CC);
            break;
        case 3:
        	type=(DocumentType.PP);
            break;
        case 4:
        	type=(DocumentType.CE);
            break;
        default:
        	System.out.println("opcion erronea");
		}
		
		System.out.println("ingrese el numero del documento");
		id=sc.nextLine();
		
		date=LocalDate.now().getDayOfMonth();
		
		
		int temp=Character.getNumericValue(id.charAt(id.length()-2));

		if(type!=(DocumentType.TI)) {
			if((date%2==0 && temp%2!=0)||(date%2!=0 && temp%2==0)) {
				customerList.add(new Customer(id, type));
				msg="El cliente puede ingresar";
			}
		}
		else {
			System.out.println("el usuario es menor de edad");
		}

		
		System.out.println(msg);
		System.out.println("");
		}
		
}