package model;

public abstract class employee {
    private String id, date, time ,name;
    private String email,password;

    public String getEmployeeId() {
        return id;
    }

    public void setEmployeeId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
