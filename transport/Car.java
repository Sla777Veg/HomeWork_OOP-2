import java.time.LocalDate;

public class Car {
    private String mark;
    private String model;
    double engineVolume;
    private String bodyColor;
    private int productionYear;
    private String assemblyCountry;
    private String bodyType;
    private int numberSeats;
    private String transmission;
    private String numberRegistration;
    private boolean signSumOrWinTires;
    private Key key;
    private Insurance insurance;

    public Car(String mark,
               String model,
               double engineVolume,
               String bodyColor,
               int productionYear,
               String assemblyCountry,
               Key key, Insurance insurance) {
        this.mark = mark;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyColor = bodyColor;
        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;
        this.bodyType = "седан";
        this.numberSeats = 5;
        this.transmission = "механическая";
        this.numberRegistration = "х000хх000";
        this.signSumOrWinTires = true;
        this.key = new Key();
        this.insurance = insurance;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

        if (this.mark == null) {
            this.mark = "default";
        } else {
            this.mark = this.mark;
        }

        if (model==null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (assemblyCountry==null) {
            this.assemblyCountry = "Россия";
        } else {
            this.assemblyCountry = assemblyCountry;
        }

        if (numberSeats ==0) {
            this.numberSeats = 5;
        } else {
            this.numberSeats = numberSeats;
        }

        if (bodyType==null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }

        if (productionYear ==0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (transmission==null) {
            this.transmission = "механическая";
        } else {
            this.transmission =transmission;
        }

        if (numberRegistration ==null) {
            this.numberRegistration = "х000хх000";
        } else {
            this.numberRegistration = numberRegistration;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public boolean isSignSumOrWinTires() {
        return signSumOrWinTires;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void choiseTired() {
        boolean b = this.signSumOrWinTires != signSumOrWinTires;
    }

    public boolean isCorrectRegNum() {
        if (numberRegistration.length()!=9) {
            return false;
        }
        char[] Chars = numberRegistration.toCharArray();
        if (!Character.isAlphabetic(Chars[0]) || !Character.isAlphabetic(Chars[4]) || !Character.isAlphabetic(Chars[5])) {
            return false;
        }
        if (!Character.isDigit(Chars[1]) || !Character.isDigit(Chars[2]) || !Character.isDigit(Chars[3]) ||
                !Character.isDigit(Chars[6]) || !Character.isDigit(Chars[7]) || !Character.isDigit(Chars[8])) {
            return false;
        }
        return true;
    }

     //Создаем вложенный класс Key
    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
        //Класс Страховка
    public static class Insurance {
        private LocalDate expiryDateInsurance;
        private final double cost;
        private final String insuranceNumber;

        public Insurance(LocalDate expiryDateInsurance, double cost, String insuranceNumber) {
            this.cost = cost;

            if (expiryDateInsurance == null) {
                expiryDateInsurance = LocalDate.now();
            } else {
                this.expiryDateInsurance = expiryDateInsurance;
            }
            if (insuranceNumber == null) {
                this.insuranceNumber = "123456789";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

            public Insurance() {
                this(null, 10_000, null);
            }

            public LocalDate getExpiryDateInsurance() {
                return expiryDateInsurance;
            }

            public double getCost() {
                return cost;
            }

            public String getInsuranceNumber() {
                return insuranceNumber;
            }

            public void checkDate() {
                if (expiryDateInsurance.isBefore(LocalDate.now()) || expiryDateInsurance.isEqual(LocalDate.now())) {
                    System.out.println("Нужно срочно ехать оформлять новую страховку");

                }
            }

            public void checkNumber() {
                if (insuranceNumber.length() != 9) {
                    System.out.println("Номер страховки некорректный!");
                }

            }

        }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", bodyColor='" + bodyColor + '\'' +
                ", productionYear=" + productionYear +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numberSeats=" + numberSeats +
                ", transmission='" + transmission + '\'' +
                ", numberRegistration='" + numberRegistration + '\'' +
                ", signSumOrWinTires=" + signSumOrWinTires +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }
}
