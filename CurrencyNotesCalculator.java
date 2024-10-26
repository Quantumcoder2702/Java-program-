public class CurrencyNotesCalculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CurrencyNotesCalculator <amount>");
            return;
        }

        try {
            int amount = Integer.parseInt(args[0]);

            int note2000 = amount / 2000;
            amount %= 2000;

            int note500 = amount / 500;
            amount %= 500;

            int note200 = amount / 200;
            amount %= 200;

            int note100 = amount / 100;
            amount %= 100;

            int note50 = amount / 50;
            amount %= 50;

            int note20 = amount / 20;
            amount %= 20;

            int note10 = amount / 10;
            amount %= 10;

            int note5 = amount / 5;
            amount %= 5;

            int note2 = amount / 2;
            int note1 = amount % 2;

            System.out.println("Denominations needed:");
            System.out.println("₹2000 notes: " + note2000);
            System.out.println("₹500 notes: " + note500);
            System.out.println("₹200 notes: " + note200);
            System.out.println("₹100 notes: " + note100);
            System.out.println("₹50 notes: " + note50);
            System.out.println("₹20 notes: " + note20);
            System.out.println("₹10 notes: " + note10);
            System.out.println("₹5 notes: " + note5);
            System.out.println("₹2 coins: " + note2);
            System.out.println("₹1 coins: " + note1);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer amount.");
        }
    }
}
