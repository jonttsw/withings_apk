package com.withings.wiscale2.device.wpa.wpa02.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.LinearLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.screen.MeasureDetailScreen;
import com.withings.periodsbar.Period;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import en0.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ky.d;
import nm0.j;
import qy.f0;
import qy.h0;
import qy.i0;
import ym0.l;
/* compiled from: AcidBaseBalanceDetailsScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/details/AcidBaseBalanceDetailsScreen;", "Lcom/withings/measure/detail/ui/screen/MeasureDetailScreen;", "", "Lqy/f0;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AcidBaseBalanceDetailsScreen implements MeasureDetailScreen<Double>, f0 {
    public static final Parcelable.Creator<AcidBaseBalanceDetailsScreen> CREATOR = new Object();

    /* compiled from: AcidBaseBalanceDetailsScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<AcidBaseBalanceDetailsScreen> {
        @Override // android.os.Parcelable.Creator
        public final AcidBaseBalanceDetailsScreen createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new AcidBaseBalanceDetailsScreen();
        }

        @Override // android.os.Parcelable.Creator
        public final AcidBaseBalanceDetailsScreen[] newArray(int i11) {
            return new AcidBaseBalanceDetailsScreen[i11];
        }
    }

    /* compiled from: AcidBaseBalanceDetailsScreen.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements l<Iterable<? extends Double>, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55087a = new w(1);

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
        return b.f55087a;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final int b0() {
        return C1987R.string.acidBaseBalance;
    }

    @Override // qy.f0
    public final j<i0, h0> c(Context context, d group) {
        String str;
        u.j(group, "group");
        ky.a c11 = ly.a.c(ConstantsWs.MEASURE_TYPE_PH, group);
        if (c11 != null) {
            double f11 = c11.f();
            int floor = (int) Math.floor(8.5d);
            i iVar = new i(5, floor, 1);
            ArrayList arrayList = new ArrayList(x.y(iVar, 10));
            en0.j it = iVar.iterator();
            while (it.hasNext()) {
                int a11 = it.a();
                if (a11 == 5) {
                    str = context.getString(C1987R.string.acidBaseBalance_low_status);
                } else if (a11 == floor) {
                    str = context.getString(C1987R.string.acidBaseBalance_high_status);
                } else {
                    str = "";
                }
                u.g(str);
                HorizontalScaleView.f fVar = new HorizontalScaleView.f(str, an0.a.b(10.0f), context.getColor(C1987R.color.blue400));
                fVar.f46633f = false;
                arrayList.add(fVar);
            }
            return new j<>(new i0(f11, ConstantsWs.MEASURE_TYPE_PH, C1987R.color.blue400, null), new h0(5.0d, Math.ceil(8.5d), an0.a.a(f11 / 0.1f), ConstantsWs.MEASURE_TYPE_PH, 0.1f, arrayList, 192));
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
        return ConstantsWs.MEASURE_TYPE_PH;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final List<Period> getPeriodList() {
        return x.V(Period.f43720e);
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final com.withings.measure.detail.ui.screen.a h3(oy.d viewBinding) {
        u.j(viewBinding, "viewBinding");
        return new com.withings.measure.detail.ui.screen.a(C1987R.string.aboutAcidBaseBalance_section, C1987R.string.AcidBaseBalance_Description_Body);
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
