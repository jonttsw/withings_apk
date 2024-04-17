package com.withings.details.height;

import com.withings.library.measure.MeasuresGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36614a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f36615b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36616c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f36617d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HeightListActivity heightListActivity, MeasuresGroup measuresGroup, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f36614a = heightListActivity;
        this.f36615b = measuresGroup;
        this.f36616c = aVar;
        this.f36617d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f36617d | 1);
        MeasuresGroup measuresGroup = this.f36615b;
        ym0.a<nm0.y> aVar2 = this.f36616c;
        HeightListActivity.F3(this.f36614a, measuresGroup, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
