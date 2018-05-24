package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/*
Viewクラスの拡張関すbindViewを定義
lazyは変数が参照された時に発火するメソッド
 */
fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}