package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f34097a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f34098b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f34099c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f34100d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f34101e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f34102f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f34103g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, long j5, androidx.compose.ui.e eVar, int i11, int i12, int i13, int i14) {
        super(2);
        this.f34097a = str;
        this.f34098b = j5;
        this.f34099c = eVar;
        this.f34100d = i11;
        this.f34101e = i12;
        this.f34102f = i13;
        this.f34103g = i14;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34102f | 1);
        int i11 = this.f34100d;
        int i12 = this.f34101e;
        l.f(this.f34097a, this.f34098b, this.f34099c, i11, i12, aVar, g11, this.f34103g);
        return nm0.y.f85009a;
    }
}
