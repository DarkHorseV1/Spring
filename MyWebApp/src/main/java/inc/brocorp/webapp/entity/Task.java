package inc.brocorp.webapp.entity;

public class Task {

    private int id;
    private String date;
    private String task;
    private String implementation;
    private String deadLine;

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }



    public Task(String date, String task, String  implementation, String deadLine) {
        this.date = date;
        this.task = task;
        this.implementation = implementation;
        this.deadLine = deadLine;
    }
}
