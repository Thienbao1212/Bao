package Controllers;

import Views.TextEditorView;

public class TextEditorController {
    private TextEditorView view;

    public TextEditorController(TextEditorView view) {
        this.view = view;
    }

    public void displayText(String text) {
        view.getTextArea().setText(text);
    }
}