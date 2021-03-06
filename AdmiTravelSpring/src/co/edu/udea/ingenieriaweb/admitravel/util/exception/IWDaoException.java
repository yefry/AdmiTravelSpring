package co.edu.udea.ingenieriaweb.admitravel.util.exception;

import org.apache.log4j.Logger;

public class IWDaoException extends Exception {
	
	Logger log = Logger.getLogger(getClass());

	public IWDaoException() {
		log.error("Ocurri� un error en el sistema");
	}

	public IWDaoException(String arg0) {
		super(arg0);
		log.error(arg0);
	}

	public IWDaoException(Throwable arg0) {
		super(arg0);
		log.error("Ocurri� un error en el sistema", arg0);
	}

	public IWDaoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		log.error(arg0, arg1);
	}

	public IWDaoException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		log.error(arg0, arg1);
	}

}
