package Classes.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final String name;

    private final List<Object> petNameList;

    public ImmutableClass(String name, List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetNameList() {
        /*
            returning new list, instead of the actual reference, because list you return it directly
            using reference list can be modified.

            In case of list, final says always point to same list, like storing the address
            If you return that address/reference, values of list can be modified, but it is not allowed in
            immutable class
        */

        return new ArrayList<>(petNameList);
    }
}
