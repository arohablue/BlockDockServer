package blockdockserver

import org.grails.core.exceptions.GrailsException

/**
 * Created by Aroha on 20-10-2018.
 */
class ApiException extends GrailsException {
    // response code to send for this exception
    int responseCode = Constants.HttpCodes.INTERNAL_SERVER_ERROR

    ApiException() {}

    ApiException(String message) {
        super(message)
    }

    ApiException(String message, int responseCode) {
        super(message)
        this.responseCode = responseCode
    }
}
