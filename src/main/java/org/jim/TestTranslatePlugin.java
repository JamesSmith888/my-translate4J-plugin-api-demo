package org.jim;

/**
 * @author jim
 */
public class TestTranslatePlugin implements TranslatePlugin {

    @Override
    public String translate(String s) {
        // TODO: Implement this method
        return "Hello world!";
    }

    @Override
    public String translatePaneTitle() {
        return "Demo Plugin";
    }

    @Override
    public String translatePaneIconPath() {
        return "BgSub_trayIcon.png";
    }
}
