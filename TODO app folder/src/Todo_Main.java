import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Todo_Main {

    public static void main(String[] args) {

        System.out.println("Current argument: " + Arrays.toString(args));
        ArrayList<String> tasks = new ArrayList<>();
        Task task = new Task();


        if (args.length == 0) {
            System.out.println("Command Line Todo application\n=============================\n\n" +
                    "-l  Lists all the tasks\n-a  Adds a new task\n-r  Removes an task\n-c  Completes a task");
        } else {
            switch (args[0]) {
                case "-a":
                    task.addTask();
                    break;
                case "-l":
                    task.listTasks();
                    break;
                case "-c":

                    break;
                case "-r":

                    break;
                default:
                    System.out.println("Not a valid argument.");
                    break;
            }
        }
    }


}
