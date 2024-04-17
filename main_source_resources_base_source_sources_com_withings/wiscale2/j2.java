package com.withings.wiscale2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class j2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MainActivity f57971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f57972b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(MainActivity mainActivity, String str) {
        super(0);
        this.f57971a = mainActivity;
        this.f57972b = str;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ch0.d R3;
        R3 = this.f57971a.R3();
        R3.T0(this.f57972b);
        return nm0.y.f85009a;
    }
}
