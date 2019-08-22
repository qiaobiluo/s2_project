package 第二章第六题;

public class Ya extends Dongwu{
    public Ya(String name,String sx){
        super.name=name;
        super.sx=sx;
    }
    public void mehodOne(){
        super.js();
        System.out.println("我喜欢吃小鱼虾！");
        System.out.println("我会游泳！");
    }
}
