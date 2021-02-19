package rnd.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class CopyDirectory_Paths_recursive {

    public static void main(String[] args) {

        String fromDirectory = "C:\\data\\map-1";
        String toToDirectory = "C:\\data";
        try {
            copyDirectory(Paths.get(fromDirectory),Paths.get(toToDirectory));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyDirectory(Path source, Path target)
            throws IOException {
        // is this a directory?
        if (Files.isDirectory(source)) {
            //if target directory exist?
            if (Files.notExists(target)) {
                // create it
                Files.createDirectories(target);
            }
            // list all files or folders from the source, Java 1.8, returns a stream
            // doc said need try-with-resources, auto-close stream
            try (Stream<Path> paths = Files.list(source)) {
                // recursive loop
                paths.forEach(p ->
                        {
                        	 try {
								copyDirectory(p, target.resolve(source.relativize(p)));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
                );
            }

        } else {
            // if file exists, replace it
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}