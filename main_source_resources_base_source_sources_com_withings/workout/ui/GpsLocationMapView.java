package com.withings.workout.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.maps.GoogleMap;
import com.huawei.hms.maps.HuaweiMap;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.GpsLocationsSummary;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import ym0.l;
import ym0.p;
/* compiled from: GpsLocationMapView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/withings/workout/ui/GpsLocationMapView;", "Lcom/withings/workout/ui/ProviderMapView;", "Lcom/withings/workout/ui/GpsLocationMapView$b;", "delegate", "Lnm0/y;", "setupMap", "(Lcom/withings/workout/ui/GpsLocationMapView$b;)V", "Lkotlin/Function0;", "f", "Lym0/a;", "getClickListener", "()Lym0/a;", "setClickListener", "(Lym0/a;)V", "clickListener", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GpsLocationMapView extends ProviderMapView {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f62950j = 0;

    /* renamed from: f  reason: collision with root package name */
    private ym0.a<y> f62951f;

    /* renamed from: g  reason: collision with root package name */
    private List<GpsLocation> f62952g;

    /* renamed from: h  reason: collision with root package name */
    private b f62953h;

    /* renamed from: i  reason: collision with root package name */
    private GpsLocationsSummary f62954i;

    /* compiled from: GpsLocationMapView.kt */
    /* loaded from: classes5.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final float f62955a = 10.0f;

        /* renamed from: b  reason: collision with root package name */
        private int f62956b;

        @Override // com.withings.workout.ui.GpsLocationMapView.b
        public final void a(Context context) {
            u.j(context, "context");
            int i11 = GpsLocationMapView.f62950j;
            this.f62956b = androidx.core.content.a.getColor(context, C1987R.color.statusGood);
        }

        @Override // com.withings.workout.ui.GpsLocationMapView.b
        public final int b() {
            return C1987R.raw.google_workout_map_fullscreen_style;
        }

        @Override // com.withings.workout.ui.GpsLocationMapView.b
        public final void c(ProviderMapView mapView, List<GpsLocation> locations, GpsLocationsSummary gpsLocationsSummary) {
            u.j(mapView, "mapView");
            u.j(locations, "locations");
            mapView.d(locations, this.f62956b, this.f62955a);
            mapView.setVisibility(0);
        }
    }

    /* compiled from: GpsLocationMapView.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void a(Context context);

        int b();

        void c(ProviderMapView providerMapView, List<GpsLocation> list, GpsLocationsSummary gpsLocationsSummary);
    }

    /* compiled from: GpsLocationMapView.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements p<GoogleMap, HuaweiMap, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f62958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(2);
            this.f62958b = bVar;
        }

        @Override // ym0.p
        public final y invoke(GoogleMap googleMap, HuaweiMap huaweiMap) {
            GpsLocationMapView gpsLocationMapView = GpsLocationMapView.this;
            gpsLocationMapView.setVisibility(4);
            gpsLocationMapView.setupMap(this.f62958b);
            GpsLocationMapView.t(gpsLocationMapView);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GpsLocationMapView.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements l<vj0.a, y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(vj0.a aVar) {
            ym0.a<y> clickListener = GpsLocationMapView.this.getClickListener();
            if (clickListener != null) {
                clickListener.invoke();
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GpsLocationMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupMap(b bVar) {
        int i11;
        if (bVar != null) {
            i11 = bVar.b();
        } else {
            i11 = C1987R.raw.google_workout_map_fullscreen_style;
        }
        ProviderMapView.i(this, i11, C1987R.raw.huawei_workout_map_fullscreen_style, true, new d());
    }

    public static final void t(GpsLocationMapView gpsLocationMapView) {
        gpsLocationMapView.getClass();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new com.withings.workout.ui.b(gpsLocationMapView, null), 3, null);
    }

    public final ym0.a<y> getClickListener() {
        return this.f62951f;
    }

    public final void setClickListener(ym0.a<y> aVar) {
        this.f62951f = aVar;
    }

    public final void u(List<GpsLocation> locations, b bVar, GpsLocationsSummary gpsLocationsSummary) {
        Class<?> cls;
        u.j(locations, "locations");
        if (u.e(this.f62952g, locations)) {
            if (bVar != null) {
                cls = bVar.getClass();
            } else {
                cls = null;
            }
            if (u.e(cls, this.f62953h.getClass()) && u.e(gpsLocationsSummary, this.f62954i)) {
                return;
            }
        }
        this.f62952g = locations;
        this.f62954i = gpsLocationsSummary;
        if (bVar != null) {
            Context context = getContext();
            u.i(context, "getContext(...)");
            bVar.a(context);
            this.f62953h = bVar;
        }
        if (j()) {
            if (bVar != null) {
                setupMap(bVar);
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new com.withings.workout.ui.b(this, null), 3, null);
            return;
        }
        k();
        g(new c(bVar));
    }

    public /* synthetic */ GpsLocationMapView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsLocationMapView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f62952g = i0.f76187a;
        a aVar = new a();
        aVar.a(context);
        this.f62953h = aVar;
    }
}
