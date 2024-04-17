package com.withings.wiscale2.measure.list;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: MeasureListActivity.kt */
/* loaded from: classes5.dex */
public final class k extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final View f58561a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f58562b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f58563c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f58564d;

    /* renamed from: e  reason: collision with root package name */
    private final View f58565e;

    public k(View view) {
        super(view);
        this.f58561a = view;
        View findViewById = view.findViewById(C1987R.id.time);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f58562b = (TextView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.first_value);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f58563c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.second_value);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f58564d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.separator);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f58565e = findViewById4;
    }

    public final TextView a() {
        return this.f58563c;
    }

    public final TextView b() {
        return this.f58564d;
    }

    public final View c() {
        return this.f58565e;
    }

    public final TextView d() {
        return this.f58562b;
    }

    public final View getView() {
        return this.f58561a;
    }
}
