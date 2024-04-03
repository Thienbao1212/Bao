

import Controllers.TextEditorController;
import Models.TextEditorModel;
import Views.TextEditorView;

public class Main {
    public static void main(String[] args) {
        TextEditorModel model = new TextEditorModel();
        TextEditorView view = new TextEditorView(model);
        TextEditorController controller = new TextEditorController(view);
    }
}