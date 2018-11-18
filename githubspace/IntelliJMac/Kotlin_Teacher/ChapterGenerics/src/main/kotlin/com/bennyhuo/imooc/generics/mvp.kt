package com.bennyhuo.imooc.generics

interface IView<out P : IPresenter<IView<P>>> {
    val presenter: P
}

interface IPresenter<out V : IView<IPresenter<V>>> {
    val view: V
}

abstract class BaseView<out P : BasePresenter<BaseView<P>>> : IView<P> {
    override val presenter: P

    init {
        presenter = findPresenterClass().newInstance()
        presenter.view = this
    }

    private fun findPresenterClass(): Class<P> {
        var thisClass: Class<*> = this.javaClass
        while (true){

        }
    }
}


abstract class BasePresenter<out V : IView<BasePresenter<V>>> : IPresenter<V> {
    override lateinit var view: @UnsafeVariance V
}


class MainView : BaseView<MainPresenter>()

class MainPresenter : BasePresenter<MainView>()

fun main(args: Array<String>) {
    MainView().presenter.let(::println)
}