package pjatk.mas;

import java.util.Date;

public abstract class InstrumentMuzyczny {

    private String nazwa;
    private String producent;
    private String rodzajMaterialu;
    private int rokProdukcji;
    private String stan /* todo  enum: dobry, wymagajacy przegladu*/;
    private Date dataOstatniegoPrzegladu;

    void zapiszWykonaniePrzegladu(  )
    {
        dataOstatniegoPrzegladu= new Date(System.currentTimeMillis());
    }

    void oznaczStan( String Stan )
    {
        stan=Stan;
    }

    static void wyswietlInstrumentyWymagajacePrzegladu(Extencja extencja  )
    {
        if(extencja.)

            //todo xxxx
    }

    void oznaczInstrumentDoPrzegladu(  )
    {
        stan = "wymagajacy przegladu";
    }
}

