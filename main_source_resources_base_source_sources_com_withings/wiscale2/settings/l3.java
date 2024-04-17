package com.withings.wiscale2.settings;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class l3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f60181a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60182b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f60183c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60184d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60185e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(r8.n nVar, com.withings.common.compose.component.z4 z4Var, SettingsActivity settingsActivity, SettingsViewModel settingsViewModel, CoroutineScope coroutineScope) {
        super(0);
        this.f60181a = coroutineScope;
        this.f60182b = settingsViewModel;
        this.f60183c = nVar;
        this.f60184d = settingsActivity;
        this.f60185e = z4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f60181a, null, null, new k3(this.f60182b, this.f60183c, this.f60184d, this.f60185e, null), 3, null);
        return nm0.y.f85009a;
    }
}
