package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpandableText.kt */
/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33541a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f33542b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f33543c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33544d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f33545e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f33546f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(int i11, int i12, int i13, androidx.compose.ui.e eVar, String str, ym0.a aVar) {
        super(2);
        this.f33541a = eVar;
        this.f33542b = str;
        this.f33543c = i11;
        this.f33544d = aVar;
        this.f33545e = i12;
        this.f33546f = i13;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33545e | 1);
        g1.a(this.f33543c, g11, this.f33546f, aVar, this.f33541a, this.f33542b, this.f33544d);
        return nm0.y.f85009a;
    }
}
