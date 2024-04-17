package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class i4 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60045a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60046b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60047c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f60048d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r8.n f60049e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ nm0.g<SettingsViewModel> f60050f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(SettingsActivity settingsActivity, k1.r0<Boolean> r0Var, com.withings.common.compose.component.z4 z4Var, k1.o1<Boolean> o1Var, r8.n nVar, nm0.g<SettingsViewModel> gVar) {
        super(4);
        this.f60045a = settingsActivity;
        this.f60046b = r0Var;
        this.f60047c = z4Var;
        this.f60048d = o1Var;
        this.f60049e = nVar;
        this.f60050f = gVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        boolean booleanValue = this.f60048d.getValue().booleanValue();
        r8.n nVar = this.f60049e;
        e4 e4Var = new e4(nVar);
        f4 f4Var = new f4(nVar);
        g4 g4Var = new g4(nVar);
        nm0.g<SettingsViewModel> gVar = this.f60050f;
        h4 h4Var = new h4(gVar.getValue());
        SettingsViewModel value = gVar.getValue();
        SettingsActivity.E3(this.f60045a, booleanValue, e4Var, f4Var, g4Var, h4Var, this.f60046b, this.f60047c, value, aVar, 151191552);
        return nm0.y.f85009a;
    }
}
