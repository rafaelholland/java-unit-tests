package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void entryShouldReturnTwentyPercentOfTotalAmount(){
        Financing f = new Financing(100000.00, 2000.00, 80);
        Double expectedValue = 20000.0;

        Double result = f.entry();

        Assertions.assertEquals(expectedValue, result);

    }

    @Test
    public void quotaShouldReturnCorrectQuotaValue(){
        Financing f = new Financing(100000.00, 2000.00, 80);
        Double expectedValue = 1000.00;

        Double result = f.quota();

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void constructorShouldSetValuesWhenValidData(){
        Financing f = new Financing(100000.00, 2000.00, 80);


        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.00, 2000.00, 79);
        });
    }

    @Test
    public void setTotalAmoungShouldSetValuesWhenValidData(){
        Financing f = new Financing(100000.00, 2000.00, 80);

        f.setTotalAmount(90000.00);

        Assertions.assertEquals(90000.0, f.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.00, 2000.00, 80);
            f.setTotalAmount(110000.00);

        });
    }


    @Test
    public void setIncomeShouldSetValuesWhenValidData(){
        Financing f = new Financing(100000.00, 2000.00, 80);
        f.setIncome(3000.00);

        Assertions.assertEquals(3000.00, f.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.00, 2000.00, 80);
            f.setIncome(1500.00);
        });
    }

    @Test
    public void setMonthsShouldSetValuesWhenValidData(){
        Financing f = new Financing(100000.00, 2000.00, 80);
        f.setMonths(81);

        Assertions.assertEquals(81, f.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.00, 2000.00, 80);
            f.setMonths(79);
        });
    }







}
