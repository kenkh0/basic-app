package com.p113.d4_polymorphic_test;

public class Computer {
    private String name;

    public  void start(){
        System.out.println(name+"start");
    }

    public void installUSB(USB u){
        u.connect();
        if(u instanceof KeyBoard){
            KeyBoard k= (KeyBoard) u;
            k.keyDown();
            k.disconnect();

        }else if(u instanceof Mouse){
            Mouse m= (Mouse) u;
            m.dbClick();
            m.disconnect();
        }

    }
    public void unstallUSB(USB u){
        u.disconnect();
    }
    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
