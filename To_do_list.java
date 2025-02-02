import java.util.ArrayList;
import java.util.Scanner;

class $task_part{
    String taskname;
    String Places;
    public $task_part(String name,String places){
        this.taskname = name;
        this.Places =places;
    }
    public String toString(){
        return taskname + ", " + Places;
    }
}
class taskDetail{
    ArrayList<$task_part> task= new ArrayList<>();
    void addTaskDetail($task_part n){
        task.add(n);
        System.out.println("add Task successful");
    }
    void displayTask(){
        if (task.isEmpty()){
            System.out.println("0 Task");
        }else {
            for($task_part v1 :task){
                System.out.println(v1);
                System.out.println("-----------");
            }
        }
    }
    void delete(String taskn){
        boolean remove = task.removeIf(tas ->tas.taskname.equalsIgnoreCase(taskn));
        if (remove){
            System.out.println("Successful remove");
        }else {
            System.out.println("task not found !");
        }
    }
}
public class To_do_list {
    public static void main(String[] args) {
        taskDetail detail = new taskDetail();
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean t = true;
            System.out.println("\nTask Menu:");
            System.out.println(" 0. Exit\n 1. Add Task \n 2. Display All Task \n 3. Delete Task ");
            while(t){
            System.out.print("Enter task : ");
            while(!sc.hasNextInt()){
                System.out.println("Invalid Input");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {t = false;}
            switch (choice) {
                case 1:
                    System.out.print("Enter the TaskName : ");
                    String name = sc.nextLine();
                    System.out.print("Enter the TaskPlaces : ");
                    String places = sc.nextLine();
                    detail.addTaskDetail(new $task_part(name, places));
                    continue;
                case 2:
                    detail.displayTask();
                    continue;
                case 3:
                    System.out.print("Enter the name : ");
                    String SearchName = sc.nextLine();
                    detail.delete(SearchName);
                    continue;
            }}
    }
}