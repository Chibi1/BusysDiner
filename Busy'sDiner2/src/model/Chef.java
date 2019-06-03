package model;

public class Chef {

    private static final String PREFIX = "CHEF - ";

    private Order order;

    public Chef() {
        order = null;
    }

    //MODIFIES: this, order
    //EFFECTS: makes food and logs order as prepared
    public void makeDish(Order order) {
        this.order = order;
        prepareIngredients();
        followRecipe();
        cookFood();
        plate();
    }

    //EFFECTS: prints out a doing dishes message
    public void doDishes() {
        System.out.println(PREFIX + "Cleaning, scrubbing...");
        System.out.println("Dishes done.");
    }

    //EFFECTS: prints out the ingredients being prepared
    private void prepareIngredients() {
        int counter = 0;
        for (int i = 0; i < order.getIngredients().size() - 2; i++) {
            System.out.printf("%s, ", order.getIngredients().get(i));
            counter++;
        }
        System.out.printf("%s and %s.\n", order.getIngredients().get(counter), order.getIngredients().get(counter + 1));

    }

    //EFFECTS: prints out the recipe being followed
    private void followRecipe() {
        System.out.println(order.getRecipe());
    }

    //EFFECTS: prints out a message about cooking food
    private void cookFood() {
        System.out.println(PREFIX + "Grilling sandwich...");
    }

    //MODIFIES: order
    //EFFECTS: logs order as prepared and prints out a plating message
    private void plate() {
        order.setIsPrepared();
        System.out.print(PREFIX + "Plated order: ");
        order.print();
        this.order = null;
    }
}
