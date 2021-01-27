package eu.ensup.dao.exceptions;

public class DaoException extends Exception
{
	private String nameObject; //Nom de l'object dans la base de donnée
	private String typeAction; //Action crud
	private String initialException; //Nom de la class d'Exception d'origine
	
	public DaoException(String nameObject, String typeAction, String initialException)
	{
		super();
		this.nameObject       = nameObject;
		this.typeAction       = typeAction;
		this.initialException = initialException;
	}
	
	public DaoException(String message, String nameObject, String typeAction, String initialException)
	{
		super(message);
		this.nameObject       = nameObject;
		this.typeAction       = typeAction;
		this.initialException = initialException;
	}
	
	public DaoException(String message, Throwable cause, String nameObject, String typeAction, String initialException)
	{
		super(message, cause);
		this.nameObject       = nameObject;
		this.typeAction       = typeAction;
		this.initialException = initialException;
	}
	
	public DaoException(Throwable cause, String nameObject, String typeAction, String initialException)
	{
		super(cause);
		this.nameObject       = nameObject;
		this.typeAction       = typeAction;
		this.initialException = initialException;
	}

	public String getNameObject() {
		return nameObject;
	}

	public String getTypeAction() {
		return typeAction;
	}

	public String getInitialException() {
		return initialException;
	}
}