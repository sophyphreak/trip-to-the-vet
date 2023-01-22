package HW06;

public abstract class Pet {
    private String name;
    private double health;
    private int painLevel;

    public Pet(String name, double health, int painLevel){
        this.name = name;

        if (health < 0) {
            this.health = 0;
        } else if (health > 1) {
            this.health = 1;
        } else {
            this.health = health;
        }
        if (painLevel < 1) {
            this.painLevel = 1;
        } else if (painLevel > 10) {
            this.painLevel = 10;
        } else {
            this.painLevel = painLevel;
        }
    }
    public String getName() {
        return this.name;
    }
    public double getHealth() {
        return this.health;
    }
    public int getPainLevel() {
        return this.painLevel;
    }
    public abstract int treat();
    public void speak() {
        String m = "Hello! My name is " + this.name;
        if (this.health > 5) {
            System.out.println(m.toUpperCase());
        } else {
            System.out.println(m);
        }
    }
    public boolean equals(Object o) {
        if (!(o instanceof Pet)) {
            return false;
        }
        Pet p = (Pet)o;
        return p.name == this.name;
    }
    protected void heal() {
        this.health = 1.0;
        this.painLevel = 1;
    }
}
