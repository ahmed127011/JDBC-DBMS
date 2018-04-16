package eg.edu.alexu.csd.oop.db.cs53;

import java.io.File;
import java.util.HashMap;

public class DropDataBase {
	public void dropTable(String dbPath, String tablePath) {
		dbPath = dbPath.toLowerCase();
		MyDatabase.tables = new HashMap<>();
		File db = new File(dbPath);
		File table = null;
		if (db.exists() && db.isDirectory()) {
			filesToBeDeleted(db.listFiles());
			db.delete();
		} else {
			throw null;
		}

	}

	private void filesToBeDeleted(File[] filesToBeFiltered) {
		for (File f : filesToBeFiltered) {
			f.delete();
		}

	}
}
