package me.kktrkkt.effectivejava._19_design_and_document_inheritance_otherwise_do_not_use_inheritance;

// 상속용 클래스는 내부 구현을 문서화 해야한다.
// @implSpec을 통해 내부 구현 설명을 첨부한다.
// @implSpec 기본 애노테이션에 없으므로 추가해줘야 한다
// javadoc -d target/apidoc src/main/java/me/kktrkkt/effectivejava/_19_design_and_document_inheritance_otherwise_do_not_use_inheritance/* -tag "implSpec:a:Implementation Requirements:"
/***
 * Example class for java documentation for extendable class
 */
public class ExtendableClass {

    /***
     * this method can be overridden to print any message.
     *
     * @implSpec
     * Please use System.out.println().
     */
    public void doSomething() {
        System.out.println("hello");
    }

}
