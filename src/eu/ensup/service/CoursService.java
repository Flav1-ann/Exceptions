package eu.ensup.service;

import eu.ensup.dao.CoursDao;
import eu.ensup.dao.ICoursDao;
import eu.ensup.dao.exceptions.DatabaseException;
import eu.ensup.domaine.Cours;

import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exceptions.AddCoursServiceException;
import eu.ensup.service.exceptions.CoursServiceException;

import java.sql.ResultSet;
import java.util.List;

/**
 * The type Cours service.
 */
public class CoursService implements ICoursService {
    private final ICoursDao coursDao = new CoursDao();
    @Override
    public int addCours(Cours cours) throws AddCoursServiceException {
        try{
            return coursDao.addCours(cours) ;
        }catch (DatabaseException data) {
            throw new AddCoursServiceException(data);
        }

    }

    @Override
    public int updateCours(Cours cours) throws CoursServiceException {
        try{
            return coursDao.updateCours(cours) ;
        }catch (DatabaseException data) {
            throw new CoursServiceException(data);
        }
    }

    @Override
    public int deleteCours(Cours cours) throws CoursServiceException {
        try{
            return coursDao.deleteCours(cours) ;
        }catch (DatabaseException data) {
            throw new CoursServiceException(data);
        }
    }

    @Override
    public Cours getCours(int id) throws CoursServiceException {
        try{
            return coursDao.getCours(id) ;
        }catch (DatabaseException data) {
            throw new CoursServiceException(data);
        }
    }

    @Override
    public List<Cours> findAll() throws CoursServiceException {
        try{
            return coursDao.findAll() ;
        }catch (DatabaseException data) {
            throw new CoursServiceException(data);
        }
    }

    @Override
    public int inscription(Cours c, Etudiant e) throws CoursServiceException {
        try{
            return coursDao.inscription(c, e);
        }catch (DatabaseException data) {
            throw new CoursServiceException(data);
        }
    }

    @Override
    public List<Cours> getCoursEtudiant(int idEtudiant) throws CoursServiceException {
        try{
            return coursDao.getCoursEtudiant(idEtudiant);
        }catch (DatabaseException data) {
            throw new CoursServiceException(data);
        }
    }

}
