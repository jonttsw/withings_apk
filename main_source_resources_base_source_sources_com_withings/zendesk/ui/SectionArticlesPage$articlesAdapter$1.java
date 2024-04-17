package com.withings.zendesk.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.zendesk.ui.ArticlePageDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import zendesk.support.Article;
/* compiled from: SectionArticlesPage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzendesk/support/Article;", ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, "Lnm0/y;", "invoke", "(Lzendesk/support/Article;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class SectionArticlesPage$articlesAdapter$1 extends w implements l<Article, y> {
    final /* synthetic */ SectionArticlesPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionArticlesPage$articlesAdapter$1(SectionArticlesPage sectionArticlesPage) {
        super(1);
        this.this$0 = sectionArticlesPage;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Article article) {
        invoke2(article);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Article article) {
        u.j(article, "article");
        androidx.navigation.e a11 = ah.e.a(this.this$0);
        ArticlePageDirections.Companion companion = ArticlePageDirections.Companion;
        Long id2 = article.getId();
        u.i(id2, "getId(...)");
        a11.K(companion.showArticle(id2.longValue()));
    }
}
