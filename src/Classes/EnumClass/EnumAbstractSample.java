package Classes.EnumClass;

public enum EnumAbstractSample {
    MONDAY {
        @Override
        public void dummyAbstractMethod() {
            System.out.println("Monday abstract method");
        }
    },
    TUESDAY {
        @Override
        public void dummyAbstractMethod() {
            System.out.println("Tuesday abstract method");
        }
    },
    WEDNESDAY {
        @Override
        public void dummyAbstractMethod() {
            System.out.println("Wednesday abstract method");
        }
    };

    public abstract void dummyAbstractMethod();
}
