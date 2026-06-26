class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Emp emp = new Emp();
            emp.getDetails();

        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}