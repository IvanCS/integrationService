package com.ipetrushin.syncher.ejb.dispatcher.core;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 25.08.13
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
public interface ITransformer {
    SyncherMessageType transform(SyncherMessageType message);
}
