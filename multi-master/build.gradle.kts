plugins {
	// bootクラスは実行モジュールのみに定義する
	// https://qiita.com/purini-to/items/6070c29ac4ed086e06be
	id("org.springframework.boot")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web:2.4.4")
}