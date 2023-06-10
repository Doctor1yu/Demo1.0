package BasicInformation;

public class Information {
    private String id;//序号
    private String name;//姓名
    private String sex;//性别
    private String department;//部门
    private String position;//职务
    private double salary;//薪水
    private String phone;//电话


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