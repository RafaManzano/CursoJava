package com.principal;

public class DataStructure  {

	private static final int SIZE = 15;
	private int[] arrayInt = new int[SIZE];
	
	public DataStructure() {
		for(int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = i;
		}
	}
	
	/*
	 * Metodo realizado por mi, mucho mas simple
	public void printEven() {
		for(int i = 0; i < arrayInt.length; i++) {
			if(i % 2 == 0) {
				System.out.println("Indice " + i + " valor" + arrayInt[i]);
			}
		}
	}
	*/
	
	//Metodo del ejemplo
	public void printEven() {
		//Necesitamos un objeto de tipo EvenIterator, y cuando existe una clase que implementa una interfaz se debe utilizar
		//como tipo la interfaz y no la clase que la implementa
		 DataStructureIterator iterator = this.new EvenIterator();
		 int numero = 0;
	        while (iterator.hasNext()) {
	        	numero = iterator.next();
	        	if(numero != -1) {
	        		System.out.print(numero + " ");
	        	}
	            
	        }
	        
	}

	//La clase anidada
	private class EvenIterator implements DataStructureIterator{
		private int nextIndex = 0;
		
			
		@Override
		public boolean hasNext() {
			return (nextIndex <= SIZE - 1);
		}

		@Override
		public Integer next() {
			Integer retValue = -1;
			if(nextIndex % 2 == 0) {
				 retValue = Integer.valueOf(arrayInt[nextIndex]);
			}
			nextIndex += 1;
			
            return retValue;
		}
	}
	
}
