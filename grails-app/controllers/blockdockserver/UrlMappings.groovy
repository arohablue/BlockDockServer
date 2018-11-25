package blockdockserver

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/auth/login" (controller: "AuthApi") { action = [POST: "login"] }
        "/api/auth/register" (controller: "AuthApi") { action = [POST: "register"] }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
