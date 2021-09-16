import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.listOfNames();
    }

    private void listOfNames() {
        List<String> names = new ArrayList();
        names.add("Pavel");
        names.add("Viktoria");
        names.add("Marek");
        modify(names, n -> n + " name");
    }

    private void modify(List<String> names, Help change) {
        List newList = new ArrayList();
        for (String name : names) {
            String a = lambdaMethod(name, change);
            newList.add(a);

        }
        System.out.println(newList);

    }

    private String lambdaMethod(String string, Help help) {
      return help.change(string);

    }
}





