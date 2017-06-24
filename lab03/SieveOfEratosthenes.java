public class SieveOfEratosthenes {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("You need to enter an argument!");
        }
        int upperBound = Integer.parseInt(args[0]);
        boolean[] isNotPrime = new boolean[upperBound + 1];
        isNotPrime[2] = isNotPrime[3] = false;
        for (int i = 2; i <= upperBound; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * 2; j <= upperBound; j += i) {
                    isNotPrime[j] = true;
                }
            }
            if (!isNotPrime[i]) {
                System.out.println(i + "is a prime number.");
            }
        }
    }
}