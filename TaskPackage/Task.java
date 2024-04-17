package TaskPackage;
import UserPackage.*;


public class Task {
    public String name;
    private double start_time ;
    private double finish_time ;
    private final String color ;
    private User user;

    public double getDuration(){
        double duration = finish_time - start_time;
        return (duration);
    }

    public Task (String name , String color , User user) {
        setName(name);
        this.color = color;
        this.user = user;
    }

    public Task (String name , User user) {
        setName(name);
        this.user = user;
        color = "000000";
    }

    public void setName(String name) {
        if (name.length() > 10) {
            System.out.println("name is too long");
        }
        else
            this.name = name;
    }

    public static boolean isColorValid  (String color) {
        String true_string = "0123456789ABCDEF";
        for (int j = 0; j < color.length(); j++) {
            for (int i = 0; i < true_string.length(); i++) {
                if (color.charAt(j) != true_string.charAt(i))
                    return false;
            }
        }
        return true;
    }

    public void setStartTime(double time) {
        if (time >= 0.0)
            start_time = time;
    }

    public void setFinishTime(double time) {
        if (time >= 0.0)
            finish_time = time;
    }

}

