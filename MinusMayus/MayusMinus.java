class Main {
	public static void main(String[] args) {
		// Algunas cadenas para probar ;)
		String[] cadenas = { "HOLA", "mundo", "No sé", "Hola", "Parzibyte" };
		for (String cadena : cadenas) {
			// Imprimir cadena actual, sin nueva línea
			System.out.print(cadena + " --> ");
			// Y luego imprimir si es mayúscula, minúscula o mixta
			if (esMayuscula(cadena)) {
				System.out.println("Mayúscula");
			} else if (esMinuscula(cadena)) {
				System.out.println("Minúscula");
			} else {
				System.out.println("Mixta");
			}
		}
	}

	public static boolean esMayuscula(String s) {
		// Regresa el resultado de comparar la original con su versión mayúscula
		return s.equals(s.toUpperCase());
	}

	public static boolean esMinuscula(String s) {
		// Regresa el resultado de comparar la original con su versión minúscula
		return s.equals(s.toLowerCase());
	}
}