package Classes.EnumClass;

public enum EnumSample {
    MONDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Monday dummy method invoked");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    /*
        Internally values are given to enums values
        Monday is 0, tuesday is 1, .......Sunday is 7
        order in which they are writter
    */

    public void dummyMethod(){
        System.out.println("Dummy method invoked");
    }

}
