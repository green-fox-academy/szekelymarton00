package aircraft.carrier;

public class Aircraft {

  protected String type;
  protected int maxAmmo;
  protected int currentAmmo;
  protected int baseDamage;

  public Aircraft() {
    currentAmmo = 0;
  }

  public Aircraft(String type) {
    this.type = type;
    currentAmmo = 0;
  }

  public int fight() {
    int totalDamage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return totalDamage;
  }

  public int refill(int refillAmmo) {
    int remainingAmmo = refillAmmo;
    this.currentAmmo = maxAmmo;
    remainingAmmo = refillAmmo - maxAmmo + currentAmmo;
    return remainingAmmo;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type: " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: "
        + baseDamage * currentAmmo;
  }
}