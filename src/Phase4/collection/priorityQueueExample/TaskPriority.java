package Phase4.collection.priorityQueueExample;

import java.util.Comparator;

public class TaskPriority implements Comparator<TaskQueue> {
    @Override
    public int compare(TaskQueue o1, TaskQueue o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
