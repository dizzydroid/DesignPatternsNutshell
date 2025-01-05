public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        System.out.println("Making tea:");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee:");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
