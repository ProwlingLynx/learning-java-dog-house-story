package teller;

import characters.Dexter;

public class Story {
    public static void main(String[] args) {
        System.out.println("Our story starts with an adorable husky. His name is Dexter.");
        System.out.println("Here is Dexter right now.");
        Dexter dexter = new Dexter();
        dexter.speak();
        System.out.println("Dexter is not alone. His family is currently cooking. And Dexter is always looking for" +
                "a quick snack.");
        dexter.speak();
    }
}
