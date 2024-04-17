package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import nm0.j;
import nm0.y;
import u10.i;
/* compiled from: ExchangeSleepWithHealthConnectRequest.kt */
/* loaded from: classes5.dex */
public final class b implements i<List<? extends j<? extends Track, ? extends List<? extends Vasistas>>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExchangeSleepWithHealthConnectWorker f56697a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ExchangeSleepWithHealthConnectWorker exchangeSleepWithHealthConnectWorker) {
        this.f56697a = exchangeSleepWithHealthConnectWorker;
    }

    @Override // u10.i
    public final Object a(List list, qm0.d dVar) {
        this.f56697a.U(list);
        return y.f85009a;
    }
}
