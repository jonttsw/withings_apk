package com.withings.details.height;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36648a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(HeightListActivity heightListActivity) {
        super(2);
        this.f36648a = heightListActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            HeightListActivity heightListActivity = this.f36648a;
            HeightListActivity.D3(heightListActivity, new x(heightListActivity), aVar2, 64);
        }
        return nm0.y.f85009a;
    }
}
