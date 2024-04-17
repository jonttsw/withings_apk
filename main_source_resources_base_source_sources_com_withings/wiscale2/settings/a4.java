package com.withings.wiscale2.settings;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class a4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f59866a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ nm0.g<SettingsViewModel> f59867b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(k1.r0<Boolean> r0Var, nm0.g<SettingsViewModel> gVar) {
        super(0);
        this.f59866a = r0Var;
        this.f59867b = gVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f59866a.setValue(Boolean.FALSE);
        SettingsViewModel value = this.f59867b.getValue();
        value.getClass();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(value), Dispatchers.getIO(), null, new j5(value, null), 2, null);
        return nm0.y.f85009a;
    }
}
