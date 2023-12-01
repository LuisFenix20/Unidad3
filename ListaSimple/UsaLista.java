public class UsaLista {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        // Insertar nodos
        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("O");
        lista.insertaAlFinal("Y");
        lista.insertaEntreNodos("R", "A");
        lista.imprimir(); // Imprime la lista

        //Buscar nodo por posición
        int posicionBuscada = 2;
        Node nodoEnPosicion = lista.buscarPorPosicion(posicionBuscada);
        if (nodoEnPosicion != null) {
            System.out.println("Nodo en posición " + posicionBuscada + ": " + nodoEnPosicion.name);
        } else {
            System.out.println("Posición no válida.");
        }

       
        lista.insertarAntesDelUltimo("N");
        lista.imprimir(); 

     
        String nombreBuscado = "O";
        String nuevoNombre = "X";
        boolean intercambioExitoso = lista.intercambiarNodo(nombreBuscado, nuevoNombre);
        if (intercambioExitoso) {
            System.out.println("Nodo con nombre '" + nombreBuscado + "' intercambiado por '" + nuevoNombre + "'.");
        } else {
            System.out.println("Nodo con nombre '" + nombreBuscado + "' no encontrado.");
        }
        lista.imprimir(); 
    }
}