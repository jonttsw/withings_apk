package com.withings.location.repository.ws.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.GpsLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import ym0.l;
/* compiled from: GpsLocationSerializer.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u0016j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/location/repository/ws/model/GpsLocationSerializer;", "", "Lnm0/y;", "initTypeValuesSetter", "()V", "", "", "getTypes", "()Ljava/util/List;", "", NavigationArguments.USER_ID, "Lcom/withings/location/model/VasistasSeries;", "series", "Lcom/withings/location/model/GpsLocation;", "getGpsLocations", "(JLcom/withings/location/model/VasistasSeries;)Ljava/util/List;", "locations", "getVasistasSeries", "(Ljava/util/List;)Lcom/withings/location/model/VasistasSeries;", "", "getTypesAsString", "()Ljava/lang/String;", "Ljava/util/HashMap;", "Lcom/withings/location/repository/ws/model/GpsLocationSerializer$MeasureGetter;", "Lkotlin/collections/HashMap;", "measuresGetter", "Ljava/util/HashMap;", "<init>", "MeasureGetter", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GpsLocationSerializer {
    private final HashMap<Integer, MeasureGetter> measuresGetter = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GpsLocationSerializer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withings/location/repository/ws/model/GpsLocationSerializer$MeasureGetter;", "", "Lcom/withings/location/model/GpsLocation;", "location", "", "getValue", "(Lcom/withings/location/model/GpsLocation;)D", "Lkotlin/Function1;", "getter", "Lym0/l;", "getGetter", "()Lym0/l;", "<init>", "(Lym0/l;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class MeasureGetter {
        private final l<GpsLocation, Double> getter;

        /* JADX WARN: Multi-variable type inference failed */
        public MeasureGetter(l<? super GpsLocation, Double> getter) {
            u.j(getter, "getter");
            this.getter = getter;
        }

        public final l<GpsLocation, Double> getGetter() {
            return this.getter;
        }

        public final double getValue(GpsLocation location) {
            u.j(location, "location");
            return this.getter.invoke(location).doubleValue();
        }
    }

    @Inject
    public GpsLocationSerializer() {
        initTypeValuesSetter();
    }

    private final List<Integer> getTypes() {
        return x.W(72, 96, 97, 101, 98, 99);
    }

    private final void initTypeValuesSetter() {
        this.measuresGetter.put(72, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$1.INSTANCE));
        this.measuresGetter.put(96, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$2.INSTANCE));
        this.measuresGetter.put(97, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$3.INSTANCE));
        this.measuresGetter.put(101, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$4.INSTANCE));
        this.measuresGetter.put(98, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$5.INSTANCE));
        this.measuresGetter.put(99, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$6.INSTANCE));
        this.measuresGetter.put(100, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$7.INSTANCE));
        this.measuresGetter.put(188, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$8.INSTANCE));
        this.measuresGetter.put(187, new MeasureGetter(GpsLocationSerializer$initTypeValuesSetter$9.INSTANCE));
    }

    public final List<GpsLocation> getGpsLocations(long j5, com.withings.location.model.VasistasSeries series) {
        double d11;
        double d12;
        float f11;
        float f12;
        float f13;
        Iterator it;
        float f14;
        float f15;
        Integer num;
        float f16;
        u.j(series, "series");
        List<Integer> types = series.getTypes();
        List<List<Double>> vasistas = series.getVasistas();
        ArrayList arrayList = new ArrayList(x.y(vasistas, 10));
        Iterator it2 = vasistas.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 >= 0) {
                List list = (List) next;
                DateTime dateTime = series.getDates().get(i11);
                GpsLocation.MetaData metaData = new GpsLocation.MetaData(j5, true);
                Integer valueOf = Integer.valueOf(types.indexOf(98));
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                double d13 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                if (valueOf != null) {
                    d11 = ((Number) list.get(valueOf.intValue())).doubleValue();
                } else {
                    d11 = 0.0d;
                }
                Integer valueOf2 = Integer.valueOf(types.indexOf(99));
                if (valueOf2.intValue() < 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    d12 = ((Number) list.get(valueOf2.intValue())).doubleValue();
                } else {
                    d12 = 0.0d;
                }
                Integer valueOf3 = Integer.valueOf(types.indexOf(97));
                if (valueOf3.intValue() < 0) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    d13 = ((Number) list.get(valueOf3.intValue())).doubleValue();
                }
                GpsLocation.Position position = new GpsLocation.Position(d11, d12, d13);
                Integer valueOf4 = Integer.valueOf(types.indexOf(96));
                if (valueOf4.intValue() < 0) {
                    valueOf4 = null;
                }
                if (valueOf4 != null) {
                    f11 = (float) ((Number) list.get(valueOf4.intValue())).doubleValue();
                } else {
                    f11 = 0.0f;
                }
                Integer valueOf5 = Integer.valueOf(types.indexOf(101));
                if (valueOf5.intValue() < 0) {
                    valueOf5 = null;
                }
                if (valueOf5 != null) {
                    f12 = (float) ((Number) list.get(valueOf5.intValue())).doubleValue();
                } else {
                    f12 = 0.0f;
                }
                Integer valueOf6 = Integer.valueOf(types.indexOf(187));
                if (valueOf6.intValue() < 0) {
                    valueOf6 = null;
                }
                if (valueOf6 != null) {
                    f13 = (float) ((Number) list.get(valueOf6.intValue())).doubleValue();
                } else {
                    f13 = 0.0f;
                }
                Integer valueOf7 = Integer.valueOf(types.indexOf(188));
                if (valueOf7.intValue() < 0) {
                    valueOf7 = null;
                }
                if (valueOf7 != null) {
                    it = it2;
                    f14 = (float) ((Number) list.get(valueOf7.intValue())).doubleValue();
                } else {
                    it = it2;
                    f14 = 0.0f;
                }
                GpsLocation.Accuracy accuracy = new GpsLocation.Accuracy(f11, f12, f13, f14);
                Integer valueOf8 = Integer.valueOf(types.indexOf(72));
                if (valueOf8.intValue() < 0) {
                    valueOf8 = null;
                }
                if (valueOf8 != null) {
                    f15 = (float) ((Number) list.get(valueOf8.intValue())).doubleValue();
                } else {
                    f15 = 0.0f;
                }
                Integer valueOf9 = Integer.valueOf(types.indexOf(100));
                if (valueOf9.intValue() >= 0) {
                    num = valueOf9;
                } else {
                    num = null;
                }
                if (num != null) {
                    f16 = (float) ((Number) list.get(num.intValue())).doubleValue();
                } else {
                    f16 = 0.0f;
                }
                arrayList.add(new GpsLocation(-1L, dateTime, metaData, position, accuracy, f15, f16));
                i11 = i12;
                it2 = it;
            } else {
                x.K0();
                throw null;
            }
        }
        return arrayList;
    }

    public final String getTypesAsString() {
        return x.R(getTypes(), ",", null, null, null, 62);
    }

    public final com.withings.location.model.VasistasSeries getVasistasSeries(List<GpsLocation> locations) {
        double d11;
        u.j(locations, "locations");
        List<Integer> types = getTypes();
        List<GpsLocation> list = locations;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (GpsLocation gpsLocation : list) {
            arrayList.add(gpsLocation.getDate());
        }
        List<Integer> list2 = types;
        List Q0 = x.Q0(list2);
        ArrayList arrayList2 = new ArrayList(x.y(list, 10));
        for (GpsLocation gpsLocation2 : list) {
            ArrayList arrayList3 = new ArrayList(x.y(list2, 10));
            for (Number number : list2) {
                MeasureGetter measureGetter = this.measuresGetter.get(Integer.valueOf(number.intValue()));
                if (measureGetter != null) {
                    d11 = measureGetter.getValue(gpsLocation2);
                } else {
                    d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                }
                arrayList3.add(Double.valueOf(d11));
            }
            arrayList2.add(arrayList3);
        }
        return new com.withings.location.model.VasistasSeries(1054, "byvasistas", arrayList, Q0, arrayList2, 0, 32, null);
    }
}
