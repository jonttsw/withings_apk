package com.withings.wiscale2.heart.heartrate;

import android.view.View;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreSimpleListKt;
import java.util.List;
/* compiled from: HeartRateOptionSheetFragment.kt */
/* loaded from: classes5.dex */
final class c1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<LearnMoreEntryTranslations> f57558a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a1 f57559b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f57560c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(List<LearnMoreEntryTranslations> list, a1 a1Var, View view) {
        super(2);
        this.f57558a = list;
        this.f57559b = a1Var;
        this.f57560c = view;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            LearnMoreSimpleListKt.LearnMoreSimpleList(this.f57558a, new b1(this.f57559b, this.f57560c), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
