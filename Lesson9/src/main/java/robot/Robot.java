package robot;

import hands.IHand;
import heads.IHead;
import legs.ILeg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
    }

    public IHead getHead() {  //пока не сгенерирую get и set выдает ошибку в классе Run, @Getter @Setter не помогают, хотя видно, что они активны и идея их видит.Библиотеку lombok подключил, в файлу pom необходимый код тоже добавил и обновил после этого. В чем может быть причина?
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
//        int price = ((RobotParts) head).getPrice();
        return price;
    }


}