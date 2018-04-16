package eg.edu.alexu.csd.oop.jdbc.cs53;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import javax.swing.JOptionPane;

import eg.edu.alexu.csd.oop.db.cs53.MyDatabase;

public class JarReflection {
	public Driver returnDrive(String path){
		try {
			JarInputStream jarFile = new JarInputStream(new FileInputStream(path));
			File myJar = new File(path);
			URL url = myJar.toURI().toURL();
			Class[] parameters = new Class[] { URL.class };
			URLClassLoader sysLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
			Class sysClass = URLClassLoader.class;						
			Method method = sysClass.getDeclaredMethod("addURL", parameters);
			method.setAccessible(true);
			method.invoke(sysLoader, new Object[] { url });
			JarEntry jarEntry;
			while (true) {
				jarEntry = jarFile.getNextJarEntry();
				if (jarEntry == null) {
					break;
				}
				if (jarEntry.getName().endsWith(".class")) {
					String name = jarEntry.getName().replaceAll("/", "\\.").replace(".class", "");
					if(name.equals("eg.edu.alexu.csd.oop.jdbc.cs53.MyDriver")){
						Constructor cs = ClassLoader.getSystemClassLoader().loadClass(name).getConstructor();
						MyDriver driver = (MyDriver) cs.newInstance();
						return driver;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No Driver");
		}
		return null;
	}
	

}
