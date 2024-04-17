package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.ui.LearnMoreSimpleListKt;
import java.util.List;
/* compiled from: WorkoutOptionSheetFragment.kt */
/* loaded from: classes4.dex */
final class w6 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<LearnMoreEntryTranslations> f49776a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u6 f49777b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ tb0.h1 f49778c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(List<LearnMoreEntryTranslations> list, u6 u6Var, tb0.h1 h1Var) {
        super(2);
        this.f49776a = list;
        this.f49777b = u6Var;
        this.f49778c = h1Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            LearnMoreSimpleListKt.LearnMoreSimpleList(this.f49776a, new v6(this.f49777b, this.f49778c), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
