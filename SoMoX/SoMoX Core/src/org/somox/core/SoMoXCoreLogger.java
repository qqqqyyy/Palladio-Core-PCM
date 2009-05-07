package org.somox.core;


import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * Wrapper for the runtime logging mechanism with additional utility methods
 *
 * @author Benjamin Klatt
 *
 */
public class SoMoXCoreLogger {
	
	static Logger logger = Logger.getLogger(SoMoXCoreLogger.class);

	public static void logInfo(String message){
		//log(IStatus.INFO,IStatus.OK, message, null);
		logger.info(message);
	}

	public static void logError(Throwable exception){
		logError("UnexpectedException",exception);
		logger.error(exception.getMessage(), exception);
	}

	public static void logError(String message,Throwable exception){
		log(IStatus.ERROR,IStatus.OK, message, exception);
		logger.error(message, exception);
	}

	public static void log(int severity, int code, String message,Throwable exception){
		log(createStatus(severity,code,message,exception));
	}

	public static IStatus createStatus(int severity, int code, String message,Throwable exception){
		return new Status(severity,Activator.PLUGIN_ID,code,message,exception);
	}

	public static void log(IStatus status){
		Activator
			.getDefault()
			.getLog()
			.log(status);
	}
}