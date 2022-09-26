package hw2;

public class Task2 {
    public static void main(String[] args) {

        // Дан номер месяца, например int month = 5. В зависимости от данного значения вывести в консоль время года
        int Month = 5;
        if ( Month == 5 ) {
            System.out.println("Month is May");
        } else if ( Month != 5 ) {
            System.out.println("Month is not May");
        }

        // Дана переменная sum - сумма покупки и переменна saleCode - номер купона.
        // Если номер купона равен 4525 - вывести сумму с учетом скидки 30%
        // Если номер купона равен 6424 или 7012 - вывести сумму с учетом скидки 20%
        // Если номер купона равен 7647 или 9011 или 6612 - вывести сумму с учетом скидки 10%
        // В остальных случаях скидка не предусмотрена, вывесть полную стоимость покупки.

        int sum = 1000;
        int ticket = 777;
        switch ( ticket ) {
            case 4525:
                System.out.println("700");
                break;
            case 6424:
            case 7012:
                System.out.println("800");
                break;
            case 7647:
            case 9011:
            case 6612:
                System.out.println("900");
                break;
            default:
                System.out.println("1000");
        }

        //Дана целочисленная переменная count - количество верных ответов.
        // В зависимости от значения этой переменной вывести в консоль оценку:
        // 100 - 90 правильных ответов - отлично
        // 89 - 60 правильных ответов - хорошо
        // 59 - 40 правильных ответов - удовлетворительно
        // 39 - 0 правильных ответов - попробуйте в следующий раз

        int count = 1;
        if ( count > 90 )
        if ( count < 100)
            System.out.println("Perfect");
        if ( count > 60 )
        if ( count < 89 )
            System.out.println("Good");
        if ( count > 40 )
        if ( count < 59 )
            System.out.println("Satisfactory");
        if ( count > 0 )
        if ( count < 39 )
            System.out.println("Try_Again_Later");

    }
}
