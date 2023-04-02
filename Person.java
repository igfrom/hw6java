import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private String gender;
    Person(String personName, String personSurname, Integer personAge, String personGender){
        name = personName;
        surname = personSurname;
        age = personAge;
        gender = personGender;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Integer getAge(){
        return age;
    }

    public String getSex(){
        return gender;
    }

    public String toString(){
        return "[Имя: " + name + ", Фамилия: " + surname + ", Возраст:" + age + ", Пол: " + gender + "]";
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && surname == anotherPerson.surname && age == anotherPerson.age && gender == anotherPerson.gender;
    }

    public int hashCode(){
        return Objects.hash(name, surname, age, gender);
    }

    public String fullName(){
        return "[Имя: " + name + ", Фамилия: " + surname + "]";
    } 
}

