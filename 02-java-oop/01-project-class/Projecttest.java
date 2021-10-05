public class Projecttest {
    public static void main(String[] args) {
        Project tester=new Project();
        tester.setname("Jaskaran");
        tester.setdescription("Programming Hub");
        System.out.println(tester.eleveatorPitch());
        Project tester2=new Project("karan","Tour and Travel");
        System.out.println(tester2.eleveatorPitch());
    }
}
