package com.withings.notifications.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsSection.kt */
/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<c10.c<?>> f43143a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43144b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43145c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f43146d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(int i11, List list, ym0.l lVar, ym0.l lVar2) {
        super(2);
        this.f43143a = list;
        this.f43144b = lVar;
        this.f43145c = lVar2;
        this.f43146d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        t0.a(ah.o.g(this.f43146d | 1), aVar, this.f43143a, this.f43144b, this.f43145c);
        return nm0.y.f85009a;
    }
}
