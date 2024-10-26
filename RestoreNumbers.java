class RestoreNumbers {
    public static void main(String[] args) {
        int swappedA = 20;
        int swappedB = 10;

        int originalA = swappedA + swappedB;
        int originalB = originalA - swappedB;

        System.out.println("Restored values:");
        System.out.println("Original a = " + originalA);
        System.out.println("Original b = " + originalB);
    }
}