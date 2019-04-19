package solid.principles.tapestry5.components;

import java.math.BigDecimal;
import java.text.Format;
import java.text.NumberFormat;

import org.apache.tapestry5.annotations.Parameter;

public class OutputPercent
{
    private static final Format format = NumberFormat.getPercentInstance();

    @Parameter(required = true)
    private BigDecimal value;

    public Format getFormat()
    {
        return format;
    }

    public BigDecimal getValue()
    {
        return this.value;
    }
}
