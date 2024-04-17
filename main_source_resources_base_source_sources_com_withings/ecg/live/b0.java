package com.withings.ecg.live;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38627a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38627a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        c N3;
        c N32;
        if (kotlin.jvm.internal.u.e(bool, Boolean.TRUE)) {
            LiveEcgActivity liveEcgActivity = this.f38627a;
            N3 = liveEcgActivity.N3();
            N3.G0().removeObservers(liveEcgActivity);
            N32 = liveEcgActivity.N3();
            N32.M0().removeObservers(liveEcgActivity);
            LiveEcgActivity.M3(liveEcgActivity);
        }
        return nm0.y.f85009a;
    }
}
