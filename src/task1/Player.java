package task1;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new MachineGun(),
                new BigGun(),
                new WaterPistol(),
                new RGP(),
                new Slightshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot>= weaponSlots.length){
            System.out.println("Внесенное значение больше чем длина массива");
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}