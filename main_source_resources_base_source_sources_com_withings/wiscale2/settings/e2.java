package com.withings.wiscale2.settings;

import com.withings.wiscale2.settings.SettingsActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class e2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f59978a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(k1.r0<Boolean> r0Var) {
        super(0);
        this.f59978a = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        SettingsActivity.b bVar = SettingsActivity.f59742k;
        this.f59978a.setValue(Boolean.TRUE);
        return nm0.y.f85009a;
    }
}
