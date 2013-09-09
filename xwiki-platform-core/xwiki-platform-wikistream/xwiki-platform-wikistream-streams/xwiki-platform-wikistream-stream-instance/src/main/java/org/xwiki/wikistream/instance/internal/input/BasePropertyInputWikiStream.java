package org.xwiki.wikistream.instance.internal.input;

import org.xwiki.filter.FilterEventParameters;
import org.xwiki.wikistream.WikiStreamException;
import org.xwiki.wikistream.input.InputWikiStream;
import org.xwiki.wikistream.instance.internal.BasePropertyProperties;
import org.xwiki.wikistream.instance.internal.XWikiDocumentFilter;

import com.xpn.xwiki.objects.BaseProperty;

public class BasePropertyInputWikiStream implements InputWikiStream
{
    private BaseProperty< ? > xclassProperty;

    private BasePropertyProperties properties;

    public BasePropertyInputWikiStream(BaseProperty< ? > xproperty, BasePropertyProperties properties)
    {
        this.xclassProperty = xproperty;
        this.properties = properties;
    }

    @Override
    public void read(Object filter) throws WikiStreamException
    {
        XWikiDocumentFilter documentFilter = (XWikiDocumentFilter) filter;

        // > WikiObjectProperty

        documentFilter.beginWikiObjectProperty(this.xclassProperty.getName(), this.xclassProperty.toText(),
            FilterEventParameters.EMPTY);

        // < WikiObjectProperty

        documentFilter.endWikiObjectProperty(this.xclassProperty.getName(), this.xclassProperty.toText(),
            FilterEventParameters.EMPTY);
    }
}