package com.withings.wiscale2.heart.bloodpressure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.s2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sections.d;
import hj0.a;
import java.util.Arrays;
import java.util.List;
import jm.a;
import org.joda.time.DateTime;
import tb0.l3;
import tb0.x3;
/* compiled from: BloodPressureAdapter.kt */
/* loaded from: classes5.dex */
public final class a extends com.withings.wiscale2.sections.d {

    /* renamed from: f  reason: collision with root package name */
    private final d f57336f;

    /* renamed from: g  reason: collision with root package name */
    private final List<a.C1035a> f57337g;

    /* compiled from: BloodPressureAdapter.kt */
    /* renamed from: com.withings.wiscale2.heart.bloodpressure.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C0746a extends d.a {

        /* renamed from: b  reason: collision with root package name */
        private final x3 f57338b;

        public C0746a(x3 x3Var) {
            super(x3Var.a());
            this.f57338b = x3Var;
        }

        public final x3 a() {
            return this.f57338b;
        }
    }

    /* compiled from: BloodPressureAdapter.kt */
    /* loaded from: classes5.dex */
    public final class b extends d.c {

        /* renamed from: b  reason: collision with root package name */
        private final l3 f57339b;

        public b(l3 l3Var) {
            super(l3Var.a());
            this.f57339b = l3Var;
        }

        public final l3 a() {
            return this.f57339b;
        }
    }

    /* compiled from: BloodPressureAdapter.kt */
    /* loaded from: classes5.dex */
    public final class c extends d.C0768d {

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int f57340e = 0;

        /* renamed from: c  reason: collision with root package name */
        private final d80.b f57341c;

        public c(d80.b bVar) {
            super(bVar.a());
            this.f57341c = bVar;
        }

        public final void a(MeasuresGroup measuresGroup) {
            int i11;
            d80.b bVar = this.f57341c;
            bVar.f63580b.setText(String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf((int) measuresGroup.getMeasureForType(10).f95794y), Integer.valueOf((int) measuresGroup.getMeasureForType(9).f95794y)}, 2)));
            Measure measureForType = measuresGroup.getMeasureForType(11);
            TextView secondValue = bVar.f63581c;
            kotlin.jvm.internal.u.i(secondValue, "secondValue");
            if (measureForType != null) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            secondValue.setVisibility(i11);
            if (measureForType != null) {
                Context context = bVar.a().getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                secondValue.setText(a.d.a(context).f(measureForType.f95794y, measureForType.getType()));
            }
            DateTime dateTime = new DateTime(measuresGroup.getDate().getTime());
            Context context2 = this.itemView.getContext();
            kotlin.jvm.internal.u.i(context2, "getContext(...)");
            bVar.f63583e.setText(b50.b.m(dateTime, context2, false, 6));
            this.itemView.setOnClickListener(new ea0.a(a.this, this, measuresGroup, 1));
        }

        public final d80.b b() {
            return this.f57341c;
        }
    }

    /* compiled from: BloodPressureAdapter.kt */
    /* loaded from: classes5.dex */
    public interface d {
        void r1(c cVar, MeasuresGroup measuresGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(d listener, List<? extends a.C1035a> sections) {
        kotlin.jvm.internal.u.j(listener, "listener");
        kotlin.jvm.internal.u.j(sections, "sections");
        this.f57336f = listener;
        this.f57337g = sections;
    }

    @Override // com.withings.wiscale2.sections.d
    public final boolean e(int i11) {
        if (i11 != 0) {
            return true;
        }
        return false;
    }

    @Override // com.withings.wiscale2.sections.d
    public final int h(int i11) {
        if (i11 == 0) {
            return 0;
        }
        return this.f57337g.get(i11).b().size();
    }

    @Override // com.withings.wiscale2.sections.d
    public final int i() {
        return this.f57337g.size();
    }

    @Override // com.withings.wiscale2.sections.d
    public final void m(d.a viewHolder, int i11) {
        int i12;
        kotlin.jvm.internal.u.j(viewHolder, "viewHolder");
        View separator = ((C0746a) viewHolder).a().f99633b;
        kotlin.jvm.internal.u.i(separator, "separator");
        if (i11 == 0) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        separator.setVisibility(i12);
    }

    @Override // com.withings.wiscale2.sections.d
    public final void n(d.c viewHolder, int i11) {
        kotlin.jvm.internal.u.j(viewHolder, "viewHolder");
        ((b) viewHolder).a().f99317b.setTitle(this.f57337g.get(i11).c());
    }

    @Override // com.withings.wiscale2.sections.d
    public final void o(d.C0768d viewHolder, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.u.j(viewHolder, "viewHolder");
        c cVar = (c) viewHolder;
        View separator = cVar.b().f63582d;
        kotlin.jvm.internal.u.i(separator, "separator");
        if (i12 == 0) {
            i13 = 4;
        } else {
            i13 = 0;
        }
        separator.setVisibility(i13);
        a.c cVar2 = this.f57337g.get(i11).b().get(i12);
        kotlin.jvm.internal.u.h(cVar2, "null cannot be cast to non-null type com.withings.wiscale2.utils.sectionedrecyclerview.SectionnableMeasureGroup");
        MeasuresGroup b10 = ((hj0.b) cVar2).b();
        kotlin.jvm.internal.u.i(b10, "getMeasuresGroup(...)");
        cVar.a(b10);
    }

    @Override // com.withings.wiscale2.sections.d
    public final d.a p(ViewGroup parent) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new C0746a(x3.b(LayoutInflater.from(parent.getContext()), parent));
    }

    @Override // com.withings.wiscale2.sections.d
    public final d.c q(ViewGroup parent) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new b(l3.b(LayoutInflater.from(parent.getContext()), parent));
    }

    @Override // com.withings.wiscale2.sections.d
    public final d.C0768d r(ViewGroup parent) {
        kotlin.jvm.internal.u.j(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(C1987R.layout.list_item_measure, parent, false);
        int i11 = C1987R.id.first_value;
        TextView textView = (TextView) s2.g(inflate, C1987R.id.first_value);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i11 = C1987R.id.guideline_middle;
            if (((Guideline) s2.g(inflate, C1987R.id.guideline_middle)) != null) {
                i11 = C1987R.id.second_value;
                TextView textView2 = (TextView) s2.g(inflate, C1987R.id.second_value);
                if (textView2 != null) {
                    i11 = C1987R.id.separator;
                    View g11 = s2.g(inflate, C1987R.id.separator);
                    if (g11 != null) {
                        i11 = C1987R.id.time;
                        TextView textView3 = (TextView) s2.g(inflate, C1987R.id.time);
                        if (textView3 != null) {
                            return new c(new d80.b(constraintLayout, textView, textView2, g11, textView3));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
