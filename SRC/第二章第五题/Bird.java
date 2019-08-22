package 第二章第五题;

public class Bird extends Animal{
    public Bird(String color,int age){
        super.color=color;
        super.age=age;
    }

    public void print(){
        System.out.println("我是一只"+this.color+"的鸟！");
        System.out.println("今年"+this.age+"岁啦！\n");
    }
}
