package sample.qiitaclient.view

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import sample.qiitaclient.R
import sample.qiitaclient.bindView
import sample.qiitaclient.modele.Article

class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    // 処理をbindViewに移譲している
    private val profileImageView: ImageView by bindView(R.id.profile_image_view)
    private val titleTextView: TextView by bindView(R.id.title_text_view)
    private val userNameTextView: TextView by bindView(R.id.user_name_text_view)

    init {
        // FrameLayoutを継承しているArticleViewにRelativeLayoutをaddViewしている
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
    }

    fun setArticle(article: Article){
        titleTextView.text = article.title
        userNameTextView.text = article.user.name

        profileImageView.setBackgroundColor(Color.RED)
    }


}