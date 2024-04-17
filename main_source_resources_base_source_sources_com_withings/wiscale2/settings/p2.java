package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class p2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60239a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f60240b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(SettingsActivity settingsActivity, int i11) {
        super(2);
        this.f60239a = settingsActivity;
        this.f60240b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f60240b | 1);
        SettingsActivity.D3(this.f60239a, aVar, g11);
        return nm0.y.f85009a;
    }
}
