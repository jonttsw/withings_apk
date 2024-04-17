package com.withings.wiscale2.settings;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class d3 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59963a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59964b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f59965c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(CoroutineScope coroutineScope, SettingsViewModel settingsViewModel, com.withings.common.compose.component.z4 z4Var) {
        super(1);
        this.f59963a = coroutineScope;
        this.f59964b = settingsViewModel;
        this.f59965c = z4Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String description = str;
        kotlin.jvm.internal.u.j(description, "description");
        BuildersKt__Builders_commonKt.launch$default(this.f59963a, null, null, new c3(this.f59964b, this.f59965c, description, null), 3, null);
        return nm0.y.f85009a;
    }
}
