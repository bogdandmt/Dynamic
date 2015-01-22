package main;

import java.lang.reflect.InvocationTargetException;

import loader.DynamicLoader;

public class App {
	public static void main(String[] args) {
		DynamicLoader loader = new DynamicLoader();
		loader.setClassDirectory("D:/classes");
		Class<?> cl = loader.loadClass("main.Test");
		try {
			// System.out.println(cl.new

			String[] arr = {};
			Object[] objArr = { arr };
			Object res = cl.getMethods()[0].invoke(null, objArr);
			System.out.println(res);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Test test = new Test();

	}
}
