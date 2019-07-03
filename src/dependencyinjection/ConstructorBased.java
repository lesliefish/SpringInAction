package dependencyinjection;

public class ConstructorBased
{
    private Speaker speaker;

    public ConstructorBased(Speaker s)
    {
        System.out.println("ConstructorBased Construct");
        speaker = s;
    }

    public void saySth()
    {
        speaker.speak();
    }
}
