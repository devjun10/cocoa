package main.java.type;

public class Monster {
    private Long id;
    private String name;
    private int weight;

    public Monster(Long id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void eat(String food, int weight){
        System.out.println(food+"를 먹습니다.");
        this.weight += weight;
    }
}
