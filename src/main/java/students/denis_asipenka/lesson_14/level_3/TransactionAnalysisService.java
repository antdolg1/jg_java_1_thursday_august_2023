package students.denis_asipenka.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionAnalysisService {
    List<Transaction> transactionSearch(List<Transaction> transactionList, int year) {
        return transactionList.stream()
                .filter(transaction -> transaction.getYear() == year)
                .toList();
    }

    List<Transaction> transactionSort(List<Transaction> transactionList) {
        return transactionList.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .toList();
    }

    List<Transaction> transactionSortAndSearch(List<Transaction> transactionList, int year) {
        return transactionList.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
    }

    List<Integer> whenTheTransactionTookPlace(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(transaction -> transaction.getYear())
                .toList();
    }

    List<Integer> whenTheTransactionTookPlaceWillNotBeRepeated(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(transaction -> transaction.getYear())
                .distinct()
                .toList();
    }

    List<String> listOfAllTradersNameWithoutDuplicates(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .toList();
    }

    List<String> listOfAllTradersCityWithoutDuplicates(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();
    }

    List<String> listOfTradersByCityAndName(List<Transaction> transactionList, String city) {
        return transactionList.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .toList();
    }

    boolean searchForTraderFromCity(List<Transaction> transactionList, String city) {
        return transactionList.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    Optional<Integer> searchForMaximumTransaction(List<Transaction> transactionList) {
        return transactionList.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
    }

    Optional<Integer> searchForMinTransaction(List<Transaction> transactionList) {
        return transactionList.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue);
    }

    String searchingAndSortingTraders(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(","));
    }

    String searchingAndSortingCity(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }
}