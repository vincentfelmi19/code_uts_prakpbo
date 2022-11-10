package com.ug9.etransactionproject;

public class BRImo extends MobileBanking{

    public BRImo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if(dp instanceof BNImo){
            setCheckFee(true);
        }else {
            setCheckFee(false);
        }
        super.transfer(dp, nominal);
    }
}
