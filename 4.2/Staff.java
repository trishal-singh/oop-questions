public class Staff extends Person {
    private String school;
    private double pay;
    Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool(){
        return school;
    }

    public double getPay(){
        return pay;
    }
    
    public void setPay(double pay){
        this.pay = pay;
    }

    @Override
    public String toString(){
        return "Staff[Person[name="+super.getName()+", address="+super.getAdress()+"], school="+school+", pay="+pay+"]";
    }
}