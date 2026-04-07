package com.in28minutes.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./Resourses/plain.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		String newfileContent = fileContent.replace("welcome", "hey");

		Path newpath = Paths.get("./Resourses/simple.txt");
		Files.writeString(newpath, newfileContent);
	}

}