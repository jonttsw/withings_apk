package com.withings.wiscale2.settings;

import androidx.compose.runtime.a;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class f3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60000a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60001b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60002c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(SettingsViewModel settingsViewModel, ym0.a<nm0.y> aVar, SettingsActivity settingsActivity) {
        super(4);
        this.f60000a = settingsViewModel;
        this.f60001b = aVar;
        this.f60002c = settingsActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        Object a11 = androidx.camera.camera2.internal.q2.a(aVar2, 773894976, -492369756);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
        }
        aVar2.J();
        CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
        aVar2.J();
        com.withings.common.compose.component.z4 b10 = com.withings.common.compose.component.x4.b(aVar2);
        wk.m0.a(null, null, b10, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, -1503925795, new e3(b10, this.f60002c, this.f60000a, this.f60001b, a12)), aVar2, 0, 805306368, 524283);
        return nm0.y.f85009a;
    }
}
