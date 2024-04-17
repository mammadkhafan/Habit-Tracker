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

    public User (String username , String password , String first_name , String last_name , String gmail ){
        this.username = username;
        this.password = password;
        setFirstName(first_name);
        setLastName(last_name);
        if (util.isEmailValid(gmail))
            email = gmail;
        else 
            System.out.println("this gmail is invalid!!!");
    }

    public Task getTaskByName(String taskName) {
        for (int i = 0; i < taskSaver.length; i++) {
            if (taskSaver[i].name == taskName) {
                return taskSaver[i];
            }
        }
        System.out.println("there is no task with this name!");
        return null;
    }

    public Task[] getTasksByColor(String color) {
        int counter = 0;
        Task[] tasksWithSameColor_MaxLength = new Task[10];
        for (int i = 0; i < taskSaver.length; i++) {
            if (taskSaver[i].color == color) {
                tasksWithSameColor_MaxLength[counter] = taskSaver[i];
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("you don't have any task with this color!");
            return null;
        }
        else {   
            Task[] tasksWithSameColor_StandardLength = new Task[counter];
            for (int i = 0; i < counter; i++) {
                tasksWithSameColor_StandardLength[i] = tasksWithSameColor_MaxLength[i];
            }
            return tasksWithSameColor_StandardLength;
        }
    }

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
        String fullName = first_name.concat(" ").concat(last_name);
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

    public void makeTheFirstLetterUpperCase(String str) {
        if (str[0] < 123 && str[0] > 96) {
                str[0] -= 32;
        }

        for (int i = 1; i < str.length; i++) {
            if (str[i] < 91 && str[i] > 64) {
                str[i] += 32;
            }
        }

        return str;
    }

    public void setFirstName(String firstName) {
        first_name = makeTheFirstLetterUpperCase(firstName); //first_name is the class attrbute
    }

    public void setLastName(String lastName) {
        last_name = makeTheFirstLetterUpperCase(lastName);  //last_name is the class attrbute
    }

    public String getUsername () {
        return username;
    }

    public String getPassword () {
        return password;
    }

    





}
