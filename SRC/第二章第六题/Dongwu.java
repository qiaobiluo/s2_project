package 第二章第六题;

public class Dongwu {
    String name;
    String sx;
    public void js(){
        System.out.println("我叫"+this.name+",是一只"+this.sx+"!");
    }
    public static void main(String[] args) {
        Ji ji=new Ji("喔喔","芦花鸡");
        ji.mehod();
        Ya ya=new Ya("嘎嘎","斑嘴鸭");
        ya.mehodOne();
    }
}
