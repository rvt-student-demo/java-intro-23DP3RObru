package lv.rvt;

public class Student {
    public String name;
    public String address;
    public int credits;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    
    
    public int study() {
        return this.credits += 1;
    }

    

    @Override
    public String toString() {
        return this.name + '\n' + ' ' + this.address + '\n' + "Study credits " + this.credits;
    }
}
