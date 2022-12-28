package editors.framework;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument("newFile");
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument("openFile");

    }
}