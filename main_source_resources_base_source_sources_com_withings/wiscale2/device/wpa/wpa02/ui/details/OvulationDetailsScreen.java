package com.withings.wiscale2.device.wpa.wpa02.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.LinearLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.screen.MeasureDetailScreen;
import com.withings.periodsbar.Period;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import en0.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ky.d;
import nm0.j;
import qy.f0;
import qy.h0;
import qy.i0;
import ym0.l;
/* compiled from: OvulationDetailsScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/details/OvulationDetailsScreen;", "Lcom/withings/measure/detail/ui/screen/MeasureDetailScreen;", "", "Lqy/f0;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class OvulationDetailsScreen implements MeasureDetailScreen<Double>, f0 {
    public static final Parcelable.Creator<OvulationDetailsScreen> CREATOR = new Object();

    /* compiled from: OvulationDetailsScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<OvulationDetailsScreen> {
        @Override // android.os.Parcelable.Creator
        public final OvulationDetailsScreen createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new OvulationDetailsScreen();
        }

        @Override // android.os.Parcelable.Creator
        public final OvulationDetailsScreen[] newArray(int i11) {
            return new OvulationDetailsScreen[i11];
        }
    }

    /* compiled from: OvulationDetailsScreen.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements l<Iterable<? extends Double>, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55096a = new w(1);

        @Override // ym0.l
        public final Double invoke(Iterable<? extends Double> iterable) {
            Iterable<? extends Double> it = iterable;
            u.j(it, "it");
            return (Double) x.J(it);
        }
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final String C2(Context context, d group, jm.a aVar) {
        u.j(group, "group");
        return "";
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final void E0(List<d> groups, oy.d viewBinding) {
        u.j(groups, "groups");
        u.j(viewBinding, "viewBinding");
        if (!groups.isEmpty()) {
            LinearLayout detailHeader = viewBinding.f90082c;
            u.i(detailHeader, "detailHeader");
            d(detailHeader, (d) x.I(groups));
        }
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final l<Iterable<? extends Double>, Double> I0() {
        return b.f55096a;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final int b0() {
        return C1987R.string.ovulation_metric_title;
    }

    @Override // qy.f0
    public final j<i0, h0> c(Context context, d group) {
        int i11;
        u.j(group, "group");
        ky.a c11 = ly.a.c(ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE, group);
        if (c11 != null) {
            double e11 = r.e(c11.f(), 60.0d);
            Map j5 = s0.j(new j(Integer.valueOf((int) C1987R.string.ovulation_status_negative), Integer.valueOf((int) C1987R.color.datavizDiverging7)), new j(Integer.valueOf((int) C1987R.string.ovulation_status_positive), Integer.valueOf((int) C1987R.color.datavizDiverging9)));
            ArrayList arrayList = new ArrayList(j5.size());
            for (Map.Entry entry : j5.entrySet()) {
                arrayList.add(new HorizontalScaleView.f(context.getString(((Number) entry.getKey()).intValue()), 30, context.getColor(((Number) entry.getValue()).intValue())));
            }
            h0 h0Var = new h0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 60.0d, (int) e11, ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE, 0.0f, arrayList, 16);
            if (e11 > 30.0d) {
                i11 = C1987R.color.datavizDiverging9;
            } else {
                i11 = C1987R.color.datavizDiverging7;
            }
            return new j<>(new i0(e11, ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE, i11, null), h0Var);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // py.a
    public final /* bridge */ /* synthetic */ String getAnalyticsDetailsViewIdentifier() {
        return null;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final int getMeasureType() {
        return ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final List<Period> getPeriodList() {
        return x.V(Period.f43720e);
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final com.withings.measure.detail.ui.screen.a h3(oy.d viewBinding) {
        u.j(viewBinding, "viewBinding");
        return new com.withings.measure.detail.ui.screen.a(C1987R.string.ovulation_about_title, C1987R.string.ovulation_about_description);
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final void s0() {
        Period.a aVar = Period.f43718c;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final Intent v0(Context context) {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(1);
    }
}
