class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    // Sparrow can fly, so no violation
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        System.out.println("Ostriches can't fly, but they can run!");
    }
}