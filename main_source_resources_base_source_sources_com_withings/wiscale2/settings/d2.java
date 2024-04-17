package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class d2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59961a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f59962b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(SettingsActivity settingsActivity, int i11) {
        super(2);
        this.f59961a = settingsActivity;
        this.f59962b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59962b | 1);
        SettingsActivity.B3(this.f59961a, aVar, g11);
        return nm0.y.f85009a;
    }
}
