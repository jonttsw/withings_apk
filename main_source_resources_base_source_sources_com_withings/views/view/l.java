package com.withings.views.view;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.List;
import l70.u;
import nm0.y;
/* compiled from: SpinnerExt.kt */
/* loaded from: classes4.dex */
public final class l {
    public static final void a(Spinner spinner, List<? extends u> units, ym0.l<? super Integer, y> lVar) {
        kotlin.jvm.internal.u.j(units, "units");
        Context context = spinner.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        spinner.setAdapter((SpinnerAdapter) new p(context, units));
        spinner.setOnItemSelectedListener(new a(lVar, units));
    }

    /* compiled from: SpinnerExt.kt */
    /* loaded from: classes4.dex */
    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, y> f46765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<u> f46766b;

        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.l<? super Integer, y> lVar, List<? extends u> list) {
            this.f46765a = lVar;
            this.f46766b = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j5) {
            this.f46765a.invoke(Integer.valueOf(this.f46766b.get(i11).j()));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
