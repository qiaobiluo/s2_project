package 第二章第五题;

class Fish extends Animal {
    public Fish(int weight,int age){
        super.weight=weight;
        super.age=age;
    }

    public void add(){
        System.out.println("我是一只"+this.weight+"斤重的鱼！");
        System.out.println("今年"+this.age+"岁啦！\n");
    }
}


