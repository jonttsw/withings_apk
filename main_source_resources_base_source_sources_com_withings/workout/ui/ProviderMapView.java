package com.withings.workout.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.PolylineOptions;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.HuaweiMapOptions;
import com.huawei.hms.maps.model.LatLngBounds;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.model.GpsLocation;
import com.withings.util.log.Fail;
import com.withings.workout.ui.ProviderMapView;
import e2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.y;
import vj0.f;
import vj0.g;
import ym0.l;
import ym0.p;
/* compiled from: ProviderMapView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/workout/ui/ProviderMapView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class ProviderMapView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f62960e = 0;

    /* renamed from: a  reason: collision with root package name */
    private MapView f62961a;

    /* renamed from: b  reason: collision with root package name */
    private com.huawei.hms.maps.MapView f62962b;

    /* renamed from: c  reason: collision with root package name */
    private GoogleMap f62963c;

    /* renamed from: d  reason: collision with root package name */
    private HuaweiMap f62964d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProviderMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public static void a(ProviderMapView this$0, p onProviderMapReady, GoogleMap it) {
        u.j(this$0, "this$0");
        u.j(onProviderMapReady, "$onProviderMapReady");
        u.j(it, "it");
        this$0.f62963c = it;
        onProviderMapReady.invoke(it, this$0.f62964d);
    }

    public static void b(ProviderMapView this$0, p onProviderMapReady, HuaweiMap huaweiMap) {
        u.j(this$0, "this$0");
        u.j(onProviderMapReady, "$onProviderMapReady");
        this$0.f62964d = huaweiMap;
        onProviderMapReady.invoke(this$0.f62963c, huaweiMap);
    }

    public static void i(ProviderMapView providerMapView, int i11, int i12, boolean z5, l lVar) {
        Context context = providerMapView.getContext();
        u.i(context, "getContext(...)");
        GoogleMap googleMap = providerMapView.f62963c;
        HuaweiMap huaweiMap = providerMapView.f62964d;
        if (googleMap != null) {
            f.e(googleMap, context, i11, false, z5, true, lVar);
        }
        if (huaweiMap != null) {
            f.f(huaweiMap, context, i12, false, z5, true, lVar);
        }
    }

    public static void m(Object obj) {
        Marker marker;
        com.huawei.hms.maps.model.Marker marker2 = null;
        if (obj instanceof Marker) {
            marker = (Marker) obj;
        } else {
            marker = null;
        }
        if (marker != null) {
            marker.remove();
            y yVar = y.f85009a;
            return;
        }
        if (obj instanceof com.huawei.hms.maps.model.Marker) {
            marker2 = (com.huawei.hms.maps.model.Marker) obj;
        }
        if (marker2 != null) {
            marker2.remove();
            y yVar2 = y.f85009a;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (view != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        super.addView(view);
    }

    public final void c(Object polylineOptions) {
        u.j(polylineOptions, "polylineOptions");
        GoogleMap googleMap = this.f62963c;
        if (googleMap != null) {
            googleMap.addPolyline((PolylineOptions) polylineOptions);
        }
        HuaweiMap huaweiMap = this.f62964d;
        if (huaweiMap != null) {
            huaweiMap.addPolyline((com.huawei.hms.maps.model.PolylineOptions) polylineOptions);
        }
    }

    public final void d(List<GpsLocation> locations, int i11, float f11) {
        u.j(locations, "locations");
        GoogleMap googleMap = this.f62963c;
        if (googleMap != null) {
            PolylineOptions geodesic = new PolylineOptions().color(i11).width(f11).geodesic(true);
            List<GpsLocation> list = locations;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (GpsLocation gpsLocation : list) {
                arrayList.add(f.g(gpsLocation));
            }
            googleMap.addPolyline(geodesic.addAll(arrayList));
        }
        HuaweiMap huaweiMap = this.f62964d;
        if (huaweiMap != null) {
            com.huawei.hms.maps.model.PolylineOptions geodesic2 = new com.huawei.hms.maps.model.PolylineOptions().color(i11).width(f11).geodesic(true);
            List<GpsLocation> list2 = locations;
            ArrayList arrayList2 = new ArrayList(x.y(list2, 10));
            for (GpsLocation gpsLocation2 : list2) {
                arrayList2.add(f.h(gpsLocation2));
            }
            huaweiMap.addPolyline(geodesic2.addAll(arrayList2));
        }
    }

    public final void e() {
        GoogleMap googleMap = this.f62963c;
        if (googleMap != null) {
            googleMap.clear();
            googleMap.setMapType(0);
        }
        HuaweiMap huaweiMap = this.f62964d;
        if (huaweiMap != null) {
            huaweiMap.clear();
            huaweiMap.setMapType(0);
        }
    }

    public final Object f(vj0.a aVar, Bitmap bitmap) {
        Marker a11;
        GoogleMap googleMap = this.f62963c;
        if (googleMap == null || (a11 = f.a(googleMap, aVar, bitmap)) == null) {
            HuaweiMap huaweiMap = this.f62964d;
            if (huaweiMap != null) {
                return f.b(huaweiMap, aVar, bitmap);
            }
            return null;
        }
        return a11;
    }

    public final void g(final p<? super GoogleMap, ? super HuaweiMap, y> pVar) {
        MapView mapView = this.f62961a;
        if (mapView != null) {
            mapView.getMapAsync(new OnMapReadyCallback() { // from class: vj0.d
                @Override // com.google.android.gms.maps.OnMapReadyCallback
                public final void onMapReady(GoogleMap googleMap) {
                    ProviderMapView.a(ProviderMapView.this, pVar, googleMap);
                }
            });
        }
        com.huawei.hms.maps.MapView mapView2 = this.f62962b;
        if (mapView2 != null) {
            mapView2.getMapAsync(new com.huawei.hms.maps.OnMapReadyCallback() { // from class: vj0.e
                @Override // com.huawei.hms.maps.OnMapReadyCallback
                public final void onMapReady(HuaweiMap huaweiMap) {
                    ProviderMapView.b(ProviderMapView.this, pVar, huaweiMap);
                }
            });
        }
    }

    public final ArrayList h(ArrayList arrayList, Integer num) {
        GoogleMap googleMap = this.f62963c;
        if (googleMap != null) {
            return f.c(googleMap, arrayList, num);
        }
        HuaweiMap huaweiMap = this.f62964d;
        if (huaweiMap != null) {
            Context context = getContext();
            u.i(context, "getContext(...)");
            return f.d(huaweiMap, context, arrayList, num);
        }
        return null;
    }

    public final boolean j() {
        if (this.f62963c == null && this.f62964d == null) {
            return false;
        }
        return true;
    }

    public final void k() {
        MapView mapView = this.f62961a;
        if (mapView != null) {
            mapView.onCreate(null);
        }
        com.huawei.hms.maps.MapView mapView2 = this.f62962b;
        if (mapView2 != null) {
            mapView2.onCreate(null);
        }
    }

    public final void l(ym0.a<y> aVar) {
        GoogleMap googleMap = this.f62963c;
        if (googleMap != null) {
            googleMap.setOnMapLoadedCallback(new t.u(aVar, 7));
        }
        HuaweiMap huaweiMap = this.f62964d;
        if (huaweiMap != null) {
            huaweiMap.setOnMapLoadedCallback(new androidx.camera.lifecycle.b(aVar, 7));
        }
    }

    public final void n(l<? super Bitmap, y> lVar) {
        GoogleMap googleMap = this.f62963c;
        if (googleMap != null) {
            googleMap.snapshot(new v.a(lVar, 5));
        }
        HuaweiMap huaweiMap = this.f62964d;
        if (huaweiMap != null) {
            huaweiMap.snapshot(new r(lVar, 7));
        }
    }

    public final void o(List<GpsLocation> locations) {
        LatLngBounds latLngBounds;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds2;
        u.j(locations, "locations");
        GoogleMap googleMap = this.f62963c;
        if (googleMap != null) {
            int size = locations.size();
            if (size != 0) {
                if (size != 1) {
                    List<GpsLocation> list = locations;
                    ArrayList arrayList = new ArrayList(x.y(list, 10));
                    for (GpsLocation gpsLocation : list) {
                        arrayList.add(new LatLng(gpsLocation.getPosition().getLatitude(), gpsLocation.getPosition().getLongitude()));
                    }
                    if (!arrayList.isEmpty()) {
                        LatLngBounds.Builder builder = new LatLngBounds.Builder();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            builder.include((LatLng) it.next());
                        }
                        latLngBounds2 = builder.build();
                    } else {
                        latLngBounds2 = null;
                    }
                    if (latLngBounds2 != null) {
                        googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds2, 0));
                    }
                } else {
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(f.g((GpsLocation) x.I(locations)), 14.0f));
                }
            } else {
                Fail.j("Should not update GoogleMap bounds if GpsLocation list is empty");
            }
        }
        HuaweiMap huaweiMap = this.f62964d;
        if (huaweiMap != null) {
            int size2 = locations.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    List<GpsLocation> list2 = locations;
                    ArrayList arrayList2 = new ArrayList(x.y(list2, 10));
                    for (GpsLocation gpsLocation2 : list2) {
                        arrayList2.add(new com.huawei.hms.maps.model.LatLng(gpsLocation2.getPosition().getLatitude(), gpsLocation2.getPosition().getLongitude()));
                    }
                    if (!arrayList2.isEmpty()) {
                        LatLngBounds.Builder builder2 = new LatLngBounds.Builder();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            builder2.include((com.huawei.hms.maps.model.LatLng) it2.next());
                        }
                        latLngBounds = builder2.build();
                    } else {
                        latLngBounds = null;
                    }
                    huaweiMap.moveCamera(com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
                    return;
                }
                huaweiMap.moveCamera(com.huawei.hms.maps.CameraUpdateFactory.newLatLngZoom(f.h((GpsLocation) x.I(locations)), 14.0f));
                return;
            }
            Fail.j("Should not update GoogleMap bounds if GpsLocation list is empty");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProviderMapView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f103942a);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        mm.a aVar = mm.a.f82252a;
        if (aVar.a()) {
            MapView mapView = new MapView(context, new GoogleMapOptions().liteMode(z5));
            this.f62961a = mapView;
            addView(mapView);
        } else if (aVar.b()) {
            com.huawei.hms.maps.MapView mapView2 = new com.huawei.hms.maps.MapView(context, new HuaweiMapOptions().liteMode(z5));
            this.f62962b = mapView2;
            addView(mapView2);
        }
        y yVar = y.f85009a;
        obtainStyledAttributes.recycle();
    }
}
