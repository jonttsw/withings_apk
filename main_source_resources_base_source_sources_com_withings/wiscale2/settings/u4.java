package com.withings.wiscale2.settings;

import androidx.activity.ComponentActivity;
/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes5.dex */
public final class u4 extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComponentActivity f60336a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(SettingsActivity settingsActivity) {
        super(0);
        this.f60336a = settingsActivity;
    }

    @Override // ym0.a
    public final androidx.lifecycle.m1 invoke() {
        return this.f60336a.getViewModelStore();
    }
}
