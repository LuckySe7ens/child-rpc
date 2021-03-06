package cn.whforever.core.remote.server;

import cn.whforever.core.config.Config;
import cn.whforever.core.serialize.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ChildServer {
    private static final Logger logger = LoggerFactory.getLogger(ChildServer.class);

    public abstract void start(Config config) throws Exception;

    public abstract void destroy() throws Exception;
}
