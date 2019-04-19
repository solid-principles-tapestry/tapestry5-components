package solid.principles.tapestry5.modules;

import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.services.ComponentClassResolver;
import org.apache.tapestry5.services.LibraryMapping;

public class Tapestry5ComponentsModule
{

    @Contribute(ComponentClassResolver.class)
    public static void provideLibraryMapping(final Configuration<LibraryMapping> configuration)
    {
        configuration.add(new LibraryMapping("sp", "solid.principles.tapestry5"));
    }
}
