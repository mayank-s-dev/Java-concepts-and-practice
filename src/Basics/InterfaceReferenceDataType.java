package Basics;

interface Person{
    public String profession();
}

class Engineer implements Person{
    @Override
    public String profession() {
        return null;
    }
}

class Teacher implements Person{

    @Override
    public String profession() {
        return null;
    }
}
public class InterfaceReferenceDataType {
    public static void main(String args[]){
        Person softwareEngineer = new Engineer();
        Person teacher = new Teacher();

        Engineer engineer1 = new Engineer();
        Teacher teacher1 = new Teacher();
    }
}
