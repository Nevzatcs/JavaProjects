public class Vehicle implements Comparable<Vehicle>{
    public String driverName;
    public String vehicleType;
    public int priorityOfWay;

    public Vehicle(String driverName,String vehicleType){
        this.driverName = driverName;
        this.vehicleType= vehicleType;
        if(vehicleType.equals("Kargo")){
            this.priorityOfWay=1;
        }
        else if(vehicleType.equals("Polis")){
            this.priorityOfWay=2;
        }
        else if(vehicleType.equals("Itfaiye")){
            this.priorityOfWay=3;
        }
        else if(vehicleType.equals("Ambulans")){
            this.priorityOfWay=4;
        }
        else {
            this.priorityOfWay=0;

        }
    }

    @Override
    public int compareTo(Vehicle v) {
        if(this.priorityOfWay<v.priorityOfWay){
            return 2;
        }
        else if(this.priorityOfWay>v.priorityOfWay){
            return -2;
        }
        return 0;

    }

    @Override
    public String toString() {
        String vehicleInfo="Sürücü Adı: "+driverName+
                "\nAraç Türü: "+vehicleType;
        return vehicleInfo;
    }

}
