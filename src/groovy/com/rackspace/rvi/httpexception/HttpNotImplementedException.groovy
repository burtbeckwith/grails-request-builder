package com.rackspace.rvi.httpexception

import com.rackspace.rvi.ResponseStatusException

class HttpNotImplementedException extends ResponseStatusException {
    public HttpNotImplementedException(int status, Object content) {
        super(status, content)
    }
}
