package com.practice.jpa_practice.artist;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NetWorth {

    @Column(name="BEFORE_TAX_NETWORTH")
    private int beforeTaxNetworth;

    @Column(name="TAX")
    private double tax;

    @Column(name="AFTER_TAX_NETWORTH")
    private int afterTaxNetworth;

    public NetWorth() {
    }

    public NetWorth(int beforeTaxNetworth, double tax) {
        validateNegativeNetWorth(beforeTaxNetworth);
        validateNegativeTax(tax);
        this.beforeTaxNetworth = beforeTaxNetworth;
        this.tax = tax;
        this.afterTaxNetworth = calculateAfterTaxNetWorth(beforeTaxNetworth, tax);
    }

    private void validateNegativeNetWorth(int beforeTaxNetworth) {
        if(beforeTaxNetworth < 0) {
            throw new IllegalArgumentException("순자산이 음수면 큰일 나겠죠^^;;");
        }
    }

    private void validateNegativeTax(double tax) {
        if(tax < 0){
            throw new IllegalArgumentException("세금은 음수였음 좋겟지만 응 안됩니다 _3_");
        }
    }

    private int calculateAfterTaxNetWorth(int beforeTaxNetworth, double tax) {
        return (int) (beforeTaxNetworth - (beforeTaxNetworth * tax));
    }

    public int getBeforeTaxNetworth() {
        return beforeTaxNetworth;
    }

    public double getTax() {
        return tax;
    }

    public int getAfterTaxNetworth() {
        return afterTaxNetworth;
    }

}
