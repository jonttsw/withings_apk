package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class q4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f60263a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60264b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60265c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60266d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60267e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f60268f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ nm0.g<SettingsViewModel> f60269g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(k1.r0 r0Var, k1.r0 r0Var2, k1.r0 r0Var3, r8.n nVar, com.withings.common.compose.component.z4 z4Var, SettingsActivity settingsActivity, nm0.g gVar) {
        super(2);
        this.f60263a = nVar;
        this.f60264b = r0Var;
        this.f60265c = settingsActivity;
        this.f60266d = r0Var2;
        this.f60267e = z4Var;
        this.f60268f = r0Var3;
        this.f60269g = gVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String value = this.f60264b.getValue();
            com.withings.common.compose.component.z4 z4Var = this.f60267e;
            SettingsActivity settingsActivity = this.f60265c;
            k1.r0<Boolean> r0Var = this.f60266d;
            k1.r0<String> r0Var2 = this.f60264b;
            k1.o1<Boolean> o1Var = this.f60268f;
            r8.n nVar = this.f60263a;
            androidx.navigation.compose.s.b(nVar, value, null, null, null, c4.f59945a, d4.f59966a, null, null, new p4(r0Var, r0Var2, o1Var, nVar, z4Var, settingsActivity, this.f60269g), aVar2, 1769480, 412);
            eh.b.a(this.f60263a, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
