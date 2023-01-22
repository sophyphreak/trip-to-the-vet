package HW06;

public class Dog extends Pet {
    private double droolRate;
    
    public Dog(String name, double health, int painLevel, double droolRate) {
        super(name, health, painLevel);
        if (droolRate <= 0) {
            this.droolRate = .5;
        } else {
            this.droolRate = droolRate;
        }
    }
    public Dog(String name, double health, int painLevel) {
        this(name, health, painLevel, 5.0);
    }

    public double getDroolRate() {
        return this.droolRate;
    }

    public int treat() {
        this.heal();
        if (this.droolRate < 3.5) {
            return (int)Math.ceil((this.getPainLevel() * 2) / this.getHealth());
        }
        if (this.droolRate <= 7.5) {
            return (int)Math.ceil(this.getPainLevel() / this.getHealth());
        }
        return (int)Math.ceil(this.getPainLevel() / (this.getHealth() / 2));
    }

    public void speak() {
        super.speak();
        String bark = "";
        for (int i = 0; i < this.getPainLevel(); i++) {
            bark += "bark ";
        }
        bark = bark.trim();
        if (this.getPainLevel() < 6) {
            System.out.println(bark);
        } else {
            System.out.println(bark.toUpperCase());
        }
    }
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog d = (Dog)o;
        if (!super.equals(d)) {
            return false;
        }
        return this.getDroolRate() == d.getDroolRate();
    }
}
