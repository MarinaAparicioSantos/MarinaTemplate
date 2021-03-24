package clases;

import java.util.ArrayList;

public interface Minilist {
	
	
	ArrayList<Main> minilist = new ArrayList<Main>();
	
	/**
	 * Añade un objeto a la lista.
	 * @param Objeto
	 * @return Object
	 */
	public Object add (ArrayList<Main> Objeto);
	
	/**
	 * Permite saber si un elemento esta o no esta en la lista.
	 * @param Objeto
	 * @return boolean
	 */
	public boolean contains(ArrayList<Main> Objeto);
	
	
	/**
	 * permite borrar elemento que se le pasa como parametro a la lista 
	 * y nos indica si el elemento se ha borrado o no.
	 * @param Objeto
	 * @return boolean
	 */
	public boolean delete (ArrayList<Main> Objeto);
	
	/**
	 * Indica la posicion del elemento a eliminar.
	 * @param Objeto
	 * @return Object[]
	 */
	public Object[] delete2 (ArrayList<Main> Objeto);
	
	/**
	 * Añade un elemento en una posicion concreta de la lista y lo sobreescribe 
	 * y dice si el elemento que hay ha cambiado o es el mismo.
	 * @param Objeto
	 * @return Object[]
	 */
	public Object[] añadir (ArrayList<Main> Objeto);
	
	/**
	 * Devuelve el elemento que se pida según su posicion.
	 * @param Objeto
	 * @return Object[]
	 */
	public  Object[] posicion (ArrayList<Main> Objeto);
	
	/**
	 * Devuelve la cantidad de elementos que exista en la lista, 
	 * @param Objeto
	 * @return int
	 */
	public int said (ArrayList<Main> Objeto);
	
	/**
	 * Vacia la lista de elementos.
	 * @param Objeto
	 */
	public void clear (ArrayList<Main> Objeto);
}
