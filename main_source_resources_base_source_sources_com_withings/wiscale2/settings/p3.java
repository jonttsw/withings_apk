package com.withings.wiscale2.settings;

import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class p3 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60241a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f60242b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f60243c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60244d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60245e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(r8.n nVar, com.withings.common.compose.component.z4 z4Var, SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, CoroutineScope coroutineScope) {
        super(3);
        this.f60241a = settingsViewModel;
        this.f60242b = coroutineScope;
        this.f60243c = nVar;
        this.f60244d = settingsActivity;
        this.f60245e = z4Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            CoroutineScope coroutineScope = this.f60242b;
            r8.n nVar = this.f60243c;
            com.withings.common.compose.component.z4 z4Var = this.f60245e;
            SettingsActivity settingsActivity = this.f60244d;
            SettingsViewModel settingsViewModel = this.f60241a;
            l0.c(settingsViewModel, new l3(nVar, z4Var, settingsActivity, settingsViewModel, coroutineScope), new m3(this.f60243c), new o3(this.f60242b, this.f60241a, this.f60245e), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
