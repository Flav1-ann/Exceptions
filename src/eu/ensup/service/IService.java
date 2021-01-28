package eu.ensup.service;

import java.util.Set;

import eu.ensup.service.exception.ServiceException;

public interface IService<T>
{
	/**
	 * Create the entity as a parameter in the database
	 * 
	 * @param entity
	 * @return type of return of the request
	 * @throws DaoException
	 */
	int create(T entity) throws ServiceException;
	
	/**
	 * Update the entity as a parameter in the database
	 * 
	 * @param entity
	 * @return type of return of the request
	 * @throws DaoException
	 */
	int update(T entity) throws ServiceException;
	
	/**
	 * Remove the entity whose index is in parameter from the database
	 * 
	 * @param indice
	 * @return type of return of the request
	 * @throws DaoException
	 */
	int delete(int indice) throws ServiceException;
	
	/**
	 * Get the entity whose index is in parameter
	 * 
	 * @param indice
	 * @return entity
	 * @throws DaoException
	 */
	T get(int indice) throws ServiceException;
	
	/**
	 * Get all entity in the database
	 * 
	 * @return set of entity
	 * @throws DaoException
	 */
	Set<T> getAll() throws ServiceException;
}
