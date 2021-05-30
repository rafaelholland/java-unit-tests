package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.AccountFactory;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount(){

        Double amount = 200.0;
        Double expectedValue = 196.0;
        Account acc = AccountFactory.createEmptyAccount();
        acc.deposit(amount);

        Assertions.assertEquals(expectedValue, acc.getBalance());

    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount(){
        Double expectedValue = 100.0;
        Account acc = AccountFactory.createAccount(expectedValue);
        Double amount = -200.0;

        acc.deposit(amount);     

        Assertions.assertEquals(expectedValue, acc.getBalance());
    }

    @Test
    public void fullWithdrawShouldClearBalanceAndReturnFullBalance(){
        Double expectedValue = 0.0;
        Double initialBalance = 800.0;
        Account acc = AccountFactory.createAccount(initialBalance);
        double result = acc.fullWithdraw();

        Assertions.assertTrue(expectedValue.equals(acc.getBalance()));
        Assertions.assertTrue(result == initialBalance);
    }


}
