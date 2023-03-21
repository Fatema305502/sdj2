package model;

public class TextConverterModel implements TextConverter {
    @Override
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }
}
