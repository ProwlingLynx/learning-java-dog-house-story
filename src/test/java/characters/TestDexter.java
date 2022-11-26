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
        void should_return_string(){
//            given
            String expected = "Woof!";
//            when
            String actual = dexter.speak();
//            then
            assertEquals(expected, actual);
        }
    }

}