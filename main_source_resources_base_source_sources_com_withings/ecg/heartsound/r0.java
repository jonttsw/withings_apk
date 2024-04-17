package com.withings.ecg.heartsound;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreSimpleListKt;
import java.util.List;
/* compiled from: HeartSoundOptionSheetFragment.kt */
/* loaded from: classes3.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<LearnMoreEntryTranslations> f38522a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p0 f38523b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(List<LearnMoreEntryTranslations> list, p0 p0Var) {
        super(2);
        this.f38522a = list;
        this.f38523b = p0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            LearnMoreSimpleListKt.LearnMoreSimpleList(this.f38522a, new q0(this.f38523b), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
