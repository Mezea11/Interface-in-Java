public class Machine2 implements IControls{

    public void start()
    {
        System.out.println("Denna proceduren startar maskin 2");
        System.out.println("Det krävs flera steg");
        System.out.println("Detta är sista steget \n\n");
    }

    @Override
    public void stop() {
        System.out.println("Denna proceduren stoppar maskin 2");
    }
}
