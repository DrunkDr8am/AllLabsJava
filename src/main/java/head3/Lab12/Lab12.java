package head3.Lab12;

import java.nio.file.Path;

public class Lab12 {
    public static void main(String[] args) {
        Path path = Path.of("/Users/aleksejagnenkov/IdeaProjects/CoreJava");
        PathInfo.printPathInfo(path);
    }
}