package com.withings.environment.ui;

import androidx.camera.camera2.internal.p2;
import com.withings.environment.graph.CO2GraphPopupView;
import com.withings.environment.graph.TemperatureGraphView;
import com.withings.views.view.BlockableViewPager;
import jm.a;
import org.joda.time.DateTime;
/* compiled from: WS50GraphFragment.java */
/* loaded from: classes3.dex */
final class c extends com.withings.environment.graph.a {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d f38983g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, CO2GraphPopupView cO2GraphPopupView, uq.c cVar, TemperatureGraphView temperatureGraphView, BlockableViewPager.b bVar) {
        super(cO2GraphPopupView, cVar, temperatureGraphView, bVar);
        this.f38983g = dVar;
    }

    @Override // com.withings.environment.graph.a
    protected final String a(rw.a aVar) {
        DateTime dateTime = new DateTime((long) aVar.f95793x);
        if (dateTime.getMinuteOfHour() == 29 || dateTime.getMinuteOfHour() == 59) {
            dateTime = dateTime.plusMinutes(1);
        }
        return p2.c(a.d.a(this.f38983g.requireContext()).f(aVar.f95794y, 12), " (", dateTime.toString("HH:mm"), ")");
    }
}
