package de.uka.ipd.sdq.palladiofileshare.businesslogic.storage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import de.uka.ipd.sdq.palladiofileshare.businesslogic.util.Util;

public class Storage implements IStorage {	
	
	/**
	 * needs to terminate with a "/"
	 */
	private static final String fileStorageLocation = "uploadedFileStorage/";
	
//	private static Logger logger = Logger.getLogger(Storage.class);

	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.palladiofileshare.businesslogic.storage.IStorage#storeFile(byte[], byte[])
	 */
	public void storeFile(byte[] stream, byte[] fileHash) {

		try {
//			String hashString = Util.createString(fileHash); //TODO check why an error occurs
			String hashString = Util.createString_MK(fileHash);
			FileOutputStream fileOutStream =
				new FileOutputStream(fileStorageLocation + hashString);
			
			try {
				fileOutStream.write(stream);
			} catch (IOException e) {
				e.printStackTrace();
//				logger.error(e);	
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
//			logger.error(e);			
		}
	}
}
