package com.withings.wiscale2.settings;

import com.withings.wiscale2.settings.SettingsActivity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class h2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f60029a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60030b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60031c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60032d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(CoroutineScope coroutineScope, k1.r0<Boolean> r0Var, SettingsViewModel settingsViewModel, SettingsActivity settingsActivity) {
        super(0);
        this.f60029a = coroutineScope;
        this.f60030b = r0Var;
        this.f60031c = settingsViewModel;
        this.f60032d = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        SettingsActivity.b bVar = SettingsActivity.f59742k;
        this.f60030b.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(this.f60029a, null, null, new g2(this.f60031c, this.f60032d, null), 3, null);
        return nm0.y.f85009a;
    }
}
