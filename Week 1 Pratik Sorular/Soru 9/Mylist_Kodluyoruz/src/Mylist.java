import java.util.ArrayList;

public class Mylist {
    boolean response;
    int count = 0;
    int arraysize = 5;
    ArrayList<String> strings = new ArrayList<String>(arraysize);


    public void adds(String input) {
        char[] ch = input.toCharArray();
        response = (ch[0] == 'c') || (ch[0] == 'C');
        if (response == true) {
            strings.add(input);
            count++;
            if (arraysize == count) {
                arraysize = arraysize + 7;
            }
        }

    }

    public void print() {
        for (String name : strings) {
            System.out.println(name);
        }


    }

    public static void main(String[] args) {
        Mylist obj = new Mylist();

        obj.adds("ceyhun");
        obj.adds("Ceyda");
        obj.adds("fatih");
        obj.adds("accaa");
        obj.adds("cekda");
        obj.adds("Cemda");
        obj.adds("c");
        obj.adds("ccc");
        obj.adds("cc");
        obj.adds("cccc");
        obj.adds("ccc");


        obj.print();

    }
}