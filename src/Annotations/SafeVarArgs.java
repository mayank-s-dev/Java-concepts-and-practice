package Annotations;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgs {
    @SafeVarargs
    public static void PrintLogValues(List<Integer>... logNumbersList){
        // logNumbersList is list of list
        Object[] objectList = logNumbersList;
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // we updated the first list to store list_of_string
        objectList[0] = stringList;
    }
}
