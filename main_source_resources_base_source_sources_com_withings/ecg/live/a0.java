package com.withings.ecg.live;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.l<k0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38626a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38626a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(k0 k0Var) {
        k0 k0Var2 = k0Var;
        if (k0Var2 != null) {
            LiveEcgActivity.D3(this.f38626a).l(k0Var2.a());
        }
        return nm0.y.f85009a;
    }
}
