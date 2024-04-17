package com.withings.wiscale2.vo2max.view;

import android.view.View;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.wiscale2.C1987R;
/* compiled from: Vo2maxNote.kt */
/* loaded from: classes5.dex */
public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.d0 f62880a;

    /* renamed from: b  reason: collision with root package name */
    private final AddDetailsView f62881b;

    /* renamed from: c  reason: collision with root package name */
    private a2 f62882c;

    /* compiled from: Vo2maxNote.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            y1.this.f62881b.setText(str);
            return nm0.y.f85009a;
        }
    }

    public y1(View view, androidx.lifecycle.d0 lifeCycleOwner) {
        kotlin.jvm.internal.u.j(lifeCycleOwner, "lifeCycleOwner");
        kotlin.jvm.internal.u.j(view, "view");
        this.f62880a = lifeCycleOwner;
        this.f62881b = (AddDetailsView) view.findViewById(C1987R.id.section_notes);
    }

    public final void c(a2 a2Var) {
        this.f62882c = a2Var;
        xw.d.c(this.f62880a, a2Var.i0(), new a());
        this.f62881b.setListener(new x1(this));
    }
}
