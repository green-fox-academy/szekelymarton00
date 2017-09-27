package AircraftCarrier;

public class F16 extends Aircrafts {

  public F16(int BaseDamage, int MaxAmmo){

  }

  public void fight(){
    int Damage = BaseDamage * MaxAmmo;
    BaseDamage = 0;
    MaxAmmo = 0;
  }


}
