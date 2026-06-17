package gr.aueb.cf.ch18.bankapp.validation;

import gr.aueb.cf.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.ch18.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.ch18.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    /**
     * No instances of this class should be available.
     */
    private Validator() {}

    public static Map<String, String> validateInsertDTO(AccountInsertDTO insertDTO) {
        Map<String , String> errors = new HashMap<>();

        if (insertDTO.iban() == null || !insertDTO.iban().trim().matches("GR\\d{5,10}")) {
            errors.put("iban", "Το IBAN πρέπει να ξεκινάει με GR και να ακολουθείται από 5-10 ψηφία.");
        }

        if (insertDTO.balance() == null || insertDTO.balance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το υπόλοιπο δεν μπορεί να είναι null ή αρνητικό");
        }

        return errors;
    }

    public static Map<String, String> validateDepositDTO(AccountDepositDTO depositDTO) {
        Map<String , String> errors = new HashMap<>();

        if (depositDTO.iban() == null || !depositDTO.iban().trim().matches("GR\\d{5,10}")) {
            errors.put("iban", "Το IBAN πρέπει να ξεκινάει με GR και να ακολουθείται από 5-10 ψηφία.");
        }

        if (depositDTO.amount() == null || depositDTO.amount().compareTo(BigDecimal.ZERO) <= 0) {
            errors.put("amount", "Το ποσό κατάθεσης δεν μπορεί να είναι null ή αρνητικό");
        }

        return errors;
    }

    public static Map<String, String> validateWithdrawDTO(AccountWithdrawDTO withdrawDTO, BigDecimal balance) throws AccountNotFoundException {
        Map<String , String> errors = new HashMap<>();

        if (withdrawDTO.iban() == null || !withdrawDTO.iban().trim().matches("GR\\d{5,10}")) {
            errors.put("iban", "Το IBAN πρέπει να ξεκινάει με GR και να ακολουθείται από 5-10 ψηφία.");
        }

//        if (withdrawDTO.amount() == null || withdrawDTO.amount().compareTo(balance) > 0 ) {
//            errors.put("amount", "Το υπόλοιπο δεν επαρκεί.");
//        }

        return errors;
    }

    // TODO: Check if balance is not sufficient for withdrawal


}
