package eu.ensup.service;

import eu.ensup.dao.CoursDao;
import eu.ensup.dao.ICoursDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.dao.exceptions.DatabaseException;
import eu.ensup.domaine.Cours;

import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exception.coursExceptions.*;
import eu.ensup.service.exception.etudiantExceptions.AddEtudiantServiceException;
import eu.ensup.service.exception.etudiantExceptions.DeleteEtudiantServiceException;
import eu.ensup.service.exception.etudiantExceptions.UpdateEtudiantServiceException;


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
        }catch (DaoException e) {
            throw new AddCoursServiceException();
        }

    }

    @Override
    public int updateCours(Cours cours) throws UpdateCoursServiceException {
        try{
            return coursDao.updateCours(cours) ;
        }catch (DaoException e) {
            throw new UpdateCoursServiceException();
        }
    }

    @Override
    public int deleteCours(Cours cours) throws DeleteCoursServiceException {
        try{
            return coursDao.deleteCours(cours) ;
        }catch (DaoException e) {
            throw new DeleteCoursServiceException();
        }
    }

    @Override
    public Cours getCours(int id) throws GetCoursServiceException {
        try{
            return coursDao.getCours(id) ;
        }catch (DaoException e) {
            throw new GetCoursServiceException();
        }
    }

    @Override
    public List<Cours> findAll() throws GetAllCoursServiceException {
        try{
            return coursDao.findAll() ;
        }catch (DaoException e) {
            throw new GetAllCoursServiceException();
        }
    }

    @Override
    public int inscription(Cours c, Etudiant e) throws InscriptionCoursServiceException {
        try{
            return coursDao.inscription(c, e);
        }catch (DaoException data) {
            throw new InscriptionCoursServiceException();
        }
    }

    @Override
    public List<Cours> getCoursEtudiant(int idEtudiant) throws GetCoursEtudiantServiceException {
        try{
            return coursDao.getCoursEtudiant(idEtudiant);
        }catch (DaoException e) {
            throw new GetCoursEtudiantServiceException();
        }
    }

}
