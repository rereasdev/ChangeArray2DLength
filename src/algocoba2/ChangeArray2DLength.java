
package algocoba2;

public class ChangeArray2DLength {
    public static Object[][] changeLength2D(final Object [][] a, int n, int m, int newLength, int newLength2){
        
        if (n> newLength){
            throw new IllegalArgumentException("new length is too small");
        }
        if(m>newLength2){
            throw new IllegalArgumentException("new length 2 is too small");
        }

        if (a != null) {
        final Object[][] copy = new Object[newLength][newLength2];

            for (int i = 0; i < a.length; i++) {
                final Object[] row = a[i];
                copy[i] = new Object[newLength2];
                System.arraycopy(row, 0, copy[i], 0, row.length);
            }
        System.out.println("2nL "+copy.length);
        System.out.println("2nL2 "+copy[0].length);
        
        return copy;
        } 
    return null;
    }

    public static Object [][] changeLength2D(final Object[][] a, int newLength, int newLength2){
        return changeLength2D(a, a.length, a[0].length, newLength, newLength2);
    }
}
