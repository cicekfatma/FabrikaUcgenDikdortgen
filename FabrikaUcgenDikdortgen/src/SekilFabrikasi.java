public class SekilFabrikasi {
    public ISekilSablonu SekilOlustur(int sekilNumarasi) {
        if (sekilNumarasi == 1) {
            return new Dikdortgen();

        } else if (sekilNumarasi == 2) {
            return new Ucgen();
        } else {
            return null;
        }
    }
}
