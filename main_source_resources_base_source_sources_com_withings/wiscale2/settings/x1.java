package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class x1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60373a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f60374b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60375c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60376d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60377e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60378f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f60379g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(SettingsActivity settingsActivity, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, int i11) {
        super(2);
        this.f60373a = settingsActivity;
        this.f60374b = z5;
        this.f60375c = aVar;
        this.f60376d = aVar2;
        this.f60377e = aVar3;
        this.f60378f = aVar4;
        this.f60379g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f60379g | 1);
        ym0.a<nm0.y> aVar2 = this.f60377e;
        ym0.a<nm0.y> aVar3 = this.f60378f;
        SettingsActivity.A3(this.f60373a, this.f60374b, this.f60375c, this.f60376d, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
