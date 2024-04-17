package com.withings.ecg.details;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreSimpleListKt;
import java.util.List;
/* compiled from: EcgOptionSheetFragment.kt */
/* loaded from: classes3.dex */
final class e2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<LearnMoreEntryTranslations> f38183a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c2 f38184b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(List<LearnMoreEntryTranslations> list, c2 c2Var) {
        super(2);
        this.f38183a = list;
        this.f38184b = c2Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            LearnMoreSimpleListKt.LearnMoreSimpleList(this.f38183a, new d2(this.f38184b), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
