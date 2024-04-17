package com.withings.wiscale2.measure.list;

import android.content.Context;
import android.widget.TextView;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.spo2.core.SpO2Status;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.spo2.Spo2Activity;
import jm.a;
import org.joda.time.DateTime;
/* compiled from: MeasureDisplayer.kt */
/* loaded from: classes5.dex */
public final class b0 extends i {

    /* renamed from: c  reason: collision with root package name */
    private final ym0.q<k, User, MeasuresGroup, nm0.y> f58527c = a.f58529a;

    /* renamed from: d  reason: collision with root package name */
    private final ym0.q<Context, User, MeasuresGroup, nm0.y> f58528d = b.f58530a;

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<k, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58529a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(k kVar, User user, MeasuresGroup measuresGroup) {
            nm0.y yVar;
            k measureItemViewHolder = kVar;
            MeasuresGroup measuresGroup2 = measuresGroup;
            kotlin.jvm.internal.u.j(measureItemViewHolder, "measureItemViewHolder");
            kotlin.jvm.internal.u.j(user, "<anonymous parameter 1>");
            kotlin.jvm.internal.u.j(measuresGroup2, "measuresGroup");
            Measure measureForType = measuresGroup2.getMeasureForType(54);
            if (measureForType != null) {
                Context context = measureItemViewHolder.itemView.getContext();
                kotlin.jvm.internal.u.g(context);
                jm.a a11 = a.d.a(context);
                new ah.m();
                SpO2Status g11 = ah.m.g(Double.valueOf(measureForType.f95794y));
                measureItemViewHolder.a().setText(jm.a.e(a11, (int) measureForType.f95794y, 0, 0, 30).toString());
                TextView b10 = measureItemViewHolder.b();
                String string = context.getString(e50.a.c(g11));
                if (ly.a.h(hy.g.a(measuresGroup2))) {
                    string = null;
                }
                if (string == null) {
                    string = "";
                }
                b10.setText(string);
                yVar = nm0.y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                Fail.h(measureForType, null);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: MeasureDisplayer.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<Context, User, MeasuresGroup, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58530a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(Context context, User user, MeasuresGroup measuresGroup) {
            Context context2 = context;
            User user2 = user;
            MeasuresGroup measureGroup = measuresGroup;
            kotlin.jvm.internal.u.j(context2, "context");
            kotlin.jvm.internal.u.j(user2, "user");
            kotlin.jvm.internal.u.j(measureGroup, "measureGroup");
            context2.startActivity(Spo2Activity.a.a(Spo2Activity.f61615q, context2, user2, new DateTime(measureGroup.getDate())));
            return nm0.y.f85009a;
        }
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<k, User, MeasuresGroup, nm0.y> d() {
        return this.f58527c;
    }

    @Override // com.withings.wiscale2.measure.list.i
    public final ym0.q<Context, User, MeasuresGroup, nm0.y> e() {
        return this.f58528d;
    }
}
