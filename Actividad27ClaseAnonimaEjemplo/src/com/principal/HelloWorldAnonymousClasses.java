package com.principal;

/*
 * Definicion de la clase anonima
 * Una clase anidada anonima es una expresion de clase, es decir, un tipo de clase que se declara y 
 * se instancia en el mismo momento
 */

public class HelloWorldAnonymousClasses {

	public void sayHello() {
		//Clase local
		/*
		 *  class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();
		 */
		
		/*
		 * Convertido a clase anonima
		 */
		HelloWorld englishGreeting = new HelloWorld() {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello, " + name);
            }
        };
		 
		 /*
		  * Clase Anonima, Saludo en frances
		  */
		 HelloWorld frenchGreeting = new HelloWorld() {
	            String name = "tout le monde";
	            public void greet() {
	                greetSomeone("tout le monde");
	            }
	            public void greetSomeone(String someone) {
	                name = someone;
	                System.out.println("Salut " + name);
	            }
	        };
	        
	     /*
		  * Clase Anonima, Saludo en español
		  */
	        HelloWorld spanishGreeting = new HelloWorld() {
	            String name = "mundo";
	            public void greet() {
	                greetSomeone("mundo");
	            }
	            public void greetSomeone(String someone) {
	                name = someone;
	                System.out.println("Hola, " + name);
	            }
	        };
	}
}
