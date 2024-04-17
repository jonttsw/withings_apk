package com.withings.zendesk.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import zendesk.support.Article;
import zendesk.support.SearchArticle;
/* compiled from: FooterArticle.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class FooterArticleKt$RelatedArticleItem$1 extends w implements ym0.a<y> {
    final /* synthetic */ SearchArticle $item;
    final /* synthetic */ l<Article, y> $onArticleClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FooterArticleKt$RelatedArticleItem$1(l<? super Article, y> lVar, SearchArticle searchArticle) {
        super(0);
        this.$onArticleClicked = lVar;
        this.$item = searchArticle;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<Article, y> lVar = this.$onArticleClicked;
        Article article = this.$item.getArticle();
        u.i(article, "getArticle(...)");
        lVar.invoke(article);
    }
}
