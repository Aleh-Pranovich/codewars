package tes;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvilAutocorrectPrankTest {

    @Test
    public void autocorrectbaYouUSister() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "You u youville utube you youyouyou uuu raiyou united youuuu u you"),
                "your sister your sister youville utube your sister youyouyou uuu raiyou united your sister your sister your sister" ,
                EvilAutocorrectPrank.autocorrect("You u youville utube you youyouyou uuu raiyou united youuuu u you"));
    }

    @Test
    public void autocorrectbaYou() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "I want to film the bayou with you and put it on youtube"),
                "I want to film the bayou with your sister and put it on youtube" ,
                EvilAutocorrectPrank.autocorrect("I want to film the bayou with you and put it on youtube"));
    }

    @Test
    public void autocorrectYou() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "you"),"your sister" ,
                EvilAutocorrectPrank.autocorrect("you"));
    }

    @Test
    public void autocorrectYOU() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "YOU"),"your sister" ,
                EvilAutocorrectPrank.autocorrect("YOU"));
    }

    @Test
    public void autocorrectU() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "u"),"your sister" ,
                EvilAutocorrectPrank.autocorrect("u"));
    }

    @Test
    public void autocorrectYouuu() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "youu"),"your sister" ,
                EvilAutocorrectPrank.autocorrect("youu"));
    }

//    @Test
//    public void autocorrectUUUU() throws Exception {
//        assertEquals(String.format("Wrong result for \"%s\":", "UUuu"),"your sister" ,
//                EvilAutocorrectPrank.autocorrect("UUuu"));
//    }

    @Test
    public void autocorrectIMissYouE() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "I miss you!"),"I miss your sister!" ,
                EvilAutocorrectPrank.autocorrect("I miss you!"));
    }

    @Test
    public void autocorrectYouE() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "you!"),"your sister!" ,
                EvilAutocorrectPrank.autocorrect("you!"));
    }

    @Test
    public void autocorrectYouAndOther() throws Exception {
        assertEquals(String.format("Wrong result for \"%s\":", "miss you"),"miss your sister" ,
                EvilAutocorrectPrank.autocorrect("miss you"));
    }

    @Test
    public void testApply() {
        String[] inputs = new String[] {
                "u",
                "you",
                "Youuuuu",
                "youtube"
        };

        String[] outputs = new String[] {
                "your sister",
                "your sister",
                "your sister",
                "youtube"
        };

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i],
                    EvilAutocorrectPrank.autocorrect(inputs[i]));
        }
    }


}