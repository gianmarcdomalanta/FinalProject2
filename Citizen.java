public class Citizen {
    private String fullName;
    private String email;
    private String address;
    private int age;
    private boolean resident;
    private int district;
    private char gender;

    public Citizen (String fname, String lName, String email, String address, int age, boolean isResident, int district, char gender){
        this.fullName = fname + " " + lName;
        this.email = email;
        this.address = address;
        this.age = age;
        this.resident = isResident;
        this.district = district;
        this.gender = gender;
    }

    public String getFullName(String fullName){
        return fullName;
    }
    public String getEmail(String email){
        return email;
    }
    public String getAddress(String address){
        return address;
    }
    public int getAge() {
        return age;
    }
    public boolean isResident() {
        return resident;
    }
    public int getDistrict() {
        return district;
    }
    public char getGender() {
        return gender;
    }
    public boolean setResident(boolean isResident){
        return isResident;
    }
    public void setAddress(String address){
        this.address = address.replace("\"","");
    }
    public void setFullName(String fName, String lName){
        this.fullName = fName + " " + lName;
    }
    public void setGender(char gender){
        if (gender == 'M') {
            this.gender = 'M';
        }else {
            this.gender = 'F';
        }
    }
}
