package com.withings.learnmore.ui;

import ah.o;
import androidx.compose.runtime.a;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LearnMoreScreens.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LearnMoreScreensKt$SectionLearnMore$3 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<LearnMoreEntryTranslations> $learnMoreEntryTranslations;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreScreensKt$SectionLearnMore$3(String str, List<LearnMoreEntryTranslations> list, int i11) {
        super(2);
        this.$title = str;
        this.$learnMoreEntryTranslations = list;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        LearnMoreScreensKt.SectionLearnMore(this.$title, this.$learnMoreEntryTranslations, aVar, o.g(this.$$changed | 1));
    }
}
