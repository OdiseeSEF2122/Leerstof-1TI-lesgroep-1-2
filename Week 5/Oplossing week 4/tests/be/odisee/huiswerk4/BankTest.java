package be.odisee.huiswerk4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private SpaarRekening spRekening, spRekening2, spRekening3;
    private ZichtRekening ziRekening, ziRekening2;
    private Bank bank;

    @BeforeEach
    public void setup(){
        // Spaarrekeningen
        spRekening = new SpaarRekening(0.0011);
        spRekening2 = new SpaarRekening(1);
        spRekening3 = new SpaarRekening(0.10);

        // ZichtRekening
        ziRekening = new ZichtRekening(10);
        ziRekening2 = new ZichtRekening(100);

        // setup balances
        spRekening.deposit(100);
        spRekening2.deposit(0);
        spRekening3.deposit(100);
        ziRekening.withdraw(50);
        ziRekening2.withdraw(50);

        bank = new Bank();

        bank.openAccount(spRekening);
        bank.openAccount(spRekening2);
        bank.openAccount(spRekening3);
        bank.openAccount(ziRekening);
        bank.openAccount(ziRekening2);
    }

    @Test
    void numAccounts_OnlySetup_Returns5(){
        // Arrange

        // Act
        int amount = bank.numAccounts();

        // Assert
        assertEquals(5, amount);
    }

    @Test
    void openAccount_AccountNotExistsYet_IsAdded() {
        // Arrange
        SpaarRekening newRekening = new SpaarRekening(0.0011);

        // Act
        bank.openAccount(newRekening);

        // Assert
        assertTrue(bank.accountExists(newRekening));
    }

    @Test
    void openAccount_AccountExistsAlready_NotAdded() {
        // Arrange

        // Act
        bank.openAccount(spRekening);

        // Assert
        assertTrue(bank.accountExists(spRekening));
        assertEquals(5, bank.numAccounts());
    }

    @Test
    void closeAccount_AccountDoesNotExist_NothingHappened() {
        // Arrange
        SpaarRekening newRekening = new SpaarRekening(0.0011);

        // Act
        bank.closeAccount(newRekening);

        // Assert
        assertFalse(bank.accountExists(newRekening));
        assertEquals(5, bank.numAccounts());
    }

    @Test
    void closeAccount_AccountExists_AccountClosed() {
        // Arrange

        // Act
        bank.closeAccount(spRekening);

        // Assert
        assertFalse(bank.accountExists(spRekening));
        assertEquals(4, bank.numAccounts());
    }

    @Test
    void update() {
        // Arrange

        // Act
        bank.update();

        // Assert
        assertEquals(100.11, spRekening.getBalance(), 0.01);
        assertEquals(0, spRekening2.getBalance(), 0.01);
        assertEquals(110, spRekening3.getBalance(), 0.01);
    }
}