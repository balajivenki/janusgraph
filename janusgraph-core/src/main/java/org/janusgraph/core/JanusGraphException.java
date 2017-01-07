package org.janusgraph.core;


import org.janusgraph.util.datastructures.ExceptionUtil;

/**
 * Most general type of exception thrown by the JanusGraph graph database.
 *
 * @author Matthias Br&ouml;cheler (http://www.matthiasb.com)
 */
public class JanusGraphException extends RuntimeException {

    private static final long serialVersionUID = 4056436257763972423L;

    /**
     * @param msg Exception message
     */
    public JanusGraphException(String msg) {
        super(msg);
    }

    /**
     * @param msg   Exception message
     * @param cause Cause of the exception
     */
    public JanusGraphException(String msg, Throwable cause) {
        super(msg, cause);
    }

    /**
     * Constructs an exception with a generic message
     *
     * @param cause Cause of the exception
     */
    public JanusGraphException(Throwable cause) {
        this("Exception in JanusGraph", cause);
    }

    /**
     * Checks whether this exception is cause by an exception of the given type.
     *
     * @param causeExceptionType exception type
     * @return true, if this exception is caused by the given type
     */
    public boolean isCausedBy(Class<?> causeExceptionType) {
        return ExceptionUtil.isCausedBy(this, causeExceptionType);
    }

}
