package task2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100"), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal("100"), new VATaxType(), taxService),
                new Bill(new BigDecimal("150000"), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal("90000"), new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}
