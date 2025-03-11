package Phase4.collection.priorityQueueExample;

public class TaskQueue {
    private String taskName;
    private int priority;
    public TaskQueue(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getPriority() {
        return priority;
    }
    @Override
    public String toString() {
        return " priority=" + getPriority() +", taskName=" + getTaskName();
    }
}
