package com.withings.wiscale2.settings;

import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class e3 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59979a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59980b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59981c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f59982d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59983e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.withings.common.compose.component.z4 z4Var, SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, ym0.a aVar, CoroutineScope coroutineScope) {
        super(3);
        this.f59979a = settingsViewModel;
        this.f59980b = aVar;
        this.f59981c = coroutineScope;
        this.f59982d = z4Var;
        this.f59983e = settingsActivity;
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
            CoroutineScope coroutineScope = this.f59981c;
            com.withings.common.compose.component.z4 z4Var = this.f59982d;
            SettingsActivity settingsActivity = this.f59983e;
            SettingsViewModel settingsViewModel = this.f59979a;
            ym0.a<nm0.y> aVar3 = this.f59980b;
            l0.a(settingsViewModel, aVar3, new b3(z4Var, settingsActivity, settingsViewModel, aVar3, coroutineScope), new d3(this.f59981c, this.f59979a, this.f59982d), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
