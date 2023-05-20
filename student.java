class Student {
    private String name;
    private char gender;
    private Student advisor;
    public Student(String name, char gender, Student advisor) {
        this.name = name;
        this.gender = gender;
        this.advisor = advisor;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public Student getAdvisor() {
        return advisor;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("John", 'M', null);
        Student advisor1 = new Student("Sarah", 'F', null);
        student1.advisor = advisor1;
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Gender: " + student1.getGender());
        System.out.println("Advisor Name: " + student1.getAdvisor().getName());
        System.out.println("Advisor Gender: " + student1.getAdvisor().getGender());
    }
}