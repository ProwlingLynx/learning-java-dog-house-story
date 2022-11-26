package characters;

import templates.IDog;
import templates.StoryCharacter;

public class Dexter extends StoryCharacter implements IDog {
    @Override
    public String speak(){
        return "Woof!";
    }
}
