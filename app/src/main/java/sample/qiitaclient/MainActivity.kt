package sample.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.qiitaclient.modele.User
import sample.qiitaclient.modele.Article
import sample.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val articleView: ArticleView? = null
        val articleView = ArticleView(applicationContext)

        articleView.setArticle(
            Article(
                "123",
                "Kotlin入門",
                "http://www.example.com/articles/123",
                User("456", "たろう", "")
            )
        )

        setContentView(articleView)
    }
}
