package be.odisee.huiswerk4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZichtRekeningTest {
    @Test
    public void Ctor_TwiceWithDifferentNumber(){
        // Arrange
        ZichtRekening sp1 = new ZichtRekening(0.01);
        ZichtRekening sp2 = new ZichtRekening(0.02);

        // Act

        // Assert
        assertNotEquals(sp1.getAccountNumber(), sp2.getAccountNumber());
    }

    @Test
    void deposit_WithPositiveAmount_BalanceIncreased() {
        // Arrange
        ZichtRekening sp1 = new ZichtRekening(0.01);
        double amount = 10;

        // Act
        sp1.deposit(amount);

        // Assert
        assertEquals(amount, sp1.getBalance());
    }

    @Test
    void deposit_WithNegativeAmount_BalanceNotIncreased() {
        // Arrange
        ZichtRekening sp1 = new ZichtRekening(0.01);
        double amount = -10;

        // Act
        sp1.deposit(amount);

        // Assert
        assertEquals(0, sp1.getBalance());
    }

    @Test
    void withdraw_WithPositiveAmount_BalanceDecreased() {
        // Arrange
        ZichtRekening sp1 = new ZichtRekening(10);
        double amount = 10;
        sp1.deposit(0);

        // Act
        sp1.withdraw(amount);

        // Assert
        assertEquals(-amount, sp1.getBalance());
    }

    @Test
    void withdraw_WithNegativeAmount_BalanceNotDecreased() {
        // Arrange
        ZichtRekening sp1 = new ZichtRekening(10);
        double amount = 10;
        sp1.deposit(amount);

        // Act
        sp1.withdraw(-amount);

        // Assert
        assertEquals(amount, sp1.getBalance());
    }


}