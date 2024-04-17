package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.activity.workout.ui.detail.ListGpsPointActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListGpsPointActivity.kt */
/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49246a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity.b f49247b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f49248c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ListGpsPointActivity listGpsPointActivity, ListGpsPointActivity.b bVar, int i11) {
        super(2);
        this.f49246a = listGpsPointActivity;
        this.f49247b = bVar;
        this.f49248c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f49248c | 1);
        ListGpsPointActivity.A3(this.f49246a, this.f49247b, aVar, g11);
        return nm0.y.f85009a;
    }
}
