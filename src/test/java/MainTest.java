import org.example.Main;
import org.example.WorkintechList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    @Test
    @DisplayName("Stack ile palindrom saayılar doğru bulunabiliyor mu ?")
    public void testPalindrome(){
        assertTrue(Main.checkForPalindrome("I did, did I?"));
        assertTrue(Main.checkForPalindrome("Racecar"));
        assertFalse(Main.checkForPalindrome("hello"));
        assertTrue(Main.checkForPalindrome("Was it a car or a cat I saw ?"));
        assertFalse(Main.checkForPalindrome("Test"));
        assertFalse(Main.checkForPalindrome("Welcome"));
    }

    @Test
    @DisplayName("convertToDecimal methodu 10 luk tabandaki sayıları 2 lik taban cevirebiliyor mu ?")
    public void testConvertToDecimal(){
        assertEquals(Main.convertDecimalToBinary(5), "101");
        assertEquals(Main.convertDecimalToBinary(6), "110");
        assertEquals(Main.convertDecimalToBinary(13), "1101");
    }

    @Test
    @DisplayName("WorkintechList doğru tipe sahip mi ?")
    public void testWorkintechListType(){
        WorkintechList list = new WorkintechList();
        assertInstanceOf(ArrayList.class, list);
        assertInstanceOf(List.class, list);
    }
    
    @Test
    @DisplayName("WorkintechList'e aynı eleman birden fazla kez eklenebiliyor mu ?")
    public void testWorkintechListAddMethod(){
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        assertEquals(list.size(), 3);
    }

    @Test
    @DisplayName("WorkintechList sort metodu doğru çalışıyor mu?")
    public void testWorkintechListSortMethod(){
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.sort();
        assertEquals(list.get(0), "Ali");
        assertEquals(list.get(list.size()-1), "Zeynep");
    }

    @Test
    @DisplayName("WorkintechList remove metodu doğru çalışıyor mu?")
    public void testWorkintechListRemoveMethod(){
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.remove("Ali");
        assertNotEquals(list.get(0), "Ali");
        assertEquals(list.get(0), "Mehmet");
    }

}
