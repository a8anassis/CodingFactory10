package gr.aueb.cf.ch18.bankapp.validation;

import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;

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
}
