import DL.Task;
public class Main {
    public static void main(String[] args) {
        Task task = new Task("src/data.txt");
        task.remove(0);
        task.write("№1 First task");
        task.writeNewLine("№2 Second Task");
        task.writeNewLine("№3 Third task");
        task.remove(1);
        System.out.println(task.read());

        String fragmentToSearch = "Second";
        int lineNumber = task.search(fragmentToSearch);

        if (lineNumber != -1) {
            System.out.println("String fragment '" + fragmentToSearch + "' found with number " + lineNumber + " in file");
        } else {
            System.out.println("String fragment '" + fragmentToSearch + "' not found in file.");
        }
    }
}
