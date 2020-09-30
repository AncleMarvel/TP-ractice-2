public class Fibonacci {
    public int lengthSequence;

    public Fibonacci(int lengthSequence) {
        this.lengthSequence = lengthSequence;
    }

    public int getN(int n){ // Получить n-й член последовательности Фибоначчи
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else{
            return getN(n - 1) + getN(n - 2);
        }
    }

    public int[] generateSequence() { // Генерация последовательности Фибоначчи
        int fiboSequence[] = new int[this.lengthSequence];

        for(int i = 0; i < this.lengthSequence; i++) {
            fiboSequence[i] = this.getN(i + 1);
        }
        return fiboSequence;
    }

    public void showSequence(int[] sequence) { // Визуализация последовательности (списка, причем, любого размера)
        System.out.print("[");
        for(int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i]);
            if (i != sequence.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
