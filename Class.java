/**
 * Created by Jathu on 3/2/2017.
 */
public class Class {
    public static void main(String[] args) {
        System.out.println("hello world");
        Person p = new Person();
        p.setAge(34);
        System.out.println(p.getAge());
    }
        public Person saveperson(Person p) {
            if (p==null){
                throw new IllegalArgumentException();

            }
            else{
                p.setName("JAN");
                return p;
            }
        }


}
