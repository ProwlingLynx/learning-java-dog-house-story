package characters;

import org.junit.jupiter.api.*;
import templates.IDog;
import templates.StoryCharacter;

import static org.junit.jupiter.api.Assertions.*;

class TestDexter {
    @Nested
    @DisplayName("Check if Dexter implements IDog and StoryCharacter")
    class CheckParents {
        Dexter dexter;
        @BeforeEach
        void create_new_Dexter(){
            dexter = new Dexter();
        }
        @Test
        void should_implement_IDog() {
            assertInstanceOf(IDog.class, dexter);
        }

        @Test
        void should_inherit_StoryCharacter(){
            assertInstanceOf(StoryCharacter.class, dexter);
        }
    }

    @Nested
    @DisplayName("Interface method tests")
    class TestInterfaceMethods{
        Dexter dexter;
        @BeforeEach
        void create_new_dexter(){
            dexter = new Dexter();
        }

        @Test
        void speak_should_return_woof_string(){
//            given
            String expected = "Woof!";
//            when
            String actual = dexter.speak();
//            then
            assertEquals(expected, actual);
        }

        @Test
        void beg_should_return_string(){
            String expected = "*Whine!*";
            String actual = dexter.beg();
            assertEquals(expected, actual);
        }
        @Test
        void chew_should_return_string(){
            String expected = "GrrNomNom";
            String actual = dexter.chew();
            assertEquals(expected, actual);
        }
        @Test
        void wagTail_should_return_string(){
            String expected = "Happy Tail Wag!";
            String actual = dexter.wagTail();
            assertEquals(expected, actual);
        }
        @Test
        void eat_should_return_string(){
            String expected = "Nom!";
            String actual = dexter.eat();
            assertEquals(expected, actual);
        }
    }

}