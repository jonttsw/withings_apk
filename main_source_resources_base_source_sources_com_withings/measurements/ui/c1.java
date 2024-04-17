package com.withings.measurements.ui;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class c1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42032a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42033b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(CoroutineScope coroutineScope, HealthVerticalActivity healthVerticalActivity) {
        super(0);
        this.f42032a = coroutineScope;
        this.f42033b = healthVerticalActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f42032a, Dispatchers.getIO(), null, new b1(this.f42033b, null), 2, null);
        return nm0.y.f85009a;
    }
}
