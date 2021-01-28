package eu.ensup.service;

import java.util.Set;

import eu.ensup.service.exception.ServiceException;

/**
 * The interface Service.
 *
 * @param <T> the type parameter
 */
public interface IService<T>
{
	/**
	 * Create int.
	 *
	 * @param entity the entity
	 * @return the int
	 * @throws ServiceException the service exception
	 */
	int create(T entity) throws ServiceException;

	/**
	 * Update int.
	 *
	 * @param entity the entity
	 * @return the int
	 * @throws ServiceException the service exception
	 */
	int update(T entity) throws ServiceException;

	/**
	 * Delete int.
	 *
	 * @param indice the indice
	 * @return the int
	 * @throws ServiceException the service exception
	 */
	int delete(int indice) throws ServiceException;

	/**
	 * Get t.
	 *
	 * @param indice the indice
	 * @return the t
	 * @throws ServiceException the service exception
	 */
	T get(int indice) throws ServiceException;

	/**
	 * Gets all.
	 *
	 * @return the all
	 * @throws ServiceException the service exception
	 */
	Set<T> getAll() throws ServiceException;
}
