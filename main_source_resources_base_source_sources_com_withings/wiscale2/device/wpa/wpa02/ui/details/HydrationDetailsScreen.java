package com.withings.wiscale2.device.wpa.wpa02.ui.details;

import ah.o;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.u0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.t;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.screen.MeasureDetailScreen;
import com.withings.periodsbar.Period;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpa.wpa02.model.HydrationStatus;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.q;
import l0.r;
import nk.a0;
import nm0.j;
import nm0.y;
import qy.f0;
import qy.h0;
import qy.i0;
import r0.d0;
import yk.h;
import ym0.l;
import ym0.p;
/* compiled from: HydrationDetailsScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/ui/details/HydrationDetailsScreen;", "Lcom/withings/measure/detail/ui/screen/MeasureDetailScreen;", "", "Lqy/f0;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HydrationDetailsScreen implements MeasureDetailScreen<Double>, f0 {
    public static final Parcelable.Creator<HydrationDetailsScreen> CREATOR = new Object();

    /* compiled from: HydrationDetailsScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<HydrationDetailsScreen> {
        @Override // android.os.Parcelable.Creator
        public final HydrationDetailsScreen createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return new HydrationDetailsScreen();
        }

        @Override // android.os.Parcelable.Creator
        public final HydrationDetailsScreen[] newArray(int i11) {
            return new HydrationDetailsScreen[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HydrationDetailsScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecimalFormat f55088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f55089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k3.d f55090c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList<HorizontalScaleView.f> f55091d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(double d11, k3.d dVar, DecimalFormat decimalFormat, ArrayList arrayList) {
            super(2);
            this.f55088a = decimalFormat;
            this.f55089b = d11;
            this.f55090c = dVar;
            this.f55091d = arrayList;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            HydrationStatus hydrationStatus;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = e.f8927a;
                e f11 = x0.f(e1.e(aVar3, 1.0f), h.o());
                aVar2.s(-483455358);
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(f11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    a0.i(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string.specificgravity_metric_title, aVar2));
                    d0.a(e1.f(aVar3, h.d()), aVar2);
                    DecimalFormat decimalFormat = this.f55088a;
                    double d11 = this.f55089b;
                    String format = decimalFormat.format(d11);
                    u.i(format, "format(...)");
                    a0.g(0, 0, 29, 0L, aVar2, null, null, format);
                    androidx.compose.ui.viewinterop.d.a(new com.withings.wiscale2.device.wpa.wpa02.ui.details.a(d11, this.f55090c, decimalFormat, this.f55091d), e1.e(aVar3, 1.0f), null, aVar2, 48, 4);
                    if (d11 <= 1.005d) {
                        hydrationStatus = HydrationStatus.f55070f;
                    } else if (d11 < 1.02d) {
                        hydrationStatus = HydrationStatus.f55069e;
                    } else {
                        hydrationStatus = HydrationStatus.f55068d;
                    }
                    nk.a.d(null, ay.b.u(hydrationStatus.b(), aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HydrationDetailsScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f55093b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(double d11, int i11) {
            super(2);
            this.f55093b = d11;
            this.f55094c = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f55094c | 1);
            HydrationDetailsScreen.this.b(this.f55093b, aVar, g11);
            return y.f85009a;
        }
    }

    /* compiled from: HydrationDetailsScreen.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements l<Iterable<? extends Double>, Double> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f55095a = new w(1);

        @Override // ym0.l
        public final Double invoke(Iterable<? extends Double> iterable) {
            Iterable<? extends Double> it = iterable;
            u.j(it, "it");
            return (Double) x.J(it);
        }
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final String C2(Context context, ky.d group, jm.a aVar) {
        u.j(group, "group");
        return "";
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final void E0(List<ky.d> groups, oy.d viewBinding) {
        u.j(groups, "groups");
        u.j(viewBinding, "viewBinding");
        if (((ky.d) x.K(groups)) != null) {
            LinearLayout detailHeader = viewBinding.f90082c;
            u.i(detailHeader, "detailHeader");
            d(detailHeader, (ky.d) x.I(groups));
            ComposeView sectionExplanations = viewBinding.f90086g;
            u.i(sectionExplanations, "sectionExplanations");
            ky.a c11 = ly.a.c(ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY, (ky.d) x.I(groups));
            if (c11 != null) {
                double f11 = c11.f();
                sectionExplanations.setVisibility(0);
                sectionExplanations.setContent(new s1.a(true, -1541354010, new com.withings.wiscale2.device.wpa.wpa02.ui.details.c(this, f11)));
            }
        }
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final l<Iterable<? extends Double>, Double> I0() {
        return d.f55095a;
    }

    public final void b(double d11, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(-310229028);
        if ((i11 & 14) == 0) {
            if (g11.W(d11)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            Context context = (Context) g11.D(u0.d());
            k3.d dVar = (k3.d) g11.D(n1.e());
            DecimalFormat decimalFormat = new DecimalFormat("0.000");
            g11.s(-1782228484);
            ArrayList arrayList = new ArrayList();
            HydrationStatus hydrationStatus = HydrationStatus.f55070f;
            HorizontalScaleView.f fVar = new HorizontalScaleView.f(ay.b.u(hydrationStatus.d(), g11), 5, context.getColor(hydrationStatus.a()));
            fVar.f46631d = 5;
            arrayList.add(fVar);
            HydrationStatus hydrationStatus2 = HydrationStatus.f55069e;
            HorizontalScaleView.f fVar2 = new HorizontalScaleView.f(ay.b.u(hydrationStatus2.d(), g11), 15, context.getColor(hydrationStatus2.a()));
            fVar2.f46631d = 15;
            arrayList.add(fVar2);
            HydrationStatus hydrationStatus3 = HydrationStatus.f55068d;
            HorizontalScaleView.f fVar3 = new HorizontalScaleView.f(ay.b.u(hydrationStatus3.d(), g11), 10, context.getColor(hydrationStatus3.a()));
            fVar3.f46631d = 10;
            arrayList.add(fVar3);
            g11.J();
            bVar = g11;
            y3.c(null, ay.b.u(C1987R.string.you_result_explain_section, g11), null, null, 0.0f, 0L, s1.b.b(g11, 563907896, new b(d11, dVar, decimalFormat, arrayList)), bVar, 1572864, 61);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new c(d11, i11));
        }
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final int b0() {
        return C1987R.string.hydration_metric_title;
    }

    @Override // qy.f0
    public final j<i0, h0> c(Context context, ky.d group) {
        u.j(group, "group");
        ky.a c11 = ly.a.c(ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY, group);
        if (c11 != null) {
            double f11 = c11.f();
            ArrayList arrayList = new ArrayList();
            HydrationStatus hydrationStatus = HydrationStatus.f55068d;
            HorizontalScaleView.f fVar = new HorizontalScaleView.f(context.getString(hydrationStatus.d()), 50, context.getColor(hydrationStatus.a()));
            fVar.f46631d = 50;
            fVar.f46633f = false;
            arrayList.add(fVar);
            HydrationStatus hydrationStatus2 = HydrationStatus.f55069e;
            HorizontalScaleView.f fVar2 = new HorizontalScaleView.f(context.getString(hydrationStatus2.d()), 100, context.getColor(hydrationStatus2.a()));
            fVar2.f46631d = 100;
            arrayList.add(fVar2);
            HydrationStatus hydrationStatus3 = HydrationStatus.f55070f;
            HorizontalScaleView.f fVar3 = new HorizontalScaleView.f(context.getString(hydrationStatus3.d()), 50, context.getColor(hydrationStatus3.a()));
            fVar3.f46631d = 50;
            fVar3.f46633f = false;
            arrayList.add(fVar3);
            double pow = Math.pow(10.0d, 2);
            int a11 = an0.a.a(((Math.rint(((f11 - 1.027d) / (-0.00727273d)) * pow) / pow) * 100) / 2.06d);
            if (a11 < 0) {
                a11 = 0;
            }
            if (f11 <= 1.005d) {
                hydrationStatus = hydrationStatus3;
            } else if (f11 < 1.02d) {
                hydrationStatus = hydrationStatus2;
            }
            ne0.a aVar = new ne0.a(a11, hydrationStatus);
            h0 h0Var = new h0(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1000.0d, aVar.a(), ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY, 1.0f, arrayList, 192);
            HydrationStatus b10 = aVar.b();
            return new j<>(new i0(aVar.a(), ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY, b10.a(), context.getString(b10.d())), h0Var);
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
        return ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY;
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final List<Period> getPeriodList() {
        return x.V(Period.f43720e);
    }

    @Override // com.withings.measure.detail.ui.screen.MeasureDetailScreen
    public final com.withings.measure.detail.ui.screen.a h3(oy.d viewBinding) {
        u.j(viewBinding, "viewBinding");
        return null;
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
