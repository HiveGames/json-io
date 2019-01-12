package com.cedarsoftware.util.io;

public class JsonParseException extends JsonIoException {

    private final int line;
    private final int column;
    private final String snippet;

    public JsonParseException(String message, Exception e, int line, int column, String snippet) {
        super(message, e);
        this.line = line;
        this.column = column;
        this.snippet = snippet;
    }

    public JsonParseException(String message, int line, int column, String snippet) {
        this(message, null, line, column, snippet);
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getSnippet() {
        return snippet;
    }
}
