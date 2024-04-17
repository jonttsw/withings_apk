package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import nm0.j;
import nm0.y;
import u10.i;
/* compiled from: ExchangeActivityWithHealthConnectRequest.kt */
/* loaded from: classes5.dex */
public final class a implements i<List<? extends j<? extends Track, ? extends List<? extends Vasistas>>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExchangeActivityWithHealthConnectWorker f56696a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ExchangeActivityWithHealthConnectWorker exchangeActivityWithHealthConnectWorker) {
        this.f56696a = exchangeActivityWithHealthConnectWorker;
    }

    @Override // u10.i
    public final Object a(List list, qm0.d dVar) {
        List<j> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (j jVar : list2) {
            arrayList.add((Track) jVar.a());
        }
        this.f56696a.T(arrayList);
        return y.f85009a;
    }
}
