package de.uka.ipd.sdq.pcm.stochasticexpressions.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

/**
 * @deprecated Since StoEx migration to Xtext
 */
@Deprecated
public class MyPCMStoExParser extends PCMStoExParser {

    private ArrayList<ErrorEntry> list;

    public MyPCMStoExParser(TokenStream input) {
        super(input);
        list = new ArrayList<ErrorEntry>();
    }

    @Override
    public void reportError(RecognitionException arg0) {
        String errorText = this.getErrorMessage(arg0, this.getTokenNames());
        list.add(new ErrorEntry(arg0, errorText));
    }

    public boolean hasErrors() {
        return list.size() > 0;
    }

    public Collection<ErrorEntry> getErrors() {
        return Collections.unmodifiableCollection(list);
    }
}
