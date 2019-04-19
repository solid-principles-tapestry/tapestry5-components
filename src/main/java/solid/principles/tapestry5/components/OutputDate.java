package solid.principles.tapestry5.components;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;

public class OutputDate
{

    @Parameter(required = true)
    @Property
    private Date value;

    @Inject
    private Messages messages;

    public SimpleDateFormat getFormat()
    {
        return new SimpleDateFormat(this.messages.get("dateFormat"));
    }
}
