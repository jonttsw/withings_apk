package com.withings.wiscale2.settings;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class b3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59881a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59882b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f59883c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59884d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59885e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.withings.common.compose.component.z4 z4Var, SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, ym0.a aVar, CoroutineScope coroutineScope) {
        super(0);
        this.f59881a = coroutineScope;
        this.f59882b = settingsViewModel;
        this.f59883c = z4Var;
        this.f59884d = settingsActivity;
        this.f59885e = aVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f59881a, null, null, new a3(this.f59882b, this.f59883c, this.f59884d, this.f59885e, null), 3, null);
        return nm0.y.f85009a;
    }
}
