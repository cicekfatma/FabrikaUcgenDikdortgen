//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SekilFabrikasi sekilFabrikasi= new SekilFabrikasi();

        ISekilSablonu sekil1= sekilFabrikasi.SekilOlustur(1);
        sekil1.Alan();
        sekil1.Cevre();
        ISekilSablonu sekil2= sekilFabrikasi.SekilOlustur(2);
        sekil2.Alan();
        sekil2.Cevre();
    }
}