package Classes.EnumClass;

public enum EnumInterfaceSample implements MyEnumInterface{
    MONDAY,
    TUESDAY;
    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
