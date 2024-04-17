package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.heartrate.core.HeartRateDiagnostic;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.C1987R;
import jm.a;
import kotlin.NoWhenBranchMatchedException;
import org.joda.time.DateTime;
/* compiled from: HRMeasurements.kt */
/* loaded from: classes5.dex */
public final class d extends RecyclerView.z {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f57561h = 0;

    /* renamed from: a  reason: collision with root package name */
    private final View f57562a;

    /* renamed from: b  reason: collision with root package name */
    private final View f57563b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f57564c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f57565d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f57566e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f57567f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f57568g;

    /* compiled from: HRMeasurements.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            Context context = d.this.getView().getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            return a.d.a(context);
        }
    }

    public d(View view) {
        super(view);
        this.f57562a = view;
        this.f57563b = view.findViewById(C1987R.id.circle);
        this.f57564c = (TextView) view.findViewById(C1987R.id.status);
        this.f57565d = (TextView) view.findViewById(C1987R.id.date);
        this.f57566e = (TextView) view.findViewById(C1987R.id.value);
        this.f57567f = (ImageView) view.findViewById(C1987R.id.check);
        this.f57568g = nm0.h.b(new a());
    }

    public final void a(MeasuresGroup measuresGroup) {
        int i11;
        Measure measureForType = measuresGroup.getMeasureForType(11);
        HeartRateDiagnostic l5 = ah.g.l((int) measureForType.f95794y);
        View view = this.f57562a;
        Context context = view.getContext();
        if (l5 != null) {
            int ordinal = l5.ordinal();
            i11 = C1987R.color.statusGood;
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2) {
                    i11 = C1987R.color.statusModerate;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i11 = C1987R.color.statusUndefined;
        }
        this.f57563b.getBackground().setColorFilter(androidx.core.graphics.a.a(androidx.core.content.a.getColor(context, i11)));
        if (l5 != null) {
            this.f57564c.setText(ah.l.m(l5));
        }
        this.f57566e.setText(jm.a.c((jm.a) this.f57568g.getValue(), 11, measureForType.f95794y, 0, 0, 60));
        DateTime dateTime = new DateTime(measuresGroup.getDate().getTime());
        Context context2 = view.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        String t11 = b50.b.t(context2, dateTime);
        Context context3 = view.getContext();
        kotlin.jvm.internal.u.i(context3, "getContext(...)");
        this.f57565d.setText(w6.o.a(t11, " - ", wy.a.b(context3, measuresGroup)));
        this.itemView.setOnClickListener(new sg.b(measuresGroup, 17));
    }

    public final void b(boolean z5) {
        int i11;
        ImageView imageView = this.f57567f;
        kotlin.jvm.internal.u.g(imageView);
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    public final void c(boolean z5) {
        this.f57567f.setSelected(z5);
    }

    public final View getView() {
        return this.f57562a;
    }
}
