package blockdockserver

import grails.converters.JSON


class AuthApiController {

    def login() {
        def input = request.JSON
        def resp
        User user = User.findByEmailIdAndPassword(input.email, input.password)
        if (!user) {
            throw new ApiException("Invalid email or password", Constants.HttpCodes.UNAUTHORIZED)
        }
        else
        {
            resp = [Success: true]
        }

        render resp as JSON
    }

    def register() {
    }

}
