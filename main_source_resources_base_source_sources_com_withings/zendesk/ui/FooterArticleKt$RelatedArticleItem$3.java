package com.withings.zendesk.ui;

import ah.o;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import ym0.p;
import zendesk.support.Article;
import zendesk.support.SearchArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FooterArticle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FooterArticleKt$RelatedArticleItem$3 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SearchArticle $item;
    final /* synthetic */ l<Article, y> $onArticleClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FooterArticleKt$RelatedArticleItem$3(SearchArticle searchArticle, l<? super Article, y> lVar, int i11) {
        super(2);
        this.$item = searchArticle;
        this.$onArticleClicked = lVar;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(androidx.compose.runtime.a aVar, int i11) {
        FooterArticleKt.RelatedArticleItem(this.$item, this.$onArticleClicked, aVar, o.g(this.$$changed | 1));
    }
}
