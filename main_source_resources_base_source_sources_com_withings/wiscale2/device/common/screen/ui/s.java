package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f53418a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<String> f53419b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53420c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53421d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f53422e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, List<String> list, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f53418a = str;
        this.f53419b = list;
        this.f53420c = aVar;
        this.f53421d = aVar2;
        this.f53422e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53422e | 1);
        ym0.a<nm0.y> aVar2 = this.f53420c;
        ym0.a<nm0.y> aVar3 = this.f53421d;
        w1.a(this.f53418a, this.f53419b, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
