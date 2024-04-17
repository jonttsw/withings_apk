package com.withings.wiscale2.bodytemperature.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.fever.core.model.FeverLevel;
import com.withings.fever.ui.r0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.screen.MeasureDetailScreen;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.list.MeasureListActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ky.d;
import nm0.j;
import org.joda.time.DateTime;
import qy.f0;
import qy.h0;
import qy.i0;
import ym0.l;
import ym0.p;
/* compiled from: BodyTemperatureMeasureDetailScreen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/bodytemperature/data/BodyTemperatureMeasureDetailScreen;", "Lcom/withings/measure/detail/ui/screen/MeasureDetailScreen;", "", "Lqy/f0;", "Lry/c;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyTemperatureMeasureDetailScreen implements MeasureDetailScreen<Double>, f0, ry.c {
    public static final Parcelable.Creator<BodyTemperatureMeasureDetailScreen> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final User f50292a;

    /* renamed from: b  reason: collision with root package name */
    private final yr.a f50293b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50294c;

    /* compiled from: BodyTemperatureMeasureDetailScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator<BodyTemperatureMeasureDetailScreen> {
        @Override // android.os.Parcelable.Creator
        public final BodyTemperatureMeasureDetailScreen createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new BodyTemperatureMeasureDetailScreen((User) parcel.readParcelable(BodyTemperatureMeasureDetailScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BodyTemperatureMeasureDetailScreen[] newArray(int i11) {
            return new BodyTemperatureMeasureDetailScreen[i11];
        }
    }

    /* compiled from: BodyTemperatureMeasureDetailScreen.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements p<Double, DateTime, j<? extends i0, ? extends h0>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50296b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(2);
            this.f50296b = context;
        }

        @Override // ym0.p
        public final j<? extends i0, ? extends h0> invoke(Double d11, DateTime dateTime) {
            double doubleValue = d11.doubleValue();
            DateTime date = dateTime;
            u.j(date, "date");
            BodyTemperatureMeasureDetailScreen bodyTemperatureMeasureDetailScreen = BodyTemperatureMeasureDetailScreen.this;
            yr.a aVar = bodyTemperatureMeasureDetailScreen.f50293b;
            DateTime f11 = bodyTemperatureMeasureDetailScreen.f50292a.f();
            u.i(f11, "getBirthDate(...)");
            DateTime dateTime2 = new DateTime(date);
            aVar.getClass();
            zr.a a11 = yr.a.a(f11, dateTime2);
            Map j5 = s0.j(new j(FeverLevel.f39196a, Integer.valueOf(a11.h())), new j(FeverLevel.f39197b, Integer.valueOf(a11.g())), new j(FeverLevel.f39198c, Integer.valueOf(a11.c())));
            ArrayList arrayList = new ArrayList(j5.size());
            Iterator it = j5.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                Context context = this.f50296b;
                if (hasNext) {
                    Map.Entry entry = (Map.Entry) it.next();
                    arrayList.add(new HorizontalScaleView.f(context.getString(r0.d((FeverLevel) entry.getKey())), ((Number) entry.getValue()).intValue(), androidx.core.content.a.getColor(context, r0.c((FeverLevel) entry.getKey()))));
                } else {
                    int a12 = an0.a.a(doubleValue / 0.1f);
                    FeverLevel b10 = a11.b(doubleValue);
                    return new j<>(new i0(doubleValue, 71, r0.c(b10), context.getString(r0.d(b10))), new h0(36.0d, 41.0d, a12, 71, 0.1f, arrayList, 192));
                }
            }
        }
    }

    /* compiled from: BodyTemperatureMeasureDetailScreen.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements l<Iterable<? extends Double>, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f50297a = new w(1);

        @Override // ym0.l
        public final Double invoke(Iterable<? extends Double> iterable) {
            Iterable<? extends Double> it = iterable;
            u.j(it, "it");
            return x.Z(it);
        }
    }

    public BodyTemperatureMeasureDetailScreen(User user) {
        u.j(user, "user");
        this.f50292a = user;
        this.f50293b = new yr.a();
        this.f50294c = ConstantsWs.SUBCATEGORY_FEATURE_BODY_TEMPERATURE;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final String C2(Context context, d group, jm.a aVar) {
        Double d11;
        Object obj;
        u.j(group, "group");
        ky.a c11 = ly.a.c(71, group);
        if (c11 != null) {
            d11 = Double.valueOf(c11.f());
        } else {
            d11 = null;
        }
        if (d11 != null) {
            obj = jm.a.c(aVar, 71, d11.doubleValue(), 0, 0, 60);
        } else {
            obj = "";
        }
        String string = context.getString(C1987R.string._NEWSFEED_SOCIAL_TEMPERATURE_, obj);
        u.i(string, "getString(...)");
        return string;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final void E0(List<d> groups, oy.d viewBinding) {
        Double d11;
        u.j(groups, "groups");
        u.j(viewBinding, "viewBinding");
        if (!groups.isEmpty()) {
            d dVar = (d) x.K(groups);
            if (dVar != null) {
                LinearLayout detailHeader = viewBinding.f90082c;
                u.i(detailHeader, "detailHeader");
                d(detailHeader, dVar);
                DefinitionView sectionLearnMore = viewBinding.f90087h;
                u.i(sectionLearnMore, "sectionLearnMore");
                ky.a c11 = ly.a.c(71, dVar);
                if (c11 != null) {
                    d11 = Double.valueOf(c11.f());
                } else {
                    d11 = null;
                }
                cr.a.a(new j(d11, dVar.c()), new com.withings.wiscale2.bodytemperature.data.b(this, sectionLearnMore));
            }
            AddDetailsView addDetailsView = viewBinding.f90080a;
            u.i(addDetailsView, "addDetailsView");
            addDetailsView.setVisibility(0);
        }
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final l<Iterable<? extends Double>, Double> I0() {
        return c.f50297a;
    }

    @Override // ry.c
    public final String b(Context context, ry.a calendarDayViewDatum, jm.a measureFormatter) {
        double d11;
        u.j(context, "context");
        u.j(calendarDayViewDatum, "calendarDayViewDatum");
        u.j(measureFormatter, "measureFormatter");
        String string = context.getString(C1987R.string._MAXIMUM_);
        Double d12 = calendarDayViewDatum.d();
        if (d12 != null) {
            d11 = d12.doubleValue();
        } else {
            d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        SpannableStringBuilder c11 = jm.a.c(measureFormatter, 71, d11, 0, 0, 60);
        return string + ": " + ((Object) c11);
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final int b0() {
        return C1987R.string._BODY_TEMPERATURE_;
    }

    @Override // qy.f0
    public final j<i0, h0> c(Context context, d group) {
        Double d11;
        u.j(group, "group");
        ky.a c11 = ly.a.c(71, group);
        if (c11 != null) {
            d11 = Double.valueOf(c11.f());
        } else {
            d11 = null;
        }
        return (j) cr.a.a(new j(d11, group.c()), new b(context));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ry.c
    public final Integer e(Double d11, DateTime date) {
        u.j(date, "date");
        if (d11 == null || u.b(d11)) {
            d11 = null;
        }
        if (d11 == null) {
            return null;
        }
        double doubleValue = d11.doubleValue();
        DateTime f11 = this.f50292a.f();
        u.i(f11, "getBirthDate(...)");
        this.f50293b.getClass();
        return Integer.valueOf(r0.c(yr.a.a(f11, date).b(doubleValue)));
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f50294c;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final int getMeasureType() {
        return 71;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final List<Period> getPeriodList() {
        return x.W(Period.f43720e, Period.f43723h);
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final com.withings.measure.detail.ui.screen.a h3(oy.d viewBinding) {
        u.j(viewBinding, "viewBinding");
        return null;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final boolean l3() {
        return true;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final void s0() {
        Period.a aVar = Period.f43718c;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final Intent v0(Context context) {
        MeasureListActivity.f58492n.getClass();
        return MeasureListActivity.a.a(context, this.f50292a.q(), new int[]{71}, C1987R.string._TEMPERATURE_);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeParcelable(this.f50292a, i11);
    }
}
