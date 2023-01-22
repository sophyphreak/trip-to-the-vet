package HW06;

public class Cat extends Pet {
    private int miceCaught;
    public Cat(String name, double health, int painLevel, int miceCaught) {
        super(name, health, painLevel);
        this.miceCaught = miceCaught >= 0 ? miceCaught : 0;
    }
    public Cat(String name, double health, int painLevel) {
        this(name, health, painLevel, 0);
    }
    public int getMiceCaught() {
        return this.miceCaught;
    }
    public int treat() {
        this.heal();
        if (this.miceCaught < 4) {
            return (int)Math.ceil((this.getPainLevel() * 2) / this.getHealth());
        }
        if (this.miceCaught <= 8) {
            return (int)Math.ceil(this.getPainLevel() / this.getHealth());
        }
        return (int)Math.ceil(this.getPainLevel() / (this.getHealth() / 2));
    }
    public void speak() {
        super.speak();
        String meow = "";
        for (int i = 0; i < this.getPainLevel(); i++) {
            meow += "meow ";
        }
        meow = meow.trim();
        if (this.getPainLevel() < 6) {
            System.out.println(meow);
        } else {
            System.out.println(meow.toUpperCase());
        }
    }
    public boolean equals(Object o) {
        if (!(o instanceof Cat)) {
            return false;
        }
        Cat c = (Cat)o;
        if (!super.equals(c)) {
            return false;
        }
        return this.getMiceCaught() == c.getMiceCaught();
    }
}
