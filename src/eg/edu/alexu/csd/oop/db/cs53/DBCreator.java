package eg.edu.alexu.csd.oop.db.cs53;

import java.io.File;

public class DBCreator {
	public String createDataBase(String dbPath) {
		dbPath = dbPath.toLowerCase();
		File db = new File(dbPath);
		if (db.isDirectory() && !db.mkdir()) {
			for (File f : db.listFiles()) {
				f.delete();
			}
		}
		db.mkdirs();
		return db.getAbsolutePath();
	}
}
