package com.withings.wiscale2.dashboard;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: DashboardAdapters.kt */
/* loaded from: classes4.dex */
public final class w extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final View f50609a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f50610b;

    /* compiled from: DashboardAdapters.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f50611a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final x invoke() {
            return new x();
        }
    }

    public w(View view) {
        super(view);
        this.f50609a = view;
        nm0.g b10 = nm0.h.b(a.f50611a);
        this.f50610b = b10;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1987R.id.metrics_recyclerview);
        recyclerView.setAdapter((x) b10.getValue());
        zq.b.a(recyclerView, C1987R.drawable.list_divider_thick, 1);
    }

    public final void a(h hVar) {
        ((TextView) this.f50609a.findViewById(C1987R.id.metric_section_title)).setText(hVar.b());
        ((x) this.f50610b.getValue()).submitList(hVar.a());
    }
}
