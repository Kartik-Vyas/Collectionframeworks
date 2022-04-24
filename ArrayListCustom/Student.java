package ArrayListCustom;


import java.util.Objects;

class Student implements Comparable<Student> {
    String name;
    int rollNo;
    public Student(String name,int rollNo)
    {
        this.name= name;
        this.rollNo= rollNo;
    }
    @Override
    public String toString()
    {
        return "Name-" + name + " rollNo-" + rollNo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo-that.rollNo;
    }
}
