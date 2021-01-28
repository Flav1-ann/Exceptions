package eu.ensup.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import eu.ensup.dao.exceptions.CRUDException;
import eu.ensup.dao.exceptions.DaoException;

public class BaseDao {

    /**
     * L'url de la base de donnée
     */
    private final String url;
    /**
     * Le login de la base de données
     */
    private final String login;
    /**
     * Le mot de passe de la base de données
     */
    private final String password;
    /**
     * Permet de créer la connection avec la base
     */
    private static Connection cn = null;
    /**
     * Permet d'excuter des requete a partir de la connection
     */
    private static Statement st = null;
    /**
     * Le resultat d'une requete SQL faite dans la base de données
     */
    private static ResultSet rs = null;

    private static PreparedStatement ps = null;

    private static CallableStatement cs = null;

    private  static int result;

    /**
     * The constant logger.
     */
    final static Logger logger = Logger.getLogger(BaseDao.class);


    /**
     * Constructor
     */
    public BaseDao() {
        ResourceBundle bundle = ResourceBundle.getBundle("eu.ensup.domaine.properties.config");
        PropertyConfigurator.configure(bundle.getString("log.pathconfig"));
        //PropertyConfigurator.configureAndWatch("" + bundle.getString("log.pathconfig"));
        this.url = "jdbc:mysql://vps-0c0ccce5.vps.ovh.net:3306/etablissement_scolaire?serverTimezone=Europe/Berlin";
        this.login = "web";
        this.password = "Ensup2020*";
    }

    /**
     * Methode qui permet la connexion a la bdd
     */
    public void connexion() throws DaoException
    {
            try {
				cn = DriverManager.getConnection(url, login, password);
				st = cn.createStatement();
			}
            catch (SQLException e) {throw new CRUDException(e, "Database", "connexion");}
    }

    /**
     * Methode qui permet de ce deconnecter de la bdd
     */
    public void disconnect() throws DaoException
    {
        try {
        	if( rs != null )
        		rs.close();
        	if( cs != null )
        		cs.close();
        	if( ps != null )
        		ps.close();
        	if( st != null )
        		st.close();
        	if( cn != null )
        		cn.close();
        }
        catch (SQLException e) {
        	throw new CRUDException(e, "Database", "disconnect");
        }
    }

    /**
     * Gets ps.
     *
     * @return the ps
     */
    public static PreparedStatement getPs() {
        return ps;
    }

    /**
     * Sets ps.
     *
     * @param ps the ps
     */
    public static void setPs(PreparedStatement ps) {
        BaseDao.ps = ps;
    }

    /**
     * Gets cs.
     *
     * @return the cs
     */
    public static CallableStatement getCs() {
        return cs;
    }

    /**
     * Sets cs.
     *
     * @param cs the cs
     */
    public static void setCs(CallableStatement cs) {
        BaseDao.cs = cs;
    }

    /**
     * Gets cn.
     *
     * @return the cn
     */
    public static Connection getCn() {
        return cn;
    }

    /**
     * Sets cn.
     *
     * @param cn the cn
     */
    public static void setCn(Connection cn) {
        BaseDao.cn = cn;
    }

    /**
     * Gets st.
     *
     * @return the st
     */
    public static Statement getSt() {
        return st;
    }

    /**
     * Sets st.
     *
     * @param st the st
     */
    public static void setSt(Statement st) {
        BaseDao.st = st;
    }

    /**
     * Gets rs.
     *
     * @return the rs
     */
    public static ResultSet getRs() {
        return rs;
    }

    /**
     * Sets rs.
     *
     * @param rs the rs
     */
    public static void setRs(ResultSet rs) {
        BaseDao.rs = rs;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public static int getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result
     */
    public static void setResult(int result) {
        BaseDao.result = result;
    }
}
