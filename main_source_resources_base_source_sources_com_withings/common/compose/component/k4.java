package com.withings.common.compose.component;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SliderWithImage.kt */
/* loaded from: classes3.dex */
public final class k4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33979a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<i4> f33980b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f33981c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f33982d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f33983e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f33984f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(int i11, int i12, int i13, androidx.compose.ui.e eVar, List list, ym0.l lVar) {
        super(2);
        this.f33979a = eVar;
        this.f33980b = list;
        this.f33981c = i11;
        this.f33982d = lVar;
        this.f33983e = i12;
        this.f33984f = i13;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33983e | 1);
        l4.a(this.f33981c, g11, this.f33984f, aVar, this.f33979a, this.f33980b, this.f33982d);
        return nm0.y.f85009a;
    }
}
