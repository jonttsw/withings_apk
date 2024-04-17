package com.withings.core.analytics;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.content.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import sm0.b;
/* compiled from: LocationStatusInfo.kt */
/* loaded from: classes3.dex */
public final class LocationStatusInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocationStatusInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/core/analytics/LocationStatusInfo$LocationStatus;", "", "core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class LocationStatus {

        /* renamed from: a  reason: collision with root package name */
        public static final LocationStatus f35303a;

        /* renamed from: b  reason: collision with root package name */
        public static final LocationStatus f35304b;

        /* renamed from: c  reason: collision with root package name */
        public static final LocationStatus f35305c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ LocationStatus[] f35306d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.core.analytics.LocationStatusInfo$LocationStatus] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.core.analytics.LocationStatusInfo$LocationStatus] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.core.analytics.LocationStatusInfo$LocationStatus] */
        static {
            ?? r02 = new Enum("Always", 0);
            f35303a = r02;
            ?? r12 = new Enum("WhileInUse", 1);
            f35304b = r12;
            ?? r22 = new Enum("Disabled", 2);
            f35305c = r22;
            LocationStatus[] locationStatusArr = {r02, r12, r22};
            f35306d = locationStatusArr;
            b.a(locationStatusArr);
        }

        private LocationStatus() {
            throw null;
        }

        public static LocationStatus valueOf(String str) {
            return (LocationStatus) Enum.valueOf(LocationStatus.class, str);
        }

        public static LocationStatus[] values() {
            return (LocationStatus[]) f35306d.clone();
        }
    }

    public static LocationStatus a(Context context) {
        int i11;
        u.j(context, "context");
        if (Build.VERSION.SDK_INT >= 29) {
            i11 = a.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        } else {
            i11 = 0;
        }
        int checkSelfPermission = a.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        if (i11 == 0 && checkSelfPermission == 0) {
            return LocationStatus.f35303a;
        }
        if (checkSelfPermission == 0 && i11 == -1) {
            return LocationStatus.f35304b;
        }
        return LocationStatus.f35305c;
    }

    public static boolean b(Context context) {
        List<String> list;
        u.j(context, "context");
        LocationManager locationManager = (LocationManager) a.getSystemService(context, LocationManager.class);
        Object obj = null;
        if (locationManager != null) {
            list = locationManager.getProviders(true);
        } else {
            list = null;
        }
        if (list == null) {
            list = i0.f76187a;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (u.e((String) next, "gps")) {
                obj = next;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }
}
