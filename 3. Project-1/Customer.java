public class Customer {

    String Name;
    String CarNo;
    String CarType;

    public Customer(String name, String carNo, String carType) {
       this. Name = name;
        this.CarNo = carNo;
        this.CarType = carType;
    }

    public String getName() {
        return Name;
    }

    public String getCarNo() {
        return CarNo;
    }

    public String getCarType() {
        return CarType;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setCarNo(String carNo) {
        this.CarNo = carNo;
    }

    public void setCarType(String carType) {
       this.CarType = carType;
    }
}
