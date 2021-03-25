package clases;

public interface MiniList {

	/**
	 * El metodo introduce un elemento al final de la lista se pasa elemento a
	 * introducir indica true si el elemento fue insertado lanza
	 * NullPointerException en caso de intentar insertar un valor nulo
	 * @param Object elemento
	 * @return boolean
	 * @throws NullPointerException
	 ***************
	 * 
	 */
	boolean add(Object elemento) throws NullPointerException;

	/**
	 * Metodo que comprueba la existencia de un elemento en la lista se pasa
	 * elemento a buscar indica verdadero si esta, falso si no esta
	 * 
	 * @param Object elemento
	 * @return boolean
	 */
	public boolean contains(Object elemento);

	/**
	 * Elimina el primer elemento que encuentre en la lista que sea igual al
	 * elemento que se pasa como parámetro se pasa elemento a eliminar indica
	 * verdadero si elimino, falso si no
	 * 
	 * @param Object elemento
	 * @return boolean
	 */
	public boolean delete(Object elemento);

	/**
	 * Elimina el elemento que ocupe la posición que se indica como parámetro se
	 * pasa posición del elemento a eliminar indica verdadero si se elimino, falso
	 * si no
	 * 
	 * @param int elemento
	 * @return boolean
	 */
	public boolean delete(int elemento);

	/**
	 * Cambia el elemento que está en la posición que se pasa como parametro se
	 * indica posición a cambiar se pasa elemento a introducir verdadero si se
	 * cambió, falso si no
	 * 
	 * @param Object elemento
	 * @param int posicion
	 * @return boolean
	 */
	public boolean set(Object elemento, int posicion);

	/**
	 * Devuelve el elemento de la posición que se pasa como parámetro
	 * @param int posicion
	 * @return object
	 * *************
	 * 
	 */
	public Object get(int posicion);

	/**
	 * Indica el numero de elementos que tiene la lista
	 * 
	 * @return int
	 */
	public int size();

	/**
	 * Pone la lista a 0 elementos
	 * 
	 */
	public void clear();
}