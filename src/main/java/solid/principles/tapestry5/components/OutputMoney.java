package solid.principles.tapestry5.components;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.util.Locale;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PersistentLocale;

public class OutputMoney
{
    private static final Locale HUNGARIAN = new Locale("hu");

    @Parameter(required = true)
    @Property
    private BigDecimal value;

    @Inject
    private PersistentLocale persistentLocale;

    public Format getFormat()
    {
        return new DecimalFormat("###,### Ft", DecimalFormatSymbols.getInstance(getLocale()));
    }

    private Locale getLocale()
    {
        final Locale persistentLocale = this.persistentLocale.get();
        return persistentLocale != null ? persistentLocale : HUNGARIAN;
    }

}
