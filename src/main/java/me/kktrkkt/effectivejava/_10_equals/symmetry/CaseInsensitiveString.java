package me.kktrkkt.effectivejava._10_equals.symmetry;

// CaseInsensitiveString는 String을 지원하지만 String은 CaseInsensitiveString를 지원하지 않으므로 대칭성이 위반된다.
public class CaseInsensitiveString {

    private final String str;

    public CaseInsensitiveString(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseInsensitiveString){
            return str.equalsIgnoreCase(((CaseInsensitiveString) obj).str);
        }
        if(obj instanceof String){
            return str.equalsIgnoreCase((String) obj);
        }
        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Spring");
        String string = "Spring";
        System.out.println(cis.equals(string));
        System.out.println(string.equals(cis));
    }

}
