package com.sha.springbootmicroservice3gateway.service;

import com.google.gson.JsonElement;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ITransactionService {
    JsonElement saveTransaction(@RequestBody JsonElement requestBody);

    void deleteTransaction(Long transactionId);

    List<JsonElement> getAllTransactionsOfUser(Long userId);
}
