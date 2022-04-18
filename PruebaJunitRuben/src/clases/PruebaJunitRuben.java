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

}
