package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrivacyAndLegals.kt */
/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f59994a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ qk.a f59995b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f59996c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.p<String, String, nm0.y> f59997d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f59998e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f1(String str, qk.a aVar, String str2, ym0.p<? super String, ? super String, nm0.y> pVar, int i11) {
        super(2);
        this.f59994a = str;
        this.f59995b = aVar;
        this.f59996c = str2;
        this.f59997d = pVar;
        this.f59998e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59998e | 1);
        String str = this.f59996c;
        ym0.p<String, String, nm0.y> pVar = this.f59997d;
        c1.f(this.f59994a, this.f59995b, str, pVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
