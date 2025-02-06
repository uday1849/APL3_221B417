class Test implements Testable {
    public void display() {
        System.out.println("this is for chcking  interface");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
