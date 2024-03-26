

class Tree {
    protected double height;
    protected double width;
    public Tree(double trunk1) {
        this(trunk1, trunk1);
    }
    public Tree(double h, double width) {
        height = h;
        this.width = width;
    }



    public double calculateCanopy() {
        return height * width;
    }

    public void showDetails() {
        System.out.println("Tree:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Canopy Area: " + calculateCanopy());

    }
}

class Oak extends Tree {
    public Oak(double trunk) {
        super(trunk);
    }

    public Oak(double height, double width) {
        super(height, width);
    }

    public double calculateRootSpread() {
        return 0.75 * (height + width);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Root Spread: " + calculateRootSpread());
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree(5, 3);

        Oak oakTree = new Oak(4);

        Oak OakTree1 = new Oak(8, 3);

        Tree Tree1 = new Oak(6);

        tree.showDetails();
        oakTree.showDetails();
        OakTree1.showDetails();
        Tree1.showDetails();
    }
}