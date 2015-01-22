package loader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class DynamicLoader {

	private String classDirectory;

	public Class<?> loadClass(String name) {
		Class<?> result = null;

		File classDir = new File(classDirectory);
		try {
			URL[] urls = { classDir.toURI().toURL() };
			@SuppressWarnings("resource")
			ClassLoader loader = new URLClassLoader(urls);
			result = loader.loadClass(name);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return result;
	}

	public String getClassDirectory() {
		return classDirectory;
	}

	public void setClassDirectory(String classDirectory) {
		this.classDirectory = classDirectory;
	}

}
