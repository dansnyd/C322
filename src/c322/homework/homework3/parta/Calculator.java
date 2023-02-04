package c322.homework.homework3.parta;

public interface Calculator {
    double compute();
}

class Addition implements Calculator {
    private final double x;
    private final double y;

    public Addition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute() {
        return x + y;
        }
    }

    class Subtraction implements Calculator {
        private final double x;
        private final double y;

        public Subtraction(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public double compute() {
            return x - y;
        }
    }

    class Multiplication implements Calculator {
        private final double x;
        private final double y;

        public Multiplication(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public double compute() {
            return x * y;
        }
    }

    class Divide implements Calculator {
        private final double x;
        private final double y;

        public Divide(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public double compute() {
            return x / y;
        }
    }

