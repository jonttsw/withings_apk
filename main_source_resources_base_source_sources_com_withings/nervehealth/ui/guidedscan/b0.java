package com.withings.nervehealth.ui.guidedscan;

import com.withings.common.compose.component.z4;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanScreen.kt */
/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f42587a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z4 f42588b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeviceWithVideoMedia.a f42589c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42590d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42591e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42592f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42593g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42594h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f42595i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z5, z4 z4Var, DeviceWithVideoMedia.a aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, ym0.a<nm0.y> aVar6, int i11) {
        super(2);
        this.f42587a = z5;
        this.f42588b = z4Var;
        this.f42589c = aVar;
        this.f42590d = aVar2;
        this.f42591e = aVar3;
        this.f42592f = aVar4;
        this.f42593g = aVar5;
        this.f42594h = aVar6;
        this.f42595i = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42595i | 1);
        ym0.a<nm0.y> aVar2 = this.f42593g;
        ym0.a<nm0.y> aVar3 = this.f42594h;
        v.d(this.f42587a, this.f42588b, this.f42589c, this.f42590d, this.f42591e, this.f42592f, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
