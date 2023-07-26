import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CookBook{
    private static Map<String, String> recipes;

    static {
        recipes = new HashMap<>();
        recipes.put("Pasta", "Boil pasta and add your favorite sauce.");
        recipes.put("Omelette", "Whisk eggs, add vegetables, and cook in a pan.");
        recipes.put("Salad", "Chop fresh vegetables and mix with dressing.");
        recipes.put("Maggie","Boil Maggie and add the taste maker given in it.");
        recipes.put("Rice","Add rice to the boling water and cook it, itll it is ready to eat.");
        recipes.put("Potato","wash the potatos and slice them into pieces then fry them"
        					+ " in a pan until they are brown");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Recipe Finder App!");
        System.out.println("Available Recipes:");
        for (String recipe : recipes.keySet()) {
            System.out.println("- " + recipe);
        }

        System.out.print("Enter the name of the recipe you want to find: ");
        String userInput = scanner.nextLine();

        String recipeDescription = recipes.get(userInput);
        if (recipeDescription != null) {
            System.out.println("\nRecipe for " + userInput + ":");
            System.out.println(recipeDescription);
        } else {
            System.out.println("\nRecipe not found. Please try another recipe.");
        }

        scanner.close();
    }
}
