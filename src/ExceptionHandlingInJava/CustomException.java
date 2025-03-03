package ExceptionHandlingInJava;

public class CustomException {
    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails();

        studentDetails.setName("Ch");
        studentDetails.setAge(17);
        studentDetails.setMark(0);

        String studentName = studentDetails.getName();
        int studentAge = studentDetails.getAge();
        float studentMark = studentDetails.getMark();

        try {
            if (studentName.length() < 3) {
                throw new ValidNameException("Name should be at least 3 characters");
            }
            if (studentAge < 18) {
                throw new ValidAgeException("Age should be greater than or equal to 18");
            }
            if (studentMark == 0) {
                throw new ValidMarkException("Mark shouldn't be zero");
            }
            System.out.println("Student details are valid.");
        } catch (ValidNameException | ValidAgeException | ValidMarkException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


class StudentDetails {
    private String name;
    private int age;
    private float mark;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setMark(float mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getMark() {
        return mark;
    }
}

class ValidNameException extends Exception {
    public ValidNameException(String message) {
        super(message);
    }
}

class ValidAgeException extends Exception {
    public ValidAgeException(String message) {
        super(message);
    }
}

class ValidMarkException extends Exception {
    public ValidMarkException(String message) {
        super(message);
    }
}
