package UserPackage;
import TaskPackage.Task;
import UtilityPackage.*;

public class User {
    private String username ;
    private String password ;

    public String first_name ;
    public String last_name ;
    public String email ;
    public int streak;

    private Task[] taskSaver = new Task[10];
    private int arreyCounter = 0;

    Utils util = new Utils();

    public Task createTask(String name) {
        if (isTaskRepetitive(name)) {
            Task task = new Task(name , this);
            taskSaver[arreyCounter] = task;
            arreyCounter ++;
            return task;
        }
        else {
            System.out.println("your task name is repetive");
            return null;
        }
    }

    public boolean isTaskRepetitive(String taskName) {
        for (int i = 0; i < taskSaver.length; i++) {
            if (taskSaver[i].name == taskName) {
                return false;
            }
        }

        return true;
    }

    public String getFullName() {
        String fullName = first_name + " " + last_name;
        return (fullName);
    }

    public void setUsername (String newUsername) {
        username = newUsername ;
    }

    public void setPassword (String newPassword) {
        if (util.isPasswordValid(newPassword)) {
            password = newPassword ;
        }
    }

    public String getUsername () {
        return username;
    }

    public String getPassword () {
        return password;
    }

    public User (String username , String password , String first_name , String last_name , String gmail ){
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        email = gmail;
    }



}
