package students.denis_asipenka.lesson_14.level_3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {
    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }

    @Test
    public void weAreExpectingTransactionIn2011() {
        int year = 2011;
        List<Transaction> listResult = new ArrayList<>();
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        listResult.add(new Transaction(brian, 2011, 300));
        listResult.add(new Transaction(raoul, 2011, 400));
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> actualResult = transactionAnalysisService.transactionSearch(getTransactions(), year);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weAreExpectingTransactionIn2012() {
        int year = 2012;
        List<Transaction> listResult = new ArrayList<>();
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        listResult.add(new Transaction(raoul, 2012, 1000));
        listResult.add(new Transaction(mario, 2012, 710));
        listResult.add(new Transaction(mario, 2012, 700));
        listResult.add(new Transaction(alan, 2012, 950));
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> actualResult = transactionAnalysisService.transactionSearch(getTransactions(), year);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void expectSortingFromHighestToLowestValue() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> listResult = new ArrayList<>();
        listResult.add(new Transaction(raoul, 2012, 1000));
        listResult.add(new Transaction(alan, 2012, 950));
        listResult.add(new Transaction(mario, 2012, 710));
        listResult.add(new Transaction(mario, 2012, 700));
        listResult.add(new Transaction(raoul, 2011, 400));
        listResult.add(new Transaction(brian, 2011, 300));
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> actualResult = transactionAnalysisService.transactionSort(getTransactions());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectTransactionsFrom2011AndSortingFromSmallestToLargestByValue() {
        int year = 2012;
        List<Transaction> listResult = new ArrayList<>();
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        listResult.add(new Transaction(mario, 2012, 700));
        listResult.add(new Transaction(mario, 2012, 710));
        listResult.add(new Transaction(alan, 2012, 950));
        listResult.add(new Transaction(raoul, 2012, 1000));
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> actualResult = transactionAnalysisService.transactionSortAndSearch(getTransactions(), year);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectAllTheYearsWhenThereWereTransactions() {
        List<Integer> listResult = new ArrayList<>();
        listResult.add(2011);
        listResult.add(2012);
        listResult.add(2011);
        listResult.add(2012);
        listResult.add(2012);
        listResult.add(2012);
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Integer> actualResult = transactionAnalysisService.whenTheTransactionTookPlace(getTransactions());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectAllTheYearsWhenThereWereTransactionsNotDuplicate() {
        List<Integer> listResult = new ArrayList<>();
        listResult.add(2011);
        listResult.add(2012);
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Integer> actualResult = transactionAnalysisService.whenTheTransactionTookPlaceWillNotBeRepeated(getTransactions());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectAllTheNameNotDuplicate() {
        List<String> listResult = new ArrayList<>();
        listResult.add("Brian");
        listResult.add("Raoul");
        listResult.add("Mario");
        listResult.add("Alan");
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<String> actualResult = transactionAnalysisService.listOfAllTradersNameWithoutDuplicates(getTransactions());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weExpectAllTheCityNotDuplicate() {
        List<String> listResult = new ArrayList<>();
        listResult.add("Cambridge");
        listResult.add("Milan");
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<String> actualResult = transactionAnalysisService.listOfAllTradersCityWithoutDuplicates(getTransactions());
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weAreWaitingForAllTradersFromCambridge() {
        List<String> listResult = new ArrayList<>();
        listResult.add("Brian");
        listResult.add("Raoul");
        listResult.add("Alan");
        String city = "Cambridge";
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<String> actualResult = transactionAnalysisService.listOfTradersByCityAndName(getTransactions(), city);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weAreWaitingForAllTradersFromMilan() {
        List<String> listResult = new ArrayList<>();
        listResult.add("Mario");
        String city = "Milan";
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<String> actualResult = transactionAnalysisService.listOfTradersByCityAndName(getTransactions(), city);
        assertEquals(listResult, actualResult);
    }

    @Test
    public void weaAreExpectingOneTraderFromMilan() {
        String city = "Milan";
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        boolean actualResult = transactionAnalysisService.searchForTraderFromCity(getTransactions(), city);
        assertTrue(actualResult);
    }

    @Test
    public void weaAreExpectingOneTraderFromCambridge() {
        String city = "Cambridge";
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        boolean actualResult = transactionAnalysisService.searchForTraderFromCity(getTransactions(), city);
        assertTrue(actualResult);
    }

    @Test
    public void weExpectThatNoOneIsFromThisCity() {
        String city = "London";
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        boolean actualResult = transactionAnalysisService.searchForTraderFromCity(getTransactions(), city);
        assertFalse(actualResult);
    }

    @Test
    public void weExpect1000() {
        Optional<Integer> result = Optional.of(1000);
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Optional<Integer> actualResult = transactionAnalysisService.searchForMaximumTransaction(getTransactions());
        assertEquals(result, actualResult);

    }

    @Test
    public void weExpectEmpty() {
        Optional<Integer> result = Optional.empty();
        List<Transaction> emptyList = new ArrayList<>();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Optional<Integer> actualResult = transactionAnalysisService.searchForMaximumTransaction(emptyList);
        assertEquals(result, actualResult);
    }

    @Test
    public void weExpect300Min() {
        Optional<Integer> result = Optional.of(300);
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Optional<Integer> actualResult = transactionAnalysisService.searchForMinTransaction(getTransactions());
        assertEquals(result, actualResult);

    }

    @Test
    public void weExpectEmptyMin() {
        Optional<Integer> result = Optional.empty();
        List<Transaction> emptyList = new ArrayList<>();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Optional<Integer> actualResult = transactionAnalysisService.searchForMinTransaction(emptyList);
        assertEquals(result, actualResult);
    }

    @Test
    public void weExpectTradersSeparatedByCommas() {
        String result = "Alan,Brian,Mario,Mario,Raoul,Raoul";
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        String actualResult = transactionAnalysisService.searchingAndSortingTraders(getTransactions());
        assertEquals(result, actualResult);
    }

    @Test
    public void weExpectCitySeparatedByCommas() {
        String result = "Cambridge,Milan";
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        String actualResult = transactionAnalysisService.searchingAndSortingCity(getTransactions());
        assertEquals(result, actualResult);
    }
}