package me.kktrkkt.effectivejava._13_clone.do_not_use_constructor;

public class SubItem extends Item{
    public SubItem(String name) {
        super(name);
    }

    @Override
    public SubItem clone() {
        return (SubItem) super.clone();
    }

    public static void main(String[] args) {
        SubItem s1 = new SubItem("s1");
        // exception 발생
        SubItem clone = s1.clone();
    }
}
