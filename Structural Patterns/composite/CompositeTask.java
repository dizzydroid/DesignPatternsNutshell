import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {
    private List<Task> subTasks = new ArrayList<>();
    private String name;

    public CompositeTask(String name) {
        this.name = name;
    }

    public void add(Task task) {
        subTasks.add(task);
    }

    public void remove(Task task) {
        subTasks.remove(task);
    }

    public Task getChild(int index) {
        return subTasks.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void complete() {
        System.out.println("Completing composite task: " + name);
        for (Task task : subTasks) {
            task.complete();
        }
    }
}
