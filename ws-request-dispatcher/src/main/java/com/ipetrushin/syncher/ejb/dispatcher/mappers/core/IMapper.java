package com.ipetrushin.syncher.ejb.dispatcher.mappers.core;

import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 04.06.13
 * Time: 16:30
 * To change this template use File | Settings | File Templates.
 */
public interface IMapper {
    void run(SyncherMessageType exchangeMessage) throws  Exception;
}
