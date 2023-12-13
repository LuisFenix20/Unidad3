
public class UsaListaDoble{
	
	public static void main(String[] args){
		ListaDoble lista = new ListaDoble();
		lista.insertaPrimerNodo("R");
		lista.imprimir();
		lista.insertaPrimerNodo("F");
		lista.imprimir();
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("H");
		System.out.println(lista);
		lista.insertaAlFinal("Z");
		System.out.println(lista);
		lista.insertaEntreNodos("T", "R");
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("K");
		System.out.println(lista);
		lista.insertaAlFinal("Ñ");
		System.out.println(lista);
		lista.borrarPrimerNodo();
		System.out.println(lista);
		lista.borrarUltimoNodo();
		System.out.println(lista);
		lista.borrarCualquierNodo("R");
		System.out.println(lista);

		System.out.println("------------------------------");

        
        int posicionBuscada = 1; 
        Node nodoEnPosicion = lista.buscarPorPosicion(posicionBuscada);
        if (nodoEnPosicion != null) {
            System.out.println("Nodo en la posición " + posicionBuscada + ": " + nodoEnPosicion.name);
        } else {
            System.out.println("La posición " + posicionBuscada + " no existe en la lista.");
        }

        System.out.println();

        lista.insertaAntesUltimoNodo("L");


        System.out.println("Lista después de insertar antes del último:");
        lista.imprimir();

        String nombreBuscado = "Z";
        String nombreNuevo = "J";
        lista.intercambiarNodos(nombreBuscado, nombreNuevo);

        System.out.println("Lista después de intercambiar el nodo " + nombreBuscado + " por " + nombreNuevo + ":");
        lista.imprimir();
    }
}
		
	
