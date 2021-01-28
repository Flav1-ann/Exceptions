package eu.ensup.dao;

import java.util.Set;

import eu.ensup.dao.exceptions.DaoException;

public interface IDao<T>
{
	/**
	 * Create the entity as a parameter in the database
	 * 
	 * @param entity
	 * @return type of return of the request
	 * @throws DaoException
	 */
	int create(T entity) throws DaoException;
	
	/**
	 * Update the entity as a parameter in the database
	 * 
	 * @param entity
	 * @return type of return of the request
	 * @throws DaoException
	 */
	int update(T entity) throws DaoException;
	
	/**
	 * Remove the entity whose index is in parameter from the database
	 * 
	 * @param indice
	 * @return type of return of the request
	 * @throws DaoException
	 */
	int delete(int indice) throws DaoException;
	
	/**
	 * Get the entity whose index is in parameter
	 * 
	 * @param indice
	 * @return entity
	 * @throws DaoException
	 */
	T get(int indice) throws DaoException;
	
	/**
	 * Get all entity in the database
	 * 
	 * @return set of entity
	 * @throws DaoException
	 */
	Set<T> getAll() throws DaoException;
}
