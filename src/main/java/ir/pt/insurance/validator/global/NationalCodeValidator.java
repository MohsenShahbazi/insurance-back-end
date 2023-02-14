package ir.pt.insurance.global;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Pasha.Gharibi on 12/26/2015.
 */

public class NationalCodeValidator implements ConstraintValidator<NationalCode, String> {
    @Override
    public void initialize(NationalCode nationalCode) {

    }

    @Override
    public boolean isValid(String nationalCode, ConstraintValidatorContext constraintValidatorContext) {


        if (nationalCode == null || nationalCode.isEmpty()) {
            return true;
        }
        if (nationalCode.length() == 10) {
            if (nationalCode.equals("1111111111") ||
                    nationalCode.equals("0000000000") ||
                    nationalCode.equals("2222222222") ||
                    nationalCode.equals("3333333333") ||
                    nationalCode.equals("4444444444") ||
                    nationalCode.equals("5555555555") ||
                    nationalCode.equals("6666666666") ||
                    nationalCode.equals("7777777777") ||
                    nationalCode.equals("8888888888") ||
                    nationalCode.equals("9999999999")) {
                return false;
            }
            int c = (nationalCode.charAt(9) - 48);
            int n = (nationalCode.charAt(0) - 48) * 10 +
                    (nationalCode.charAt(1) - 48) * 9 +
                    (nationalCode.charAt(2) - 48) * 8 +
                    (nationalCode.charAt(3) - 48) * 7 +
                    (nationalCode.charAt(4) - 48) * 6 +
                    (nationalCode.charAt(5) - 48) * 5 +
                    (nationalCode.charAt(6) - 48) * 4 +
                    (nationalCode.charAt(7) - 48) * 3 +
                    (nationalCode.charAt(8) - 48) * 2;
            int r = n - (n / 11) * 11;
            if ((r == 0 && r == c) || (r == 1 && c == 1) || (r > 1 && c == 11 - r)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
