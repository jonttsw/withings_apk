package com.withings.zendesk.ui;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.h;
import ym0.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FooterArticle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr0/h;", "Lnm0/y;", "invoke", "(Lr0/h;Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FooterArticleKt$MoreLink$1 extends w implements q<h, androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ ym0.a<y> $onCommunityClicked;
    final /* synthetic */ ym0.a<y> $onContactClicked;
    final /* synthetic */ ym0.a<y> $onSearchClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterArticleKt$MoreLink$1(ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3) {
        super(3);
        this.$onSearchClicked = aVar;
        this.$onCommunityClicked = aVar2;
        this.$onContactClicked = aVar3;
    }

    public final void invoke(h SectionCardColumn, androidx.compose.runtime.a aVar, int i11) {
        u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((i11 & 81) == 16 && aVar.h()) {
            aVar.C();
            return;
        }
        FooterArticleKt.Link(ay.b.u(C1987R.string.helpCenter_footerSearchAnswer, aVar), this.$onSearchClicked, aVar, 0);
        FooterArticleKt.Link(ay.b.u(C1987R.string.helpCenter_community, aVar), this.$onCommunityClicked, aVar, 0);
        FooterArticleKt.Link(ay.b.u(C1987R.string.helpCenter_contactCustomerSupport, aVar), this.$onContactClicked, aVar, 0);
    }

    @Override // ym0.q
    public /* bridge */ /* synthetic */ y invoke(h hVar, androidx.compose.runtime.a aVar, Integer num) {
        invoke(hVar, aVar, num.intValue());
        return y.f85009a;
    }
}
