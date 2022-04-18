package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaJunitRuben {

	

	@Test
	void redondearalzaTest() {
		int esperado=5;
		int actual=Matematicas.redondearalza(4.1);
		
		assertEquals(esperado, actual);
		
		
	}
	
	
	@Test
	void valorabsolutotest()
	{
		double esperado=6.7;
		double actual=Matematicas.absoluto(-6.7);
		
		assertEquals(esperado, actual);
	}

}
