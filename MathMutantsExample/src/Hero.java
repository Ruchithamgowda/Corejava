package mutants;

public class Hero {
        private String power;
        private String strength;
        private String speech;
        private String origin;
        private String codeName;


        void setPower(String power) {
                this.power = power;
        }

        void setStrength(String strength) {
                this.strength = strength;
        }

        void setSpeech(String speech) {
                this.speech = speech;
        }

        void setOrigin(String origin) {
                this.origin = origin;
        }

        void setCodeName(String codeName) {
                this.codeName = codeName;
        }

        /
        public String getPower() {
                return power;
        }

        public String getStrength() {
                return strength;
        }

        public String getSpeech() {
                return speech;
        }

        public String getOrigin() {
                return origin;
        }

        public String getCodeName() {
                return codeName;
        }
}
