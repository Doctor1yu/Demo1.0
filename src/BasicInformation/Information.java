package BasicInformation;

public class Information {
    private String id;//���
    private String name;//����
    private String sex;//�Ա�
    private String department;//����
    private String position;//ְ��
    private double salary;//нˮ
    private String phone;//�绰


    public Information(String id, String name, String sex, String department, String position, double salary, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.phone = phone;
    }

    public Information() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex() {
        this.sex = sex;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }}