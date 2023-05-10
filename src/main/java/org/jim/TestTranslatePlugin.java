package org.jim;

/**
 * @author jim
 */
public class TestTranslatePlugin implements TranslatePlugin {
    @Override
    public String translate(String s, String s1, String s2) {
        return s + s1 + s2;
    }

    @Override
    public String translate(String s) {
        return s;
    }
}
