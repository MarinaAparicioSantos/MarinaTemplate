package clases;

import java.util.ArrayList;

public interface Minilist {

	/**
	 * El metodo introduce un elemento al final de la lista se pasa elemento a
	 * introducir indica true si el elemento fue insertado lanza
	 * NullPointerException en caso de intentar insertar un valor nulo
	 * 
	 * @param Object
	 * @return boolean
	 */
	public boolean add(Object elemento) throws NullPointerException;

	/**
	 * Metodo que comprueba la existencia de un elemento en la lista se pasa
	 * elemento a buscar indica verdadero si esta, falso si no esta
	 * 
	 * @param Object
	 * @return boolean
	 */
	public boolean contains(Object elemento);

	/**
	 * Elimina el primer elemento que encuentre en la lista que sea igual al
	 * elemento que se pasa como parámetro se pasa elemento a eliminar indica
	 * verdadero si elimino, falso si no
	 * 
	 * @param Object
	 * @return boolean
	 */
	public boolean delete(Object elemento);

	/**
	 * Elimina el elemento que ocupe la posición que se indica como parámetro se
	 * pasa posición del elemento a eliminar indica verdadero si se elimino, falso
	 * si no
	 * 
	 * @param int
	 * @return boolean
	 */
	public boolean delete(int elemento);

	/**
	 * Cambia el elemento que está en la posición que se pasa como parametro se
	 * indica posición a cambiar se pasa elemento a introducir verdadero si se
	 * cambió, falso si no
	 * 
	 * @param Object
	 * @return boolean
	 */
	public boolean set(Object elemento);

	/**
	 * Devuelve el elemento de la posición que se pasa como parámetro
	 * 
	 * @param Object
	 * @return Object
	 */
	public Object get(Object elemento);

	/**
	 * Indica el numero de elementos que tiene la lista
	 * 
	 * @param ArrayList
	 * @return int
	 */
	public int size(ArrayList<Main> Objeto);

	/**
	 * Pone la lista a 0 elementos
	 * 
	 * @param ArrayList
	 */
	public void clear(ArrayList<Main> Objeto);
}