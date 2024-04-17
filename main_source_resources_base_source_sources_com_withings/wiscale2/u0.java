package com.withings.wiscale2;

import com.withings.wiscale2.b0;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class u0 implements fh0.g {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f61737a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(b0.a aVar) {
        this.f61737a = aVar;
    }

    @Override // fh0.g
    public final fh0.d a(long j5, DateTime dateTime) {
        b0.a aVar = this.f61737a;
        return new fh0.d(dateTime, j5, (lj0.h0) aVar.f50287a.W0.get(), (t00.d) aVar.f50287a.f50146c2.get(), b0.g6(aVar.f50287a));
    }
}
