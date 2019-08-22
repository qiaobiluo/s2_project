package 第二章第五题;

public class Animal {
    int age;
    int weight;
    String color;
    public void info(){

    }

    public static void main(String[] args) {
        Bird bird=new Bird("红色",3);
        bird.print();
        Fish fish=new Fish(5,4);
        fish.add();
    }
}
