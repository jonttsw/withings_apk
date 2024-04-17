package com.withings.wiscale2.spo2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.spo2.core.SpO2Status;
import com.withings.wiscale2.C1987R;
import ji0.c0;
import jm.a;
import org.joda.time.DateTime;
/* compiled from: Spo2Measurements.kt */
/* loaded from: classes5.dex */
public final class v extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final View f61692a;

    /* renamed from: b  reason: collision with root package name */
    private final View f61693b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f61694c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f61695d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f61696e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f61697f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f61698g;

    /* compiled from: Spo2Measurements.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            Context context = v.this.getView().getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            return a.d.a(context);
        }
    }

    public v(View view) {
        super(view);
        this.f61692a = view;
        this.f61693b = view.findViewById(C1987R.id.circle);
        this.f61694c = (TextView) view.findViewById(C1987R.id.status);
        this.f61695d = (TextView) view.findViewById(C1987R.id.date);
        this.f61696e = (TextView) view.findViewById(C1987R.id.value);
        this.f61697f = (ImageView) view.findViewById(C1987R.id.check);
        this.f61698g = nm0.h.b(new a());
    }

    private final void b(c0 c0Var) {
        new ah.m();
        SpO2Status g11 = ah.m.g(Double.valueOf(c0Var.c()));
        this.f61693b.getBackground().setColorFilter(androidx.core.graphics.a.a(androidx.core.content.a.getColor(this.f61692a.getContext(), e50.a.a(g11, c0Var.d()))));
        String b10 = zq.b.b(this, e50.a.c(g11));
        if (c0Var.d()) {
            b10 = null;
        }
        CharSequence charSequence = "--";
        if (b10 == null) {
            b10 = "--";
        }
        this.f61694c.setText(b10);
        if (c0Var.c() >= 0) {
            charSequence = jm.a.e((jm.a) this.f61698g.getValue(), c0Var.c(), 0, 0, 30);
        }
        this.f61696e.setText(charSequence);
    }

    public final void a(c0 c0Var) {
        boolean z5 = c0Var instanceof c0.b;
        TextView textView = this.f61695d;
        if (z5) {
            c0.b bVar = (c0.b) c0Var;
            b(bVar);
            DateTime dateTime = new DateTime(bVar.b());
            Context context = textView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            String t11 = b50.b.t(context, dateTime);
            String string = this.f61692a.getContext().getString(C1987R.string.spo2_detail_measurements_manual_subtext);
            textView.setText(t11 + string);
        } else if (c0Var instanceof c0.a) {
            c0.a aVar = (c0.a) c0Var;
            b(aVar);
            DateTime dateTime2 = new DateTime(aVar.b());
            Context context2 = textView.getContext();
            kotlin.jvm.internal.u.i(context2, "getContext(...)");
            textView.setText(b50.b.t(context2, dateTime2));
        }
    }

    public final void c(boolean z5) {
        int i11;
        ImageView imageView = this.f61697f;
        kotlin.jvm.internal.u.g(imageView);
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    public final void d(boolean z5) {
        this.f61697f.setSelected(z5);
    }

    public final View getView() {
        return this.f61692a;
    }
}
