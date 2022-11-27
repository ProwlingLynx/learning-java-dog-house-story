package characters;

import templates.IDog;
import templates.StoryCharacter;

public class Dexter extends StoryCharacter implements IDog {
    @Override
    public String speak(){
        return "Woof!";
    }

    @Override
    public String beg() {
        return "*Whine!*";
    }

    @Override
    public String wagTail() {
        return "Happy Tail Wag!";
    }

    @Override
    public String eat() {
        return "Nom!";
    }

    @Override
    public String chew() {
        return "GrrNomNom";
    }
}
