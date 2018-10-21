package blockdockserver.utils

import grails.converters.JSON
import blockdockserver.ApiException

class UtilsController {

    def handleError() {
        def cause = request.exception?.cause
        while ((cause) && !(cause instanceof ApiException)) {
            cause = cause.cause
        }

        if (cause) {
            response.status = cause.responseCode
            def resp = [error: cause.message]
            render resp as JSON
        } else if (request.exception?.className?.endsWith('ApiController')) {
            response.status = 500
            def resp = [error: "Internal Server Error"]
            render resp as JSON
        } else {
            render(view: "/error.gsp", model: ["exception": request.exception])
        }
    }

    def handle404() {
        if (request.exception?.className?.endsWith('ApiController')) {
            response.status = 404
            def resp = [error: "Not Found"]
            render resp as JSON
        } else {
            response.status = 404
            render(view: "/notFound.gsp", model: ["exception": request.exception])
        }
    }
}
