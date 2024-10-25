package org.vardhaman.workshop;

public class Helloworld {
    private String name;

    public Helloworld(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Helloworld str = new Helloworld("Rama");
        System.out.println(str.name);
    }

    @Override
    public String toString() {
        return "Helloworld{" +
                "name='" + name + '\'' +
                '}';
    }
}
