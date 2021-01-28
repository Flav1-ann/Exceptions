package eu.ensup.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.dao.exceptions.CRUDException;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Cours;
import eu.ensup.domaine.Etudiant;


/**
 * The type Cours dao.
 */
public class CoursDao extends BaseDao implements ICoursDao {
	@Override
	public int addCours(Cours cours) throws DaoException
	{
		connexion();
		try {
			String sql = "SELECT * FROM `cours` WHERE `theme` = ? AND `nb_heures`  = ? ";
			BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
			BaseDao.getPs().setString(1, cours.getTheme());
			BaseDao.getPs().setInt(2, cours.getNbHeures());
			BaseDao.setRs(BaseDao.getPs().executeQuery());
			if (!BaseDao.getRs().next()) {
				sql = "INSERT INTO cours(theme,nb_heures) VALUES (?,?)";
				BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
				BaseDao.getPs().setString(1, cours.getTheme());
				BaseDao.getPs().setInt(2, cours.getNbHeures());

				BaseDao.setResult(BaseDao.getPs().executeUpdate());
				BaseDao.logger.info("le cours :" + cours + " a ete ajouté");
			} else {
				BaseDao.logger.info("le cours:" + cours + " exsite déjà");
			}
		} catch (SQLException e) {
			throw new CRUDException(e, Cours.class.getName(), "Add");
		}
		disconnect();
		return BaseDao.getResult();
	}

	@Override
	public int updateCours(Cours cours) throws DaoException {
		connexion();
		try {
			String sql = "UPDATE `cours` SET `theme`= ?,`nb_heures`= ?";
			BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
			BaseDao.getPs().setString(1, cours.getTheme());
			BaseDao.getPs().setInt(2, cours.getNbHeures());

			BaseDao.setResult(BaseDao.getPs().executeUpdate());
		} catch (SQLException e) {
			throw new CRUDException(e, Cours.class.getName(), "Update");
		}
		disconnect();
		return BaseDao.getResult();
	}

	@Override
	public int deleteCours(Cours cours) throws DaoException
	{
		connexion();
		String sql;
		try {
			sql = "DELETE FROM `cours` WHERE `id_cours` = ?";
			BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
			BaseDao.getPs().setInt(1, cours.getId());
			BaseDao.setResult(BaseDao.getPs().executeUpdate());
		} catch (SQLException e) {
			throw new CRUDException(e, Cours.class.getName(), "Delete");
		}
		disconnect();
		return BaseDao.getResult();

	}

	@Override
	public Cours getCours(int id) throws DaoException {
		connexion();
		String sql;
		try {
			sql = "Select * from cours where id_cours=?";
			BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
			BaseDao.getPs().setInt(1, id);
			BaseDao.setRs(BaseDao.getPs().executeQuery());
			while (getRs().next()) {
				return new Cours(getRs().getInt("id_cours"), getRs().getString("theme"), getRs().getInt("nb_heures"));
			}
		} catch (SQLException e) {
			throw new CRUDException(e, Cours.class.getName(), "Get");
		}
		disconnect();
		return null;
	}

	@Override
	public List<Cours> findAll() throws DaoException {
		connexion();

		String sql;
		List<Cours> cours = new ArrayList<>();
		try {
			sql = "SELECT * FROM cours ";
			BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
			BaseDao.setRs(BaseDao.getPs().executeQuery());
			while (BaseDao.getRs().next()) {
				cours.add(new Cours(BaseDao.getRs().getInt("id_cours"), BaseDao.getRs().getString("theme"), BaseDao.getRs().getInt("nb_heures")));
			}
		} catch (SQLException e) {
			throw new CRUDException(e, Cours.class.getName(), "GetAll");
		}
		disconnect();
		return cours;
	}

	@Override
	public int inscription(Cours c, Etudiant e) throws DaoException {
		//creer la connexion
		connexion();

		// TODO Auto-generated method stub
		String sql;
		try {
			sql = "SELECT * FROM `suivre` WHERE `id_etudiant` = ? AND `id_cours` = ?";
			BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
			BaseDao.getPs().setInt(1, e.getId());
			BaseDao.getPs().setInt(2, c.getId());
			BaseDao.setRs(BaseDao.getPs().executeQuery());
			if (getRs().next()) {
				BaseDao.setResult(-1);
			} else {
				//ajouter la requete
				sql = "INSERT INTO suivre(`id_etudiant`, `id_cours`) VALUES (?,?)";
				BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
				BaseDao.getPs().setInt(1, e.getId());
				BaseDao.getPs().setInt(2, c.getId());
				BaseDao.setResult(BaseDao.getPs().executeUpdate());
			}
		} catch (SQLException exp) {
			throw new CRUDException(exp, Cours.class.getName()+"_"+Etudiant.class.getName(), "Lier");
		}
		disconnect();
		return getResult();

	}

	@Override
	public List<Cours> getCoursEtudiant(int idEtudiant) throws DaoException {
		connexion();
		// TODO Auto-generated method stub
		List<Cours> cours = new ArrayList<Cours>();
		try {
			//2- créer la requête
			String sql = "SELECT * FROM cours, suivre, etudiant" +
					" where suivre.id_etudiant = etudiant.id_etudiant" +
					" and suivre.id_cours = club.id_cours" +
					" and inscription.id_etudiant=?";
			BaseDao.setPs(BaseDao.getCn().prepareStatement(sql));
			BaseDao.getPs().setInt(1, idEtudiant);
			BaseDao.setRs(BaseDao.getPs().executeQuery());
			//4- récupérer le résultat
			while (BaseDao.getRs().next()) {
				//1- créer un objet de type cours
				Cours c = new Cours();
				BaseDao.getPs().setString(1, c.getTheme());
				BaseDao.getPs().setInt(2, c.getNbHeures());
				
				//2- ajouter l'objet etudiant à la liste créée
				cours.add(c);
			}
		} catch (SQLException e) {
			throw new CRUDException(e, Cours.class.getName()+"_"+Etudiant.class.getName(), "Get");
		}
		//5- fermer la connexion
		disconnect();
		return cours;
	}
}
