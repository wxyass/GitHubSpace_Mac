package com.bennyhuo.kmp.nodejs

import com.bennyhuo.kmp.doSomething

external fun require(module: String): dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val app = express()

    app.get("/", { req, res ->
        res.type("text/plain")
        res.send(doSomething())
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}