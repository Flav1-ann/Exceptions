package eu.ensup.dao;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import eu.ensup.dao.exceptions.CRUDException;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Directeur;

/**
 * Classe dao étendant la classe BaseDao et implémentant l'interface IDirecteurDao gérant le CRUD d'un directeur
 *
 * @see BaseDao
 * @see IDirecteurDao
 */
public class DirecteurDao extends BaseDao implements IDirecteurDao {

	/**
	 * Méthode permettant de créer dans la base de données un directeur
	 * @param d un directeur
	 * @return un entier représentant le résultat
	 * @throws SQLException exception SQL
	 */
	@Override
	public int create(Directeur d) throws DaoException {
		connexion();
		try {
			setCs(getCn().prepareCall("{CALL insertDirecteur('"+ d.getNom() +"'," +
					"'"+ d.getPrenom() +
					"','"+ d.getEmail() +
					"','"+ d.getAdresse() +
					"','"+ d.getTelephone() +
					"','"+ d.getMotDePasse() +
					"','" + d.getSalt() +
					"','directeur')}"));
			logger.info("nouveau directeur créé: \n"+d);
			setResult(getCs().executeUpdate());
		}
		catch (SQLException e) {
			throw new CRUDException(e, Directeur.class.getName(), "Create");
		}
		disconnect();
		return getResult();
	}

	/**
	 * Méthode permettant de mettre à jour un directeur dans la base de données
	 * @param d un directeur
	 * @return un entier représentant le résultat
	 * @throws SQLException exception SQL
	 */
	@Override
	public int update(Directeur d) throws DaoException {
		connexion();
		try {
			setCs(getCn().prepareCall("{CALL updateDirecteur("+d.getId()+
					",'"+ d.getNom() +"'," +
					"'"+ d.getPrenom() +
					"','"+ d.getEmail() +
					"','"+ d.getAdresse() +
					"','"+ d.getTelephone() +
					"','"+ d.getMotDePasse() +
					"','" + d.getSalt() +
					"','directeur')}"));
			setResult(getCs().executeUpdate());
		}
		catch (SQLException e) {
			throw new CRUDException(e, Directeur.class.getName(), "Update");
		}
		disconnect();
		return getResult();
	}
	/**
	 * Methode permettant la supression d'un directeur dans la base de données
	 * @param id identifiant du directeur
	 * @return un entier représentant le résultat
	 * @throws SQLException exception SQL
	 */
	@Override
	public int delete(int id) throws DaoException {
		connexion();
		try {
			setCs(getCn().prepareCall("{CALL deleteDirecteur("+id+")}"));
			setResult(getCs().executeUpdate());
		}
		catch (SQLException e) {
			throw new CRUDException(e, Directeur.class.getName(), "Delete");
		}
		disconnect();
		return getResult();
	}
	/**
	 * Méthode permettant la récupération d'un directeur de la base de données par son identifiant
	 * @param id identifiant du directeur
	 * @return un directeur
	 * @throws SQLException exception SQL
	 */
	@Override
	public Directeur get(int id) throws DaoException {
		Directeur d1 = new Directeur();
		connexion();
		try {
			setPs(getCn().prepareStatement("select id_personne,nom,prenom,email,adresse,telephone,mdp,salt,id_role " +
					"from personne a join  personne_phys b on a.id_personne = b.id_phys join directeur c on b.id_phys = c.id_dir " +
					"where id_personne = "+ id +";"));
			setRs(getPs().executeQuery());
			while (getRs().next()){
				d1.setId(getRs().getInt("id_personne"));
				d1.setNom(getRs().getString("nom"));
				d1.setPrenom(getRs().getString("prenom"));
				d1.setEmail(getRs().getString("email"));
				d1.setAdresse(getRs().getString("adresse"));
				d1.setTelephone(getRs().getString("telephone"));
				d1.setMotDePasse(getRs().getString("mdp"));
				d1.setSalt(getRs().getString("salt"));
			}
		}
		catch (SQLException e) {
			throw new CRUDException(e, Directeur.class.getName(), "Get");
		}
		disconnect();
		return d1;
	}



	/**
	 * Mérhode permettant la récupération de tous les directeurs de la base de données
	 * @return une liste de directeurs
	 * @throws SQLException exception SQL
	 */
	@Override
	public Set<Directeur> getAll() throws DaoException {
		connexion();
		Set<Directeur> directeurs = new HashSet<>();
		try {
			setPs(getCn().prepareStatement("select id_personne,nom,prenom,email,adresse,telephone,mdp,salt,id_role " +
					"from personne a join  personne_phys b on a.id_personne = b.id_phys join directeur c on b.id_phys = c.id_dir;"));

			setRs(getPs().executeQuery());
			while(getRs().next()){
				directeurs.add(new Directeur(
						getRs().getInt("id_personne"),
						getRs().getString("nom"),
						getRs().getString("prenom"),
						getRs().getString("email"),
						getRs().getString("adresse"),
						getRs().getString("telephone"),
						getRs().getString("mdp"),
						getRs().getString("salt"),
						null));
			}
		} catch (SQLException e) {
			throw new CRUDException(e, Directeur.class.getName(), "GetAll");
		}
		disconnect();
		return directeurs;
	}
}
