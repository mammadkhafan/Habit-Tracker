package UserPackage;
import TaskPackage.Task;
import java.util.Scanner;

public class User {
    private String username ;
    private String password ;

    public String first_name ;
    public String last_name ;
    public String email ;
    public int streak;

    public Task createTask() {
        Scanner input = new Scanner(System.in);
        String taskName = input.nextLine();
        Task task = new Task(taskName , this);
        return task;
    }

    public String getFullName() {
        String fullName = first_name + " " + last_name;
        return (fullName);
    }

    public void setUsername (String newUsername) {
        username = newUsername ;
    }

    public void setPassword (String newPassword) {
        password = newPassword ;
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
