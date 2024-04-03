package Models;


import java.io.*;
import java.util.stream.Collectors;
import java.nio.file.*;

public class TextEditorModel {
    public String readFile(File file) throws IOException {
        if (file.getName().endsWith(".txt")) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        }
        return "";
    }

    public void saveFile(File file, String content) throws IOException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write(content);
        }
    }

    public void traverseDirectory(File directory) throws IOException {
        Files.walk(directory.toPath())
                .filter(Files::isRegularFile)
                .forEach(file -> {
                    try {
                        readFile(file.toFile());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}

