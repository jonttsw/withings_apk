package com.withings.environment.ui;

import com.withings.environment.graph.CO2GraphPopupView;
import com.withings.environment.graph.Co2GraphView;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import org.joda.time.DateTime;
/* compiled from: WS50GraphFragment.java */
/* loaded from: classes3.dex */
final class b extends com.withings.environment.graph.a {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d f38982g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, CO2GraphPopupView cO2GraphPopupView, uq.c cVar, Co2GraphView co2GraphView, BlockableViewPager.b bVar) {
        super(cO2GraphPopupView, cVar, co2GraphView, bVar);
        this.f38982g = dVar;
    }

    @Override // com.withings.environment.graph.a
    protected final String a(rw.a aVar) {
        DateTime dateTime = new DateTime((long) aVar.f95793x);
        if (dateTime.getMinuteOfHour() == 29 || dateTime.getMinuteOfHour() == 59) {
            dateTime = dateTime.plusMinutes(1);
        }
        return String.format("%d %s (%s)", Integer.valueOf((int) aVar.f95794y), this.f38982g.getString(C1987R.string._PPM_), dateTime.toString("HH:mm"));
    }
}
