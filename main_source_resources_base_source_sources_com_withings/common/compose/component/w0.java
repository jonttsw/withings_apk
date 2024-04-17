package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorProgramDetail.kt */
/* loaded from: classes3.dex */
public final class w0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f34889a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f34890b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f34891c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f34892d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f34893e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i11, int i12, androidx.compose.ui.e eVar, String str, String str2) {
        super(2);
        this.f34889a = str;
        this.f34890b = str2;
        this.f34891c = eVar;
        this.f34892d = i11;
        this.f34893e = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34892d | 1);
        x0.a(g11, this.f34893e, aVar, this.f34891c, this.f34889a, this.f34890b);
        return nm0.y.f85009a;
    }
}
