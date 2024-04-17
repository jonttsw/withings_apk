package com.withings.learnmore.ui;

import android.content.Context;
import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.u0;
import ay.b;
import com.withings.learnmore.adapter.LearnMoreEntry;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.d0;
import uj.c;
import yk.h;
import ym0.p;
/* compiled from: LearnMoreScreens.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LearnMoreScreensKt$SectionLearnMore$2$1$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ List<LearnMoreEntryTranslations> $entries;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreScreensKt$SectionLearnMore$2$1$1(List<LearnMoreEntryTranslations> list) {
        super(2);
        this.$entries = list;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
            return;
        }
        Context context = (Context) aVar.D(u0.d());
        List<LearnMoreEntryTranslations> list = this.$entries;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (LearnMoreEntryTranslations learnMoreEntryTranslations : list) {
            arrayList.add(learnMoreEntryTranslations.languageOrDefault());
        }
        List<LearnMoreEntryTranslations> list2 = this.$entries;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 >= 0) {
                LearnMoreEntry learnMoreEntry = (LearnMoreEntry) next;
                c.a(b.u(C1987R.string.timelineImageTextCell_tapToRead, aVar), learnMoreEntry.getImageUrl(), learnMoreEntry.getLabel(), 0L, null, new LearnMoreScreensKt$SectionLearnMore$2$1$1$2$1(context, learnMoreEntry), aVar, 0, 24);
                aVar.s(-1165780600);
                if (i12 < list2.size() - 1) {
                    d0.a(e1.r(e.f8927a, h.c()), aVar);
                }
                aVar.J();
                i12 = i13;
            } else {
                x.K0();
                throw null;
            }
        }
    }
}
