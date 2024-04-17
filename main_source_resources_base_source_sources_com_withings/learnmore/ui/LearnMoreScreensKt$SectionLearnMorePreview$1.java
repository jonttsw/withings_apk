package com.withings.learnmore.ui;

import androidx.compose.runtime.a;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: LearnMoreScreens.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LearnMoreScreensKt$SectionLearnMorePreview$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ List<LearnMoreEntryTranslations> $learnMoreEntryTranslations;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreScreensKt$SectionLearnMorePreview$1(List<LearnMoreEntryTranslations> list) {
        super(2);
        this.$learnMoreEntryTranslations = list;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            LearnMoreScreensKt.SectionLearnMore("About Titles", this.$learnMoreEntryTranslations, aVar, 6);
        }
    }
}
