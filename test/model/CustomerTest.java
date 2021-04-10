package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Exception.DocumentTypeException;
import Exception.NumberException;
import junit.framework.AssertionFailedError;

class CustomerTest {
	private Customer custumer;
	
	public void  SetEscenary() {
		custumer = new Customer();
	}
	
	//Agregue 
	@Test
	public void testSet1(){
		SetEscenary();
		try {
			assertTrue(custumer.addPerson("1006336674" , "CC", 8));
			
		} catch (DocumentTypeException  e) {
		
			fail("Es menor de edad");
		}catch (NumberException i) {
			
			fail("No puede entrar");
		}
	}
	
	
	//Documento
	@Test
	public void testSet12(){
		SetEscenary();
		try {
			
			assertFalse(custumer.addPerson("1006336684" , "TI", 7));
		} catch (DocumentTypeException | NumberException  e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void testSet13(){
		
		SetEscenary();
		try {
			
			assertFalse(custumer.addPerson("1006336684" , "PP", 8));
		} catch (DocumentTypeException | NumberException  e) {
			e.printStackTrace();
		}
		
		
	}
	

}
