package com.withings.zendesk.ui;

import android.content.Context;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.platform.u0;
import com.withings.common.compose.component.b4;
import com.withings.common.compose.component.o;
import com.withings.zendesk.ktx.ZendeskLabelExtensionKt;
import com.withings.zendesk.models.ZendeskLabel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.h;
import ym0.r;
import zendesk.support.Article;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ls0/b;", "", "it", "Lnm0/y;", "invoke", "(Ls0/b;ILandroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchFragment$Content$1$invoke$$inlined$items$default$4 extends w implements r<s0.b, Integer, androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ List $items;
    final /* synthetic */ SearchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$Content$1$invoke$$inlined$items$default$4(List list, SearchFragment searchFragment) {
        super(4);
        this.$items = list;
        this.this$0 = searchFragment;
    }

    public final void invoke(s0.b bVar, int i11, androidx.compose.runtime.a aVar, int i12) {
        int i13;
        if ((i12 & 14) == 0) {
            i13 = i12 | (aVar.K(bVar) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= aVar.c(i11) ? 32 : 16;
        }
        if ((i13 & 731) == 146 && aVar.h()) {
            aVar.C();
            return;
        }
        Object obj = this.$items.get(i11);
        aVar.s(-1738277073);
        if (obj instanceof Article) {
            aVar.s(-1738277025);
            androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, h.o(), 0.0f, 2);
            String title = ((Article) obj).getTitle();
            if (title == null) {
                title = "";
            }
            o.o(h11, null, title, null, null, false, true, false, null, null, null, new SearchFragment$Content$1$1$1(this.this$0, obj), null, aVar, 1572864, 0, 6074);
            aVar.J();
        } else if (obj instanceof ZendeskLabel) {
            aVar.s(-1738276391);
            b4.a(ZendeskLabelExtensionKt.wordingResId((ZendeskLabel) obj, (Context) aVar.D(u0.d())), null, null, null, aVar, 0, 14);
            aVar.J();
        } else {
            aVar.s(-1738276279);
            aVar.J();
        }
        aVar.J();
    }

    @Override // ym0.r
    public /* bridge */ /* synthetic */ y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        invoke(bVar, num.intValue(), aVar, num2.intValue());
        return y.f85009a;
    }
}
