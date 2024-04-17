package com.withings.workout.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import com.withings.wiscale2.C1987R;
import com.withings.workout.ui.GpsLocationMapView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import vh.h;
import vj0.f;
import ym0.l;
/* compiled from: WorkoutMapDelegate.kt */
/* loaded from: classes5.dex */
public final class a implements GpsLocationMapView.b {

    /* renamed from: a  reason: collision with root package name */
    private int[] f62965a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f62966b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f62967c;

    /* renamed from: d  reason: collision with root package name */
    private Object f62968d;

    /* renamed from: e  reason: collision with root package name */
    private Object f62969e;

    /* compiled from: WorkoutMapDelegate.kt */
    /* renamed from: com.withings.workout.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0798a extends w implements ym0.a<List<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProviderMapView f62970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f62971b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<GpsLocation> f62972c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GpsLocationsSummary f62973d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0798a(ProviderMapView providerMapView, a aVar, List<GpsLocation> list, GpsLocationsSummary gpsLocationsSummary) {
            super(0);
            this.f62970a = providerMapView;
            this.f62971b = aVar;
            this.f62972c = list;
            this.f62973d = gpsLocationsSummary;
        }

        @Override // ym0.a
        public final List<? extends Object> invoke() {
            ArrayList d11 = a.d(this.f62971b, this.f62972c, this.f62973d);
            ProviderMapView providerMapView = this.f62970a;
            return providerMapView.h(d11, Integer.valueOf(androidx.core.content.a.getColor(providerMapView.getContext(), C1987R.color.color_text_quaternary)));
        }
    }

    /* compiled from: WorkoutMapDelegate.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements l<List<? extends Object>, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<GpsLocation> f62975b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ProviderMapView f62976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<GpsLocation> list, ProviderMapView providerMapView) {
            super(1);
            this.f62975b = list;
            this.f62976c = providerMapView;
        }

        @Override // ym0.l
        public final y invoke(List<? extends Object> list) {
            Object obj;
            List<? extends Object> list2 = list;
            ProviderMapView providerMapView = this.f62976c;
            if (list2 != null) {
                for (Object obj2 : list2) {
                    providerMapView.c(obj2);
                }
            }
            List<GpsLocation> list3 = this.f62975b;
            GpsLocation gpsLocation = (GpsLocation) x.K(list3);
            Object obj3 = null;
            a aVar = a.this;
            if (gpsLocation != null) {
                Object obj4 = aVar.f62968d;
                providerMapView.getClass();
                ProviderMapView.m(obj4);
                Bitmap bitmap = aVar.f62966b;
                if (bitmap != null) {
                    obj = providerMapView.f(f.i(gpsLocation), bitmap);
                } else {
                    u.s("startBitmap");
                    throw null;
                }
            } else {
                obj = null;
            }
            aVar.f62968d = obj;
            GpsLocation gpsLocation2 = (GpsLocation) x.U(list3);
            if (gpsLocation2 != null) {
                Object obj5 = aVar.f62969e;
                providerMapView.getClass();
                ProviderMapView.m(obj5);
                Bitmap bitmap2 = aVar.f62967c;
                if (bitmap2 != null) {
                    obj3 = providerMapView.f(f.i(gpsLocation2), bitmap2);
                } else {
                    u.s("endBitmap");
                    throw null;
                }
            }
            aVar.f62969e = obj3;
            return y.f85009a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
        r1.add(new vj0.c(kotlin.collections.x.i0(r3), r4, r6));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList d(com.withings.workout.ui.a r11, java.util.List r12, com.withings.location.model.GpsLocationsSummary r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.workout.ui.a.d(com.withings.workout.ui.a, java.util.List, com.withings.location.model.GpsLocationsSummary):java.util.ArrayList");
    }

    @Override // com.withings.workout.ui.GpsLocationMapView.b
    public final void a(Context context) {
        Bitmap a11;
        Bitmap a12;
        Drawable drawable = androidx.core.content.a.getDrawable(context, C1987R.drawable.workout_path_start);
        u.g(drawable);
        a11 = androidx.core.graphics.drawable.b.a(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), null);
        this.f62966b = a11;
        Drawable drawable2 = androidx.core.content.a.getDrawable(context, C1987R.drawable.workout_path_end);
        u.g(drawable2);
        a12 = androidx.core.graphics.drawable.b.a(drawable2, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), null);
        this.f62967c = a12;
        this.f62965a = x.P0(ah.u.z(context, true));
        androidx.core.content.a.getColor(context, C1987R.color.color_text_quaternary);
    }

    @Override // com.withings.workout.ui.GpsLocationMapView.b
    public final int b() {
        return C1987R.raw.workout_map_style;
    }

    @Override // com.withings.workout.ui.GpsLocationMapView.b
    public final void c(ProviderMapView mapView, List<GpsLocation> locations, GpsLocationsSummary gpsLocationsSummary) {
        u.j(mapView, "mapView");
        u.j(locations, "locations");
        h.h().d(new C0798a(mapView, this, locations, gpsLocationsSummary)).s(new b(locations, mapView));
    }
}
