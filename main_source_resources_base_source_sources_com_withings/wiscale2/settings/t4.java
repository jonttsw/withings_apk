package com.withings.wiscale2.settings;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.k1;
/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes5.dex */
public final class t4 extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComponentActivity f60314a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(SettingsActivity settingsActivity) {
        super(0);
        this.f60314a = settingsActivity;
    }

    @Override // ym0.a
    public final k1.b invoke() {
        return this.f60314a.getDefaultViewModelProviderFactory();
    }
}
