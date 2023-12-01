public class ListaSimple{
	Node top;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 

	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}

	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp = null;
			
			return true;
		}
		else return false;
	}

	public Node buscarPorPosicion(int posicion) {
		if (posicion < 0) {
			return null; // Posición inválida
		}
	
		int index = 0;
		Node temp = this.top;
	
		while (temp != null && index < posicion) {
			temp = temp.next;
			index++;
		}
	
		return temp;
	}

	public void insertarAntesDelUltimo(String nombre) {
		Node nuevoNodo = new Node();
		nuevoNodo.name = nombre;
		nuevoNodo.next = null;
	
		if (this.top == null) {
			this.top = nuevoNodo; // La lista está vacía, el nuevo nodo se convierte en el primero
		} else {
			Node temp = this.top;
	
			while (temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
	
			nuevoNodo.next = temp.next;
			temp.next = nuevoNodo;
		}
	}

	public boolean intercambiarNodo(String nombreActual, String nombreNuevo) {
		Node temp = this.top;
	
		while (temp != null && !temp.name.equals(nombreActual)) {
			temp = temp.next;
		}
	
		if (temp != null) {
			temp.name = nombreNuevo;
			return true;
		} else {
			return false; // Nodo no encontrado
		}
	}

}













