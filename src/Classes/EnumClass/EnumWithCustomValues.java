package Classes.EnumClass;

public enum EnumWithCustomValues {
    MONDAY(101, "First day of week"),
    TUESDAY(102, "Second day of week"),
    WEDNESDAY(103, "Third day of week"),
    THURSDAY(104, "4th day of week"),
    FRIDAY(105, "5th day of week"),
    SATURDAY(106, "6th day of week"),
    SUNDAY(107, "7th day of week");

    private int val;
    private String comment;

    // private constructor, it can be initiated in same class, like above
    EnumWithCustomValues(int i, String s) {
        this.val = i;
        this.comment = s;
    }

    public static EnumWithCustomValues getEnumFromValue(int value){
        for(EnumWithCustomValues enumSampleItem: EnumWithCustomValues.values()){
            if(value == enumSampleItem.val){
                return enumSampleItem;
            }
        }
        return null;
    }
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
