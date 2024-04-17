package com.withings.zendesk.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.h;
import ym0.l;
import ym0.q;
import zendesk.support.Article;
import zendesk.support.SearchArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FooterArticle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr0/h;", "Lnm0/y;", "invoke", "(Lr0/h;Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FooterArticleKt$RelatedArticles$1 extends w implements q<h, androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ List<SearchArticle> $articles;
    final /* synthetic */ l<Article, y> $onArticleClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FooterArticleKt$RelatedArticles$1(List<? extends SearchArticle> list, l<? super Article, y> lVar) {
        super(3);
        this.$articles = list;
        this.$onArticleClicked = lVar;
    }

    public final void invoke(h SectionCardColumn, androidx.compose.runtime.a aVar, int i11) {
        u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((i11 & 81) == 16 && aVar.h()) {
            aVar.C();
            return;
        }
        l<Article, y> lVar = this.$onArticleClicked;
        for (SearchArticle searchArticle : this.$articles) {
            FooterArticleKt.RelatedArticleItem(searchArticle, lVar, aVar, 8);
        }
    }

    @Override // ym0.q
    public /* bridge */ /* synthetic */ y invoke(h hVar, androidx.compose.runtime.a aVar, Integer num) {
        invoke(hVar, aVar, num.intValue());
        return y.f85009a;
    }
}
