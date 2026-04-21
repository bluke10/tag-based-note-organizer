import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set testSet = new HashSet();
        testSet.add("first element in set");
        Note testNote = new Note("Content", testSet); //just to see pieces connected
    }
}