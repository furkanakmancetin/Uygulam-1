
package uyg4;
public class gosterge extends motor
{
public static void main(String[] args)
{
    gosterge motor=new gosterge();
    
    System.out.print("Devir Saati..: ");
    motor.Devir();
    System.out.println("Hız..: "+hiz());
    System.out.print("Soğutma Suyu Sıcaklığı..: ");
    motor.SuSıcaklıgı();
    System.out.print("Turbo Basıncı..: ");
    motor.TurboBasinci();
}
    static int hiz()
    {
        return 82;
    }
}
