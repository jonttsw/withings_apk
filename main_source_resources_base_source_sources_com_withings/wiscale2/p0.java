package com.withings.wiscale2;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.wiscale2.b0;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class p0 implements com.withings.wiscale2.device.common.feature.u {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f58821a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(b0.a aVar) {
        this.f58821a = aVar;
    }

    @Override // com.withings.wiscale2.device.common.feature.u
    public final com.withings.wiscale2.device.common.feature.t a(Device device, List<PlatformFeature> list, Long l5) {
        dagger.internal.d dVar;
        b0.a aVar = this.f58821a;
        dVar = aVar.f50287a.f50145c1;
        return new com.withings.wiscale2.device.common.feature.t(device, list, l5, b0.j7(aVar.f50287a), (PlatformFeatureRepository) aVar.f50287a.f50263w.get(), (com.withings.wiscale2.device.common.feature.c) dVar.get());
    }
}
