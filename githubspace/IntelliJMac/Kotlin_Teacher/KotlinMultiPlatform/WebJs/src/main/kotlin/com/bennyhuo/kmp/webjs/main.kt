package com.bennyhuo.kmp.webjs

import com.bennyhuo.kmp.doSomething
import org.w3c.dom.get
import kotlin.browser.document

fun main(args: Array<String>) {
    document.getElementsByTagName("body")[0]?.textContent = doSomething()
}