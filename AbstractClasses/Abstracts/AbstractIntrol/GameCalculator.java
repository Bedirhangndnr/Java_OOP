package AbstractClasses.Abstracts.AbstractIntrol;

public abstract class GameCalculator {
    public abstract void hesapla(); /**Kendi hesapla metodunu yazmak zorunda */
    public void GameOver(){/** isteyen override edebilir. Eğer bunu istmeiyorsak, public final void deriz*/
        System.out.println("Game Over");
    }
}
