package com.budjb.requestbuilder.httpexception

import com.budjb.requestbuilder.ResponseStatusException
import com.sun.jersey.api.client.ClientResponse

class HttpRequestedRangeNotSatisfiableException extends ResponseStatusException {
    public HttpRequestedRangeNotSatisfiableException(int status, Object content, ClientResponse response, String logText) {
        super(status, content, response, logText)
    }
}