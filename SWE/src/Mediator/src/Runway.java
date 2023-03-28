package Mediator.src;

class Runway
{
    private IATCMediator atcMediator;

    public Runway(IATCMediator atcMediator)
    {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    public void land()
    {
        System.out.println("Landing permission granted.");
        atcMediator.setLandingStatus(true);
    }

}