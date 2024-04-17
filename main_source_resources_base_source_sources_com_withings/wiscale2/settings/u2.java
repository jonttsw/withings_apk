package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class u2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60324a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f60325b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60326c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60327d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60328e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60329f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60330g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60331h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60332i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f60333j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(SettingsActivity settingsActivity, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, k1.r0<Boolean> r0Var, com.withings.common.compose.component.z4 z4Var, SettingsViewModel settingsViewModel, int i11) {
        super(2);
        this.f60324a = settingsActivity;
        this.f60325b = z5;
        this.f60326c = aVar;
        this.f60327d = aVar2;
        this.f60328e = aVar3;
        this.f60329f = aVar4;
        this.f60330g = r0Var;
        this.f60331h = z4Var;
        this.f60332i = settingsViewModel;
        this.f60333j = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f60333j | 1);
        com.withings.common.compose.component.z4 z4Var = this.f60331h;
        SettingsViewModel settingsViewModel = this.f60332i;
        SettingsActivity.E3(this.f60324a, this.f60325b, this.f60326c, this.f60327d, this.f60328e, this.f60329f, this.f60330g, z4Var, settingsViewModel, aVar, g11);
        return nm0.y.f85009a;
    }
}
