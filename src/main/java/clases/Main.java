package clases;

public class Main {
	
    
    public static void main (String [] args) {
    	Persona person = new Persona(20, "Rubén", "495044323L");
    	Persona person2 = new Persona(20, "Rubén", "495044323L");
    	
    	MiniList lista = new MiLista();   	
    	lista.add(person);
    	//lista.add(person2);
    	
    	if(lista.get(5)==person)
    		System.out.println("Son iguales");
    	else
    		System.out.println("Son diferentes");
    	
    	if(lista.get(5)==person2)
    		System.out.println("Son iguales");
    	else
    		System.out.println("Son diferentes");
    }
    }
    
    
