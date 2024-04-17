package com.withings.zendesk.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import zendesk.support.Article;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArticlePage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzendesk/support/Article;", "kotlin.jvm.PlatformType", "it", "Lnm0/y;", "invoke", "(Lzendesk/support/Article;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ArticlePage$initViewModel$2 extends w implements l<Article, y> {
    final /* synthetic */ ArticlePage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticlePage$initViewModel$2(ArticlePage articlePage) {
        super(1);
        this.this$0 = articlePage;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Article article) {
        invoke2(article);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Article article) {
        ArticlePage articlePage = this.this$0;
        u.g(article);
        articlePage.bindArticle(article);
    }
}
