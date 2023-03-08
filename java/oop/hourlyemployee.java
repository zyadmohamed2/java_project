package oop;

public class hourlyemployee extends employee{
    private float workourprince;
    private int hourlyrate;
    public hourlyemployee(String name, String address, String department, String email, float salary,
            float workourprince, int hourlyrate) {
        super(name, address, department, email, salary);
        this.workourprince = workourprince;
        this.hourlyrate = hourlyrate;
    }
    public float getWorkourprince() {
        return workourprince;
    }
    public void setWorkourprince(float workourprince) {
        this.workourprince = workourprince;
    }
    public int getHourlyrate() {
        return hourlyrate;
    }
    public void setHourlyrate(int hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    
}
