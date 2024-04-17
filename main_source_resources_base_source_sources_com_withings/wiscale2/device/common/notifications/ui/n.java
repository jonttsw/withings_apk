package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f52972b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f52973c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Short> f52974d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f52975e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f52976f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f52977g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(m mVar, boolean z5, b bVar, List<Short> list, boolean z11, ym0.l<? super Boolean, nm0.y> lVar, int i11) {
        super(2);
        this.f52971a = mVar;
        this.f52972b = z5;
        this.f52973c = bVar;
        this.f52974d = list;
        this.f52975e = z11;
        this.f52976f = lVar;
        this.f52977g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52977g | 1);
        boolean z5 = this.f52975e;
        ym0.l<Boolean, nm0.y> lVar = this.f52976f;
        m.u1(this.f52971a, this.f52972b, this.f52973c, this.f52974d, z5, lVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
