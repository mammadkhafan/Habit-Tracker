package TaskPackage;


public class Task {
    public String name ;
    public double start_time ;
    public double finish_time ;

    public double getDuration(){
        double duration = finish_time - start_time;
        return (duration);
    }

    public Task (String name) {
        this.name = name ;
    }
}