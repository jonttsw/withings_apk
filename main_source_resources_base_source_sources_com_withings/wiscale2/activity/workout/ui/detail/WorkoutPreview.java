package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import com.withings.webservices.legacy.withings.model.timeline.SnapshotItemData;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.GpsSummaryKt;
import com.withings.workout.ui.GpsLocationMapView;
import com.withings.workout.ui.ProviderMapView;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WorkoutPreview.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/detail/WorkoutPreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withings/workout/ui/ProviderMapView;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getMapView", "()Lcom/withings/workout/ui/ProviderMapView;", "mapView", "Landroid/widget/ImageView;", "u", "getSnapshot", "()Landroid/widget/ImageView;", SnapshotItemData.WS_TYPE, ConstantsWs.JSON_SESSION_KEY_VALUE, "getCategoryView", "categoryView", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutPreview extends ConstraintLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f49084x = 0;

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f49085t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f49086u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f49087v;

    /* renamed from: w  reason: collision with root package name */
    private Runnable f49088w;

    /* compiled from: WorkoutPreview.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) WorkoutPreview.this.findViewById(C1987R.id.category);
        }
    }

    /* compiled from: WorkoutPreview.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<ProviderMapView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ProviderMapView invoke() {
            return (ProviderMapView) WorkoutPreview.this.findViewById(C1987R.id.map);
        }
    }

    /* compiled from: WorkoutPreview.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) WorkoutPreview.this.findViewById(C1987R.id.snapshot);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkoutPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    private final void A() {
        ProviderMapView mapView = getMapView();
        kotlin.jvm.internal.u.i(mapView, "<get-mapView>(...)");
        mapView.setVisibility(8);
        ImageView snapshot = getSnapshot();
        kotlin.jvm.internal.u.i(snapshot, "<get-snapshot>(...)");
        snapshot.setVisibility(8);
        ImageView categoryView = getCategoryView();
        kotlin.jvm.internal.u.i(categoryView, "<get-categoryView>(...)");
        categoryView.setVisibility(8);
        if (getMapView().j()) {
            getMapView().e();
        }
        vh.h.b(this);
        if (this.f49088w != null) {
            getMapView().removeCallbacks(this.f49088w);
            this.f49088w = null;
        }
    }

    private final void B(Object obj) {
        A();
        ImageView snapshot = getSnapshot();
        kotlin.jvm.internal.u.i(snapshot, "<get-snapshot>(...)");
        snapshot.setVisibility(0);
        ImageView snapshot2 = getSnapshot();
        kotlin.jvm.internal.u.i(snapshot2, "<get-snapshot>(...)");
        f5.a(snapshot2, obj, false, getSnapshot().getContext().getColor(C1987R.color.datavizMonochromaticNeutral1));
    }

    private final ImageView getCategoryView() {
        return (ImageView) this.f49087v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProviderMapView getMapView() {
        return (ProviderMapView) this.f49085t.getValue();
    }

    private final ImageView getSnapshot() {
        return (ImageView) this.f49086u.getValue();
    }

    public static void t(WorkoutPreview this$0, long j5) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.getMapView().n(new h7(this$0, j5));
    }

    public static final void w(WorkoutPreview workoutPreview, GpsLocationMapView.b bVar, Intent intent) {
        ProviderMapView mapView = workoutPreview.getMapView();
        int b10 = bVar.b();
        kotlin.jvm.internal.u.g(mapView);
        ProviderMapView.i(mapView, b10, C1987R.raw.huawei_workout_map_fullscreen_style, false, new i7(workoutPreview, intent));
    }

    public static final void x(WorkoutPreview workoutPreview, m7 m7Var, GpsLocationMapView.b bVar) {
        GpsLocationsSummary gpsLocationsSummary;
        workoutPreview.getClass();
        List<GpsLocation> b10 = m7Var.b();
        if (b10 == null) {
            b10 = kotlin.collections.i0.f76187a;
        }
        if (!b10.isEmpty()) {
            workoutPreview.getMapView().o(b10);
            Context context = workoutPreview.getMapView().getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            bVar.a(context);
            ProviderMapView mapView = workoutPreview.getMapView();
            kotlin.jvm.internal.u.i(mapView, "<get-mapView>(...)");
            GpsSummary a11 = m7Var.a();
            if (a11 != null) {
                gpsLocationsSummary = GpsSummaryKt.toGpsLocationsSummary(a11);
            } else {
                gpsLocationsSummary = null;
            }
            bVar.c(mapView, b10, gpsLocationsSummary);
        }
    }

    public static final void z(WorkoutPreview workoutPreview, long j5) {
        workoutPreview.getMapView().l(new k7(workoutPreview, j5));
    }

    public final void C(l7 l7Var) {
        int i11;
        int glyphRes = l7Var.a().getGlyphRes();
        A();
        ImageView categoryView = getCategoryView();
        kotlin.jvm.internal.u.i(categoryView, "<get-categoryView>(...)");
        categoryView.setVisibility(0);
        getCategoryView().setImageResource(glyphRes);
        Object f11 = l7Var.f();
        if (f11 != null) {
            B(f11);
        }
        Object c11 = l7Var.g().c();
        if (c11 != null) {
            B(c11);
        }
        if (l7Var.g().b() != null) {
            long k11 = l7Var.k();
            m7 g11 = l7Var.g();
            Object f12 = l7Var.f();
            Intent b10 = l7Var.b();
            A();
            ImageView snapshot = getSnapshot();
            kotlin.jvm.internal.u.i(snapshot, "<get-snapshot>(...)");
            if (f12 != null) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            snapshot.setVisibility(i11);
            ProviderMapView mapView = getMapView();
            kotlin.jvm.internal.u.i(mapView, "<get-mapView>(...)");
            mapView.setVisibility(0);
            ProviderMapView mapView2 = getMapView();
            mapView2.k();
            mapView2.g(new j7(f12, this, b10, g11, k11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutPreview(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f49085t = nm0.h.b(new b());
        this.f49086u = nm0.h.b(new c());
        this.f49087v = nm0.h.b(new a());
        View.inflate(getContext(), C1987R.layout.view_workout_preview, this);
    }
}
