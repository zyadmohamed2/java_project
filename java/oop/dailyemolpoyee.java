package oop;

public class dailyemolpoyee extends employee{
    private float workdayprice;
    private int dailyrate;

    public dailyemolpoyee(String name, String address, String department, String email, float salary, float workdayprice, int dailyrate){
        super(name, address, department, email, salary);
        this.workdayprice = workdayprice;
        this.dailyrate = dailyrate;
    }

    public float getWorkdayprice() {
        return workdayprice;
    }

    public void setWorkdayprice(float workdayprice) {
        this.workdayprice = workdayprice;
    }

    public int getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(int dailyrate) {
        this.dailyrate = dailyrate;
    }
    

}