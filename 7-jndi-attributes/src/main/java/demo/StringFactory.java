package demo;

import org.apache.naming.ResourceRef;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

public class StringFactory implements ObjectFactory {
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) {
        return ((ResourceRef)obj).get("content").getContent();
    }
}
