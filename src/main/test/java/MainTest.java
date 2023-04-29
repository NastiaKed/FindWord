import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    String text = "Old unsatiable s1mple our now but considered d1mple travelling impression. pop1t In excuse hardly summer in basket misery. By rent sqw1sh an part need. At wrong of of water those linen. Needed b1t oppose seemed how all. Very mrs shed shew gave you.";
    @Test
    public void testOfGettingWords(){
        assertEquals("[s1mple, d1mple, b1t]", main.getWords(text).toString());
    }

}