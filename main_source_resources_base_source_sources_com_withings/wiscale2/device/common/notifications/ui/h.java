package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52907a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f52908b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f52909c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<String> f52910d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f52911e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f52912f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f52913g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(m mVar, boolean z5, a aVar, List<String> list, boolean z11, ym0.l<? super Boolean, nm0.y> lVar, int i11) {
        super(2);
        this.f52907a = mVar;
        this.f52908b = z5;
        this.f52909c = aVar;
        this.f52910d = list;
        this.f52911e = z11;
        this.f52912f = lVar;
        this.f52913g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52913g | 1);
        boolean z5 = this.f52911e;
        ym0.l<Boolean, nm0.y> lVar = this.f52912f;
        m.s1(this.f52907a, this.f52908b, this.f52909c, this.f52910d, z5, lVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
