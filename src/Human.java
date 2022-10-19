public class Human {
    int age;
    String name;
    private String town;
    String post;
    private int yearOfBirth;

    public int getYearOfBirth() {
        int year = 2022;
        return  year-age;
    }

    public Human(String name, String town, int age, String post) {
        this.name = name;
        this.town = town;
        this.age =  age;
        this.post = post;
        this.yearOfBirth = yearOfBirth;

        if (yearOfBirth >=0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (name==null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town==null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (post==null) {
            this.post = "Информация не указана";
        } else {
            this.post = post;
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


}
