package queue1;

import org.junit.Test;

public class queue1JUnit {

	@Test
	public void Queue1() {
		Queue1 q = new Queue1(5);
	}

	@Test
	public void add() {
		//Standard einfügen 
		Queue1 q = new Queue1(5);
		Object o = new Object();
		q.add(o);

		//Einfügen wenn kein Platz mehr ist
		Queue1 q1 = new Queue1(5);

		Object[] oa = new Object[6]; //Array wird zum testen der add methode verwendet.
		for (int i=0; i<oa.length; ++i) {
			try {
				oa[i] = new Object(); //Initalisiert
				q1.add(oa[i]); //Wird nach der reihe hinzugefügt.
			}catch (RuntimeException f) {
				throw new RuntimeException("Fail add 2");
			}	
		}
	}

	@Test 
	public void get() {
		//get Methode wenn mind. 1 Object enthalten ist.
		Queue1 q1 = new Queue1(2);
		Object o1 = new Object();

		q1.add(o1);
		Object o2=q1.get();

		//get wird ausgeführt wenn nichts enthalten ist
		Queue1 q = new Queue1(5);
		try {
			Object o=q.get();
		}catch (RuntimeException f) {
			throw new RuntimeException("Fail get 1");
		}



	}

	@Test
	public void isFull() {
		//Test wenn etwas enthalten wird geprüft ob es voll ist sollte true zurückgeben
		Queue1 q = new Queue1(2);
		Object o1= new Object();
		Object o2= new Object();
		q.add(o1);
		q.add(o2);
		boolean x= q.isFull();

		//Test wenn nichts enthalten wird geprüft ob es voll ist sollte false zurückgeben
		Queue1 q1 = new Queue1(2);
		boolean x1= q1.isFull();
	}

	@Test
	public void isEmpty() {
		//Test wenn etwas enthalten wird geprüft ob es voll ist sollte true zurückgeben
		Queue1 q = new Queue1(2);
		Object o1= new Object();
		Object o2= new Object();
		q.add(o1);
		q.add(o2);
		boolean x= q.isEmpty();


		//Test wenn nichts enthalten wird geprüft ob es voll ist sollte false zurückgeben
		Queue1 q1 = new Queue1(2);
		boolean x1= q.isEmpty();


	}
}
