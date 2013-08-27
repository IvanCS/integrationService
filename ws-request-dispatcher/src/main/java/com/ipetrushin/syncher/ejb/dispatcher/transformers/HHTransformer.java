package com.ipetrushin.syncher.ejb.dispatcher.transformers;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 25.08.13
 * Time: 21:35
 * To change this template use File | Settings | File Templates.
 */
public class HHTransformer implements ITransformer {


    private static final List mounths = new ArrayList();

    static {
        mounths.add("");
        mounths.add("января");
        mounths.add("февраля");
        mounths.add("марта");
        mounths.add("апреля");
        mounths.add("мая");
        mounths.add("июня");
        mounths.add("июля");
        mounths.add("августа");
        mounths.add("сентября");
        mounths.add("октября");
        mounths.add("ноября");
        mounths.add("декабря");

    }

    public static List getMounths() {
        return new ArrayList(mounths);
    }

    @Override
    public SyncherMessageType transform(SyncherMessageType message) {

        //transform date
        XMLGregorianCalendar date = message.getSynchronizeResumeRequest().getResumeProfile().getPersonalInfo().getBirthDate();

        //------transform date


        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}


