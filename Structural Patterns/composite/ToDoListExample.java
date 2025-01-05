public class ToDoListExample {
    public static void main(String[] args) {
        // Create the root composite task
        CompositeTask project = new CompositeTask("Project");

        // Create sub-composite tasks
        CompositeTask designPhase = new CompositeTask("Design Phase");
        CompositeTask implementationPhase = new CompositeTask("Implementation Phase");
        CompositeTask testingPhase = new CompositeTask("Testing Phase");

        // Create leaf tasks for Design Phase
        Task designUI = new LeafTask("Design User Interface");
        Task createMockups = new LeafTask("Create UI Mockups");

        // Create leaf tasks for Implementation Phase
        Task implementBackend = new LeafTask("Implement Backend");
        Task implementFrontend = new LeafTask("Implement Frontend");

        // Create leaf tasks for Testing Phase
        Task writeUnitTests = new LeafTask("Write Unit Tests");
        Task performIntegrationTests = new LeafTask("Perform Integration Tests");

        // Build the task hierarchy
        designPhase.add(designUI);
        designPhase.add(createMockups);

        implementationPhase.add(implementBackend);
        implementationPhase.add(implementFrontend);

        testingPhase.add(writeUnitTests);
        testingPhase.add(performIntegrationTests);

        project.add(designPhase);
        project.add(implementationPhase);
        project.add(testingPhase);

        // Complete the project
        project.complete();
    }
}
