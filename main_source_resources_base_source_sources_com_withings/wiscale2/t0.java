package com.withings.wiscale2;

import com.withings.core.data.aggregate.GetStepsUseCase;
import com.withings.target.data.TargetRepository;
import com.withings.wiscale2.b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class t0 implements x90.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f61722a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(b0.a aVar) {
        this.f61722a = aVar;
    }

    @Override // x90.b
    public final x90.a a(TargetRepository targetRepository) {
        b0.a aVar = this.f61722a;
        return new x90.a(gk0.c.a(aVar.f50287a.f50131a), (xw.b) aVar.f50287a.K0.get(), (GetStepsUseCase) aVar.f50287a.f50135a3.get(), (m70.i) aVar.f50287a.f50258v0.get(), targetRepository);
    }
}
