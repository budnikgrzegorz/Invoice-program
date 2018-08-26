package Invoice.api.enums;

public enum VatRate {
    A(0), B(5), C(7), D(23);

    private final int mask;

    private VatRate(int mask)
    {
        this.mask = mask;
    }

    public int getMask()
    {
        return mask;
    }

}
