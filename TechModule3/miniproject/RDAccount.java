class RDAccount extends Account {

    int months;
    int age;
    double monthlyAmount;

    RDAccount(double monthlyAmount, int months, int age) {
        this.monthlyAmount = monthlyAmount;
        this.months = months;
        this.age = age;
    }

    @Override
    double calculateInterest() throws InvalidInputException {

        if (monthlyAmount < 0)
            throw new InvalidInputException("Invalid Amount.");

        if (months < 0)
            throw new InvalidInputException("Invalid Months.");

        if (age < 0)
            throw new InvalidInputException("Invalid Age.");

        switch (months) {

            case 6:
                interestRate = (age >= 60) ? 8.0 : 7.5;
                break;

            case 9:
                interestRate = (age >= 60) ? 8.25 : 7.75;
                break;

            case 12:
                interestRate = (age >= 60) ? 8.5 : 8.0;
                break;

            case 15:
                interestRate = (age >= 60) ? 8.75 : 8.25;
                break;

            case 18:
                interestRate = (age >= 60) ? 9.0 : 8.5;
                break;

            case 21:
                interestRate = (age >= 60) ? 9.25 : 8.75;
                break;

            default:
                throw new InvalidInputException("Invalid Months.");
        }

        return (monthlyAmount * months) * interestRate / 100;
    }
}