package eu.ensup.service.exceptions;

import eu.ensup.dao.BaseDao;
import org.apache.log4j.Logger;

public class BaseServiceException extends Exception {


    public final static Logger logger = Logger.getLogger(BaseServiceException.class);

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     */
    public BaseServiceException() {
        super("");
    }
}
