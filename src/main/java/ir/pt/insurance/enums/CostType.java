package ir.pt.insurance.enums;//package ir.pt.insurance.enums;

public enum CostType {
    Hospital(1) {
        @Override
        public String getTitle() {
            return "بیمارستانی";
        }
    },
    Dental(2) {
        @Override
        public String getTitle() {
            return "دندانپزشکی";
        }
    },
    Clinical(3) {
        @Override
        public String getTitle() {
            return "پاراکلینیکی";
        }
    };

    private final int value;

    CostType(int value) {
        this.value = value;
    }

    public abstract String getTitle();

    public int getValue() {
        return this.value;
    }

    }
