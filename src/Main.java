public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;
        int bonusAmount = 20;
        int bonusMiles = (ticketPrice / bonusAmount);
        System.out.println("Количество начисленных миль за купленный билет " + bonusMiles);
    }
}