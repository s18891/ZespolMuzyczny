package pjatk.mas;

import java.util.Date;

public abstract class InstrumentMuzyczny {

    private String nazwa;
    private String producent;
    private String rodzajMaterialu;
    private int wiek;
    private String stan {dobry, wymagajacy przegladu};
    private Date ostatniegoPrzegladu;

    void zapiszWykonaniePrzegladu(  )
    {
    }

    void oznaczStan( stan )
    {
    }

    void wyswietlInstrumentyWymagajacePrzegladu(  )
    {
    }

    void oznaczInstrumentyDoPrzegladu(  )
    {
    }
}

