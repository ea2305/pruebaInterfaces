public interface MakeFig {
    
    //Realiza simulaciones de medidas pequeñas para figuras
    public static String Form = "none";
    public static int Size = 0;
    
    public boolean setForm(String Form);
    public String getForm();
    public int getSize();
    public boolean setSize(int Size);
}