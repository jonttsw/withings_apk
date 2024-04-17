package com.withings.wiscale2.settings;

import androidx.activity.ComponentActivity;
/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes5.dex */
public final class v4 extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComponentActivity f60352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(SettingsActivity settingsActivity) {
        super(0);
        this.f60352a = settingsActivity;
    }

    @Override // ym0.a
    public final i6.a invoke() {
        return this.f60352a.getDefaultViewModelCreationExtras();
    }
}
