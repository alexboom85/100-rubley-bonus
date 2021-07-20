class Main {
        public static void main(String[] args) {
        int amout = 500;
        int popolnenie = 1100;
        int bonus = 0;

        if (popolnenie > 1000) {
                bonus = popolnenie / 100;
        } else {
                int i = bonus = 0;
        }
        System.out.println(bonus);
        amout = amout + popolnenie + bonus;
                System.out.println(amout);
    }
}