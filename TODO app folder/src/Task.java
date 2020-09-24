import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task {

    Scanner scanner = new Scanner(System.in);


    public Task() {
    }

    public void addTask() {
        String input = scanner.nextLine();
        try {
            Path thePath = Paths.get("..\\tasks.txt");
                Files.readAllLines(thePath);
                ArrayList<String> buffer = new ArrayList<>(Files.readAllLines(thePath));
                buffer.add("[ ]" + input);
                Files.write(thePath, buffer);

        } catch (
                IOException e) {
            System.out.println("Unable to write file");
        }
    }

    public void listTasks () {
        try {
            Path thePath = Paths.get("..\\tasks.txt");
            List<String> lines = Files.readAllLines(thePath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println((i+1) + " " + lines.get(i));
            }
        } catch (IOException e) {System.out.println("Unable to read the file");
        }
    }

}
