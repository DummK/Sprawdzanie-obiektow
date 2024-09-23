class Person{
    String name;
    double age;
    double height;

    public Person(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void Validation(){
        if(age >=30 && height > 160) {
            System.out.println(name + " ma więcej niż 30 lat i jest wyższy niż 160cm");
        }
        else {
           System.out.println(name + " jest młodszy niż 30 lat lub ma mniej niż 160cm wzrostu");
        }
    }
}

public class Application{
    public static void main(String[] args) {
        Person Adam = new Person("Adam", 18, 210);
        Adam.Validation();

        Person Mateusz = new Person("Mateusz", 31, 170);
        Mateusz.Validation();
    }
}