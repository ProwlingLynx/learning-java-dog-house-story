package characters;

import templates.IDog;
import templates.StoryCharacter;

public class Dexter extends StoryCharacter implements IDog {
    private String breed;
    public Dexter(){
        super("Dexter", "Main Character");
        breed = "Husky";
    }
    @Override
    public void speak(){
        System.out.println("Woof!");
    }

    @Override
    public void beg() {
        System.out.println("*Whine!*");
    }

    @Override
    public void wagTail() {
        System.out.println("Happy Tail Wag!");
    }

    @Override
    public void eat() {
        System.out.println("Nom!");
    }

    @Override
    public void chew() {
        System.out.println("GrrNomNom");
    }
}
