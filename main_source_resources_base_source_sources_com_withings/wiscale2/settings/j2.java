package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class j2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60073a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60074b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f60075c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, int i11) {
        super(2);
        this.f60073a = settingsActivity;
        this.f60074b = settingsViewModel;
        this.f60075c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f60075c | 1);
        SettingsActivity.C3(this.f60073a, this.f60074b, aVar, g11);
        return nm0.y.f85009a;
    }
}
