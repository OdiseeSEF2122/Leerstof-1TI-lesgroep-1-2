package be.odisee.huiswerk4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaarRekeningTest {

    @Test
    public void Ctor_TwiceWithDifferentNumber(){
        // Arrange
        SpaarRekening sp1 = new SpaarRekening(0.01);
        SpaarRekening sp2 = new SpaarRekening(0.02);

        // Act

        // Assert
        assertNotEquals(sp1.getAccountNumber(), sp2.getAccountNumber());
    }

    @Test
    void deposit_WithPositiveAmount_BalanceIncreased() {
        // Arrange
        SpaarRekening sp1 = new SpaarRekening(0.01);
        double amount = 10;

        // Act
        sp1.deposit(amount);

        // Assert
        assertEquals(amount, sp1.getBalance());
    }

    @Test
    void deposit_WithNegativeAmount_BalanceNotIncreased() {
        // Arrange
        SpaarRekening sp1 = new SpaarRekening(0.01);
        double amount = -10;

        // Act
        sp1.deposit(amount);

        // Assert
        assertEquals(0, sp1.getBalance());
    }

    @Test
    void withdraw_WithPositiveAmountLessThanBalance_BalanceDecreased() {
        // Arrange
        SpaarRekening sp1 = new SpaarRekening(0.01);
        double amount = 10;
        sp1.deposit(amount);

        // Act
        sp1.withdraw(amount);

        // Assert
        assertEquals(0, sp1.getBalance());
    }

    @Test
    void withdraw_WithPositiveAmountLargerThanBalance_BalanceNotDecreased() {
        // Arrange
        SpaarRekening sp1 = new SpaarRekening(0.01);
        double amount = 10;
        sp1.deposit(amount);

        // Act
        sp1.withdraw(2*amount);

        // Assert
        assertEquals(amount, sp1.getBalance());
    }

    @Test
    void withdraw_WithNegativeAmount_BalanceNotDecreased() {
        // Arrange
        SpaarRekening sp1 = new SpaarRekening(0.01);
        double amount = 10;
        sp1.deposit(amount);

        // Act
        sp1.withdraw(-amount);

        // Assert
        assertEquals(amount, sp1.getBalance());
    }

    @Test
    void addInterest_WithPositiveBalance_BalanceIncreased() {
        // Arrange
        double interest = 0.01;
        SpaarRekening sp1 = new SpaarRekening(interest);
        double amount = 100;
        sp1.deposit(amount);

        // Act
        sp1.update();

        // Assert
        assertEquals(amount * (1+0.01), sp1.getBalance());
    }
}