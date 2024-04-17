package com.withings.common.compose.component;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecommendedDevicesSection.kt */
/* loaded from: classes3.dex */
public final class h3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<kk.a> f33837a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33838b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<kk.a, nm0.y> f33839c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f33840d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f33841e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f33842f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(int i11, int i12, androidx.compose.ui.e eVar, String str, List list, ym0.l lVar) {
        super(2);
        this.f33837a = list;
        this.f33838b = eVar;
        this.f33839c = lVar;
        this.f33840d = str;
        this.f33841e = i11;
        this.f33842f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33841e | 1);
        i3.a(g11, this.f33842f, aVar, this.f33838b, this.f33840d, this.f33837a, this.f33839c);
        return nm0.y.f85009a;
    }
}
