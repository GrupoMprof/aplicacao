dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = true
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "validate" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost/solicite"
			username = "root"
			password = "admin"
		}
	}
	test {
		dataSource {
			dbCreate = "validate"
			url = "jdbc:mysql://localhost/solicite"
			username = "root"
			password = "admin"
		}
	}
	production {
		dataSource {
			dbCreate = "validate"
			url = "jdbc:mysql://localhost/solicite"
			username = "root"
			password = "admin"
		}
	}
}