public class Machine3 implements IControls, IKyl{
    public void start()
    {
        System.out.println("Denna proceduren startar maskin 3");
        System.out.println("Det krävs flera steg");
        System.out.println("Metoden sätter igång en process.");
        System.out.println("Efter ett antal automatiska steg är det klart \n\n");
    }

    @Override
    public void stop() {
        System.out.println("Denna proceduren stoppar maskin 3");
    }

    public void Kyl() {
        System.out.println("IKyl interface aktiverad maskin 3");

    }
}
