package com.ipetrushin.syncher.ejb.dispatcher.core;

import com.ipetrushin.syncher.ejb.dispatcher.core.IMapper;
import com.ipetrushin.syncher.ejb.dispatcher.core.ITransformer;
import com.ipetrushin.syncher.request.jaxb.entities.SyncherMessageType;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 26.08.13
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 */
public  class CommonProcessor {

    private ITransformer transformer;
    private IMapper mapper;

    public  CommonProcessor(ITransformer transformer,IMapper mapper){
        this.transformer = transformer;
        this.mapper = mapper;

    }

    public void process(SyncherMessageType exchangeMessage)throws Exception{
              transformer.transform(exchangeMessage);
              mapper.run(exchangeMessage);
    }
}
