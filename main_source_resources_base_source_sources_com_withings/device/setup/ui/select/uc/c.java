package com.withings.device.setup.ui.select.uc;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LoadOnDemandModuleUseCase.kt */
/* loaded from: classes3.dex */
final class c extends w implements l<Throwable, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ id.a f37632a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ id.d f37633b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(id.a aVar, id.d dVar) {
        super(1);
        this.f37632a = aVar;
        this.f37633b = dVar;
    }

    @Override // ym0.l
    public final y invoke(Throwable th2) {
        this.f37632a.e(this.f37633b);
        return y.f85009a;
    }
}
