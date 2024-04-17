package com.withings.wiscale2.settings;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class o3 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f60224a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60225b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60226c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(CoroutineScope coroutineScope, SettingsViewModel settingsViewModel, com.withings.common.compose.component.z4 z4Var) {
        super(1);
        this.f60224a = coroutineScope;
        this.f60225b = settingsViewModel;
        this.f60226c = z4Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String message = str;
        kotlin.jvm.internal.u.j(message, "message");
        BuildersKt__Builders_commonKt.launch$default(this.f60224a, null, null, new n3(this.f60225b, this.f60226c, message, null), 3, null);
        return nm0.y.f85009a;
    }
}
