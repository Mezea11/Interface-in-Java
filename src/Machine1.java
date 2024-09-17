public class Machine1 implements IControls {
    public void start()
    {
        System.out.println("Denna proceduren startar maskin 1 \n\n");
    }

    @Override
    public void stop() {
        System.out.println("Denna proceduren stoppar maskin 1");

    }


}
