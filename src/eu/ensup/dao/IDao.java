package eu.ensup.dao;

import java.util.Set;

import eu.ensup.dao.exceptions.DaoException;

public interface IDao<T>
{
	int create(T entity) throws DaoException;
	
	int update(T entity) throws DaoException;
	
	int delete(int indice) throws DaoException;
	
	T get(int indice) throws DaoException;
	
	Set<T> getAll() throws DaoException;
}
