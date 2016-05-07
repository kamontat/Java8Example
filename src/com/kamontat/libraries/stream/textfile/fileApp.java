package com.kamontat.libraries.stream.textfile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author kamontat
 * @since 8/5/59 - 01:10
 */
public class fileApp {
	public static void main(String[] args) {
		Path path = new File("src/com/kamontat/libraries/stream/textfile/textFile").toPath();
		try {
			Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);

			// run this when close method has been run.
			lines.onClose(() -> System.out.println("\nDone!"));

			// print all number in text file
			lines.forEach(System.out::println);

			// close
			lines.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
