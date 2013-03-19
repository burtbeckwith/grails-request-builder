package com.rackspace.rvi.httpexception

import com.rackspace.rvi.ResponseStatusException

class HttpTemporaryRedirectException extends ResponseStatusException {
    public HttpTemporaryRedirectException(int status, Object content) {
        super(status, content)
    }
}
