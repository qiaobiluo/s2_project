public class Dog extends Test{
    public Dog(){
        super();
        this.name="s";
    }
    public Dog(String name){
        super();
        this.name=name;
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.print();
    }
}
