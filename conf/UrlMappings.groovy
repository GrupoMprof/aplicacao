class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        //"/"(view:"/index")
		"/"(view:"/areaRestrita/logar")
        "500"(view:'/error')
	}
}