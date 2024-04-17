package com.withings.zendesk.ui;

import ah.o;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FooterArticle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FooterArticleKt$MoreLink$2 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ym0.a<y> $onCommunityClicked;
    final /* synthetic */ ym0.a<y> $onContactClicked;
    final /* synthetic */ ym0.a<y> $onSearchClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterArticleKt$MoreLink$2(ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
        super(2);
        this.$onSearchClicked = aVar;
        this.$onCommunityClicked = aVar2;
        this.$onContactClicked = aVar3;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(androidx.compose.runtime.a aVar, int i11) {
        FooterArticleKt.MoreLink(this.$onSearchClicked, this.$onCommunityClicked, this.$onContactClicked, aVar, o.g(this.$$changed | 1));
    }
}
