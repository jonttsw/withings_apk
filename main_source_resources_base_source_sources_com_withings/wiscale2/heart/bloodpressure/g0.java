package com.withings.wiscale2.heart.bloodpressure;

import android.view.View;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreSimpleListKt;
import java.util.List;
/* compiled from: BloodPressureOptionSheetFragment.kt */
/* loaded from: classes5.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<LearnMoreEntryTranslations> f57378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d0 f57379b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f57380c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List<LearnMoreEntryTranslations> list, d0 d0Var, View view) {
        super(2);
        this.f57378a = list;
        this.f57379b = d0Var;
        this.f57380c = view;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            LearnMoreSimpleListKt.LearnMoreSimpleList(this.f57378a, new f0(this.f57379b, this.f57380c), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
