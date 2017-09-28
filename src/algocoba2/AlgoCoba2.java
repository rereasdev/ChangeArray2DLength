package algocoba2;

public class AlgoCoba2 {

    public static void main(String[] args) {

        Object [][] country ={
            {"No","Name","Country"},    
            {"1.","David","Australia"}, 
            {"2.","Ahmad","Indonesia"}, 
            {"3.","Sudaish","Mesir"},   
            {"4.","Kim","Korea"}        
        };
        
        System.out.println(country.length);
        System.out.println(country[0].length);
        Object[][] ganti = ChangeArray2DLength.changeLength2D(country, 6, 4);
        
        System.out.println("ganti Length "+ganti.length);
        System.out.println("ganti Length2 "+ganti[0].length);
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
        }
    }
}
