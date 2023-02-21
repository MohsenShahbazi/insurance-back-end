package ir.pt.insurance.enums;

public enum Gender {
    Male(0) {
        @Override
        public String getTitle() {
            return "آقا";
        }
    }, Female(1) {
        @Override
        public String getTitle() {
            return "خانم";
        }
    };

    private final int value;

    Gender(int value) {
        this.value = value;
    }

    public abstract String getTitle();

    public int getValue() {
        return this.value;
    }
}
