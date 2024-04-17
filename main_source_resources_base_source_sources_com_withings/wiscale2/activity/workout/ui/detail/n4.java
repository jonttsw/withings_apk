package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.GpsSummaryKt;
import com.withings.workout.ui.GpsLocationMapView;
import ga.f;
import java.util.List;
import u8.b;
/* compiled from: WorkoutHeader.kt */
/* loaded from: classes4.dex */
public final class n4 {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f49477a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f49478b;

    /* renamed from: c  reason: collision with root package name */
    private final GpsLocationMapView f49479c;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f49480d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f49481e;

    /* renamed from: f  reason: collision with root package name */
    private final View f49482f;

    /* renamed from: g  reason: collision with root package name */
    private final View f49483g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f49484h;

    /* renamed from: i  reason: collision with root package name */
    private final ImageView f49485i;

    /* renamed from: j  reason: collision with root package name */
    private final ProgressBar f49486j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.lifecycle.p0 f49487k;

    public n4(ConstraintLayout constraintLayout, final ym0.l lVar) {
        this.f49477a = (TextView) constraintLayout.findViewById(C1987R.id.category_title);
        this.f49478b = (ImageView) constraintLayout.findViewById(C1987R.id.category_image);
        GpsLocationMapView gpsLocationMapView = (GpsLocationMapView) constraintLayout.findViewById(C1987R.id.map);
        this.f49479c = gpsLocationMapView;
        this.f49480d = (ImageView) constraintLayout.findViewById(C1987R.id.mapImage);
        this.f49481e = (ImageView) constraintLayout.findViewById(C1987R.id.image);
        this.f49482f = constraintLayout.findViewById(C1987R.id.background_image);
        this.f49483g = constraintLayout.findViewById(C1987R.id.foreground_image);
        this.f49484h = (TextView) constraintLayout.findViewById(C1987R.id.city_textview);
        final ImageView imageView = (ImageView) constraintLayout.findViewById(C1987R.id.zoom_button);
        this.f49485i = imageView;
        this.f49486j = (ProgressBar) constraintLayout.findViewById(C1987R.id.loading);
        this.f49487k = new androidx.lifecycle.p0(this, 5);
        gpsLocationMapView.setClickListener(new m4(lVar, this));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.l4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ym0.l onOpenMapListener = ym0.l.this;
                kotlin.jvm.internal.u.j(onOpenMapListener, "$onOpenMapListener");
                n4 this$0 = this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                onOpenMapListener.invoke(this$0);
                imageView.setEnabled(false);
            }
        });
    }

    public static void a(n4 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        GpsLocationMapView mapView = this$0.f49479c;
        kotlin.jvm.internal.u.i(mapView, "mapView");
        mapView.setVisibility(0);
        ImageView zoomButton = this$0.f49485i;
        kotlin.jvm.internal.u.i(zoomButton, "zoomButton");
        zoomButton.setVisibility(0);
        ProgressBar loading = this$0.f49486j;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(8);
    }

    public final void d(c4 state) {
        boolean z5;
        int w11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        GpsLocationsSummary gpsLocationsSummary;
        int i16;
        kotlin.jvm.internal.u.j(state, "state");
        String a11 = state.a();
        TextView textView = this.f49477a;
        textView.setText(a11);
        ImageView imageView = this.f49478b;
        Context context = imageView.getContext();
        int i17 = 0;
        if (state.b() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            kotlin.jvm.internal.u.g(context);
            w11 = ah.u.w(16842809, context, -65281);
        } else {
            kotlin.jvm.internal.u.g(context);
            w11 = ah.u.w(16842806, context, -65281);
        }
        textView.setTextColor(w11);
        TextView textView2 = this.f49484h;
        textView2.setTextColor(w11);
        boolean z11 = state instanceof x;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (z11) {
            imageView.setImageResource(((x) state).c());
        }
        ImageView imageView2 = this.f49481e;
        kotlin.jvm.internal.u.i(imageView2, "imageView");
        if (state.b() != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView2.setVisibility(i12);
        View backgroundImageView = this.f49482f;
        kotlin.jvm.internal.u.i(backgroundImageView, "backgroundImageView");
        if (state.b() != null) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        backgroundImageView.setVisibility(i13);
        View foregroundImageView = this.f49483g;
        kotlin.jvm.internal.u.i(foregroundImageView, "foregroundImageView");
        if (state.b() != null) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        foregroundImageView.setVisibility(i14);
        if (state.b() != null) {
            i15 = 17170443;
        } else {
            i15 = 17170444;
        }
        ImageView imageView3 = this.f49485i;
        Context context2 = imageView3.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        imageView3.setImageDrawable(y70.a.a(C1987R.drawable.icon_medium_navigation_zoom, context2, i15));
        imageView3.setEnabled(true);
        Object b10 = state.b();
        if (b10 != null) {
            Context context3 = imageView2.getContext();
            kotlin.jvm.internal.u.i(context3, "getContext(...)");
            f.a aVar = new f.a(context3);
            aVar.d(b10);
            aVar.r(new a());
            ga.f b11 = aVar.b();
            Context context4 = imageView2.getContext();
            kotlin.jvm.internal.u.i(context4, "getContext(...)");
            w9.a.a(context4).d(b11);
        }
        boolean z12 = state instanceof v0;
        androidx.lifecycle.p0 p0Var = this.f49487k;
        GpsLocationMapView mapView = this.f49479c;
        if (z12) {
            v0 v0Var = (v0) state;
            kotlin.jvm.internal.u.i(mapView, "mapView");
            if (mapView.getVisibility() != 0) {
                ProgressBar loading = this.f49486j;
                kotlin.jvm.internal.u.i(loading, "loading");
                loading.setVisibility(0);
            }
            List<GpsLocation> e11 = v0Var.e();
            GpsLocationMapView.b f11 = v0Var.f();
            GpsSummary d11 = v0Var.d();
            if (d11 != null) {
                gpsLocationsSummary = GpsSummaryKt.toGpsLocationsSummary(d11);
            } else {
                gpsLocationsSummary = null;
            }
            mapView.u(e11, f11, gpsLocationsSummary);
            mapView.postDelayed(p0Var, 200L);
            textView2.setText(v0Var.c());
            if (v0Var.c() != null) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            textView2.setVisibility(i16);
        } else {
            textView2.setVisibility(8);
            kotlin.jvm.internal.u.i(mapView, "mapView");
            mapView.setVisibility(8);
            mapView.removeCallbacks(p0Var);
            imageView3.setVisibility(8);
        }
        boolean z13 = state instanceof o1;
        ImageView mapImageView = this.f49480d;
        if (z13) {
            kotlin.jvm.internal.u.i(mapImageView, "mapImageView");
            String c11 = ((o1) state).c();
            w9.g a12 = w9.a.a(mapImageView.getContext());
            f.a aVar2 = new f.a(mapImageView.getContext());
            aVar2.d(c11);
            aVar2.q(mapImageView);
            a12.d(aVar2.b());
        }
        kotlin.jvm.internal.u.i(mapImageView, "mapImageView");
        if (!z13) {
            i17 = 8;
        }
        mapImageView.setVisibility(i17);
    }

    /* compiled from: ImageRequest.kt */
    /* loaded from: classes4.dex */
    public static final class a implements ia.a {
        public a() {
        }

        @Override // ia.a
        public final void onSuccess(Drawable drawable) {
            Bitmap a11;
            int i11;
            n4 n4Var = n4.this;
            n4Var.f49481e.setImageDrawable(drawable);
            a11 = androidx.core.graphics.drawable.b.a(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), null);
            b.C1696b c1696b = new b.C1696b(a11);
            c1696b.b(n4Var.f49477a.getLeft(), n4Var.f49477a.getTop(), n4Var.f49477a.getRight(), n4Var.f49477a.getBottom());
            u8.b a12 = c1696b.a();
            TextView textView = n4Var.f49477a;
            b.d b10 = a12.b(u8.c.f101585h);
            if (b10 != null) {
                i11 = b10.e();
            } else {
                i11 = -1;
            }
            textView.setTextColor(i11);
        }

        @Override // ia.a
        public final void onError(Drawable drawable) {
        }

        @Override // ia.a
        public final void onStart(Drawable drawable) {
        }
    }
}
