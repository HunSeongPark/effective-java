package item20;

/**
 * Created by Hunseong on 2022/06/16
 */
public abstract class AbstractCharacter implements Character {
    @Override
    public void create() {
        System.out.println("Character create");
    }

    @Override
    public void levelUp() {
        System.out.println("Character levelUp");
    }

    @Override
    public void process() {
        create();
        attack();
        levelUp();
        System.out.println("============");
    }
}
