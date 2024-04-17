package com.withings.environment.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.device.Device;
import com.withings.environment.data.DataAggregator;
import com.withings.environment.graph.CO2GraphPopupView;
import com.withings.environment.graph.Co2GraphView;
import com.withings.environment.graph.TemperatureGraphView;
import com.withings.environment.graph.TimeLineView;
import com.withings.util.database.SqliteDatabaseWrapper;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import jm.a;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import vh.o;
/* compiled from: WS50GraphFragment.java */
/* loaded from: classes3.dex */
public class d extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private Co2GraphView f38984c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f38985d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f38986e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f38987f;

    /* renamed from: g  reason: collision with root package name */
    private CO2GraphPopupView f38988g;

    /* renamed from: h  reason: collision with root package name */
    private TemperatureGraphView f38989h;

    /* renamed from: i  reason: collision with root package name */
    private CO2GraphPopupView f38990i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f38991j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f38992k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f38993l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f38994m;

    /* renamed from: n  reason: collision with root package name */
    private TimeLineView f38995n;

    /* renamed from: o  reason: collision with root package name */
    private Device f38996o;

    /* renamed from: p  reason: collision with root package name */
    private DateTime f38997p;

    /* renamed from: q  reason: collision with root package name */
    private a f38998q = new a(0);

    /* renamed from: r  reason: collision with root package name */
    private BlockableViewPager.b f38999r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f39000s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WS50GraphFragment.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private tq.a f39001a;

        /* renamed from: b  reason: collision with root package name */
        private tq.a f39002b;

        /* renamed from: c  reason: collision with root package name */
        private double f39003c;

        /* renamed from: d  reason: collision with root package name */
        private double f39004d;

        /* renamed from: e  reason: collision with root package name */
        private double f39005e;

        /* renamed from: f  reason: collision with root package name */
        private double f39006f;

        /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    public static a s1(d dVar) {
        dVar.getClass();
        a aVar = new a(0);
        aVar.f39001a = dVar.w1(35);
        uw.d a11 = uw.d.a();
        Device device = dVar.f38996o;
        a11.getClass();
        uw.c e11 = uw.c.e();
        SqliteDatabaseWrapper.Function function = SqliteDatabaseWrapper.Function.f46347b;
        aVar.f39003c = e11.j(device, function, 35);
        uw.d a12 = uw.d.a();
        Device device2 = dVar.f38996o;
        a12.getClass();
        uw.c e12 = uw.c.e();
        SqliteDatabaseWrapper.Function function2 = SqliteDatabaseWrapper.Function.f46346a;
        aVar.f39004d = e12.j(device2, function2, 35);
        aVar.f39002b = dVar.w1(12);
        uw.d a13 = uw.d.a();
        Device device3 = dVar.f38996o;
        a13.getClass();
        aVar.f39005e = uw.c.e().j(device3, function, 12);
        uw.d a14 = uw.d.a();
        Device device4 = dVar.f38996o;
        a14.getClass();
        aVar.f39006f = uw.c.e().j(device4, function2, 12);
        return aVar;
    }

    public static int v1(Context context, double d11) {
        if (d11 < 1000.0d) {
            return androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral1);
        }
        if (d11 < 3000.0d) {
            return androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral2);
        }
        if (d11 < 5000.0d) {
            return androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral3);
        }
        return androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral4);
    }

    private tq.a w1(int i11) {
        DateTime minus = this.f38997p.plusDays(1).minus(1L);
        uw.d a11 = uw.d.a();
        Device device = this.f38996o;
        DateTime dateTime = this.f38997p;
        a11.getClass();
        ArrayList b10 = uw.d.b(device.getId(), dateTime, minus, i11);
        DataAggregator dataAggregator = new DataAggregator();
        dataAggregator.d(b10);
        dataAggregator.f(this.f38997p.withTimeAtStartOfDay());
        dataAggregator.c(minus);
        dataAggregator.g();
        dataAggregator.e(Minutes.minutes(30));
        return dataAggregator.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1() {
        String string;
        if (!this.f39000s) {
            return;
        }
        if (this.f38998q.f39002b != null && this.f38998q.f39002b.b().size() > 0) {
            jm.a a11 = a.d.a(requireContext());
            this.f38993l.setText(a11.f(this.f38998q.f39002b.a(), 12));
            this.f38994m.setText(C1987R.string._SUMMARY_AVERAGE_);
            this.f38991j.setText(a11.f(this.f38998q.f39002b.c(), 12));
            this.f38992k.setText(a11.f(this.f38998q.f39002b.d(), 12));
            uq.a aVar = new uq.a(this.f38998q.f39002b.b());
            this.f38989h.setBaseData(this.f38998q.f39002b.b());
            this.f38989h.setMaxY(this.f38998q.f39005e);
            this.f38989h.setMinY(this.f38998q.f39006f);
            uq.c cVar = new uq.c(aVar);
            cVar.b(this.f38997p.getMillis());
            cVar.c(this.f38997p.plusDays(1).getMillis());
            c cVar2 = new c(this, this.f38990i, cVar, this.f38989h, this.f38999r);
            cVar2.b();
            this.f38989h.setCustomTouchListener(cVar2);
            this.f38989h.setGestureDetector(cVar2);
        }
        if (this.f38998q.f39001a != null && this.f38998q.f39001a.b().size() > 0) {
            Context context = this.f38985d.getContext();
            jm.a a12 = a.d.a(this.f38985d.getContext());
            double a13 = this.f38998q.f39001a.a();
            TextView textView = this.f38985d;
            if (a13 < 1000.0d) {
                string = context.getString(C1987R.string._GOOD_);
            } else if (a13 < 3000.0d) {
                string = context.getString(C1987R.string._MEDIUM_);
            } else if (a13 < 5000.0d) {
                string = context.getString(C1987R.string._BAD_);
            } else {
                string = context.getString(C1987R.string._VERY_BAD_);
            }
            textView.setText(string);
            this.f38985d.setTextColor(v1(context, a13));
            this.f38986e.setText(a12.f(this.f38998q.f39001a.c(), 35));
            this.f38986e.setTextColor(v1(context, this.f38998q.f39001a.c()));
            this.f38987f.setText(a12.f(this.f38998q.f39001a.d(), 35));
            this.f38987f.setTextColor(v1(context, this.f38998q.f39001a.d()));
            uq.a aVar2 = new uq.a(this.f38998q.f39001a.b());
            this.f38984c.setBaseData(this.f38998q.f39001a.b());
            this.f38984c.setMaxY(this.f38998q.f39003c);
            this.f38984c.setMinY(this.f38998q.f39004d);
            uq.c cVar3 = new uq.c(aVar2);
            cVar3.b(this.f38997p.getMillis());
            cVar3.c(this.f38997p.plusDays(1).getMillis());
            b bVar = new b(this, this.f38988g, cVar3, this.f38984c, this.f38999r);
            bVar.b();
            this.f38984c.setCustomTouchListener(bVar);
            this.f38984c.setGestureDetector(bVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38996o = (Device) getArguments().getSerializable("EXTRA_DEVICE");
        this.f38997p = new DateTime(getArguments().getLong("com.withings.wiscale2.extra.day_as_millis"));
        vh.h.b(this);
        o c11 = vh.h.h().c(new vq.b(this));
        c11.q(new com.withings.environment.ui.a(this));
        c11.p(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (getResources().getConfiguration().orientation == 2) {
            return layoutInflater.inflate(C1987R.layout.fragment_ws50, viewGroup, false);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        View inflate = layoutInflater.inflate(C1987R.layout.fragment_ws50, (ViewGroup) frameLayout, false);
        int k11 = ah.g.k(10, viewGroup.getContext());
        ((ViewGroup.MarginLayoutParams) inflate.getLayoutParams()).setMargins(k11, 0, k11, 0);
        frameLayout.addView(inflate);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f39000s = true;
        y1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f39000s = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f38984c = (Co2GraphView) view.findViewById(C1987R.id.airGraph);
        this.f38985d = (TextView) view.findViewById(C1987R.id.air_quality);
        this.f38986e = (TextView) view.findViewById(C1987R.id.air_max);
        this.f38987f = (TextView) view.findViewById(C1987R.id.air_min);
        this.f38988g = (CO2GraphPopupView) view.findViewById(C1987R.id.graphCo2Popup);
        this.f38989h = (TemperatureGraphView) view.findViewById(C1987R.id.temp_graph);
        this.f38990i = (CO2GraphPopupView) view.findViewById(C1987R.id.graphTemperaturePopup);
        this.f38991j = (TextView) view.findViewById(C1987R.id.t_max);
        this.f38992k = (TextView) view.findViewById(C1987R.id.t_min);
        this.f38993l = (TextView) view.findViewById(C1987R.id.t_mean);
        this.f38994m = (TextView) view.findViewById(C1987R.id.tempMode);
        TimeLineView timeLineView = (TimeLineView) view.findViewById(C1987R.id.legend);
        this.f38995n = timeLineView;
        timeLineView.setStart(this.f38997p);
        this.f38995n.setEnd(this.f38997p.plusDays(1));
        y1();
    }

    public final void x1(BlockableViewPager.a aVar) {
        this.f38999r = aVar;
    }
}
