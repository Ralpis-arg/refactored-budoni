public class Client {

    // A client has attributes

    private String name;
    private String surName;
    private String phoneNumber;

    public Client(String name , String surName , String phoneNumber){
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
