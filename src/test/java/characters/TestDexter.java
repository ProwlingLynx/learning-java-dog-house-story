package characters;

import org.junit.jupiter.api.*;
import templates.IDog;
import templates.StoryCharacter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        private final ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();
        private final PrintStream original = System.out;

        @BeforeEach
        void set_up_byteStreamArray(){
            System.setOut(new PrintStream(capturedOutput));
        }

        @AfterEach
        void restore_original_output(){
            System.setOut(original);
        }
        @BeforeEach
        void create_new_dexter(){
            dexter = new Dexter();
        }

        @Test
        void speak_should_return_woof_string(){
//            given
            String expected = "Woof!\r\n";
//            when
            dexter.speak();
//            then
            assertEquals(expected, capturedOutput.toString());
        }

        @Test
        void beg_should_return_string(){
            String expected = "*Whine!*\r\n";
            dexter.beg();
            assertEquals(expected, capturedOutput.toString());
        }
        @Test
        void chew_should_return_string(){
            String expected = "GrrNomNom\r\n";
            dexter.chew();
            assertEquals(expected, capturedOutput.toString());
        }
        @Test
        void wagTail_should_return_string(){
            String expected = "Happy Tail Wag!\r\n";
            dexter.wagTail();
            assertEquals(expected, capturedOutput.toString());
        }
        @Test
        void eat_should_return_string(){
            String expected = "Nom!\r\n";
            dexter.eat();
            assertEquals(expected, capturedOutput.toString());
        }
    }

}