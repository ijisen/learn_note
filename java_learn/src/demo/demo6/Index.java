package demo.demo6;

public class Index {
    public static void main(String[] args) {
        Object o = new Object();
        Object object = new Object();

        System.out.println(o.equals(object));
        Doctor doctor = new Doctor("name", 25, "job", 1,50);
        Doctor doctor1 = new Doctor("name", 25, "job", 1,50);


        System.out.println(doctor.equals(doctor1));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private int gender;
    private double salary;

    public Doctor(String name, int age, String job, int gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof Doctor)) {
            return false;
        }
        // 向下转型
        Doctor newObj = (Doctor) obj;
        return (this.name.equals(newObj.name) &&
                this.age == newObj.age &&
                this.gender == newObj.gender &&
                this.job.equals(newObj.job) && this.salary == newObj.salary);
    }
}
