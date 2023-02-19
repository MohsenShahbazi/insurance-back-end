package ir.pt.insurance.enums;//package ir.pt.insurance.enums;

public enum HospitalCostType {
    Chemotherapy(1) {
        @Override
        public String getTitle() {

            return "شیمی درمانی";
        }
    },
    ChemotherapyDrug(2) {
        @Override
        public String getTitle() {
            return "داروی شیمی درمانی";
        }
    },
    IntraocularInjection(3) {
        @Override
        public String getTitle() {
            return "تزریق داخل چشم";
        }
    },

    Cataract(4) {
        @Override
        public String getTitle() {
            return "آب مروارید";
        }
    },

    Ambulance(5) {
        @Override
        public String getTitle() {
            return "آمبولانس";
        }
    },

    other(6) {
        @Override
        public String getTitle() {
            return "سایر";
        }
    };

    private final int value;

    HospitalCostType(int value) {
        this.value = value;
    }

    public abstract String getTitle();

    public int getValue() {
        return this.value;
    }

}
