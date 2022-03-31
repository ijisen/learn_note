package Basic.Day04_027_Class_Polymorphic.demo;
/**
 *
 * 创建一个Master对象，用来喂养动物
 *
 * */
public class Master {
    /**
     * 想上转型 upcasting   主动转换
     *
     * */
  public void feed(Pet pet) {
      pet.eat();
  }
}
