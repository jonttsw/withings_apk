package com.withings.wiscale2.heart;

import androidx.fragment.app.k0;
import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import java.util.List;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: HeartHistoryActivity.kt */
/* loaded from: classes5.dex */
public final class i implements ViewPager.h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartHistoryActivity f57776a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(HeartHistoryActivity heartHistoryActivity) {
        this.f57776a = heartHistoryActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
        HeartHistoryActivity heartHistoryActivity = this.f57776a;
        if (i11 == 0) {
            heartHistoryActivity.R3().f99485a.b0();
        } else {
            heartHistoryActivity.R3().f99485a.d0();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
        HeartHistoryActivity heartHistoryActivity = this.f57776a;
        HeartHistoryActivity.P3(heartHistoryActivity, i11, f11, heartHistoryActivity.V3());
        DateTime e11 = bt.a.e((heartHistoryActivity.R3().f99485a.getCurrentViewport().left + heartHistoryActivity.R3().f99485a.getCurrentViewport().right) / 2);
        u.i(e11, "getDayFromUnitAbs(...)");
        heartHistoryActivity.f57040t = e11;
        if (f11 > 0.01f && f11 < 0.99f) {
            heartHistoryActivity.R3().f99487c.a();
            List<ts.d> graphs = heartHistoryActivity.R3().f99485a.getGraphs();
            u.i(graphs, "getGraphs(...)");
            for (ts.d dVar : graphs) {
                List<rs.e> b10 = dVar.b().b();
                u.i(b10, "getAllData(...)");
                for (rs.e eVar : b10) {
                    eVar.o(false);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        DateTime dateTime;
        HeartHistoryActivity.b bVar;
        HeartHistoryActivity heartHistoryActivity = this.f57776a;
        HeartHistoryActivity.P3(heartHistoryActivity, i11, 0.0f, heartHistoryActivity.V3());
        heartHistoryActivity.f57041u = i11;
        k0 V3 = heartHistoryActivity.V3();
        if (V3 instanceof HeartHistoryActivity.d) {
            dateTime = ((HeartHistoryActivity.d) V3).getWeek(i11);
        } else if (V3 instanceof HeartHistoryActivity.c) {
            dateTime = ((HeartHistoryActivity.c) V3).a(i11);
        } else if (V3 instanceof HeartHistoryActivity.e) {
            dateTime = ((HeartHistoryActivity.e) V3).b(i11);
        } else {
            dateTime = null;
        }
        if (dateTime != null) {
            bVar = heartHistoryActivity.f57038r;
            if (bVar != null) {
                b0.V(bVar, (Period) HeartHistoryActivity.H3(heartHistoryActivity).getValue(), dateTime);
            } else {
                u.s("delegate");
                throw null;
            }
        }
    }
}
